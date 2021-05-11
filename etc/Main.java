package com.doosan.test.optional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// ��ũ : https://www.daleseo.com/java8-optional-before/
		Order order = new Order();
		String city = getCityOfMemberFromOrder(order); // returns null
		System.out.println(city.length()); // throws NPE!
		/*
		 * NPE �߻� �ó�����
		 * 1. order �� ����� null
		 * 2. order.getMember() �� ����� null
		 * 3. order.getMember().getAddress() �� ����� null
		 * 4. order.getMember().getAddress().getCity() �� ����� null
		 */
		
		
		Optional<Member> maybeMember = Optional.empty(); // �� Optional ��ü ����, �̱��� �ν��Ͻ�
		Optional<Member> maybeMember1 = Optional.of(new Member()); // null �� �ƴ� ��ü�� ��� �ִ� Optional ��ü, null �� �Ѿ�� ��� NPE�� ����
		
		Optional<Member> maybeMember2 = Optional.ofNullable(new Member()); // null ���� �ƴ��� Ȯ���� �� ���� ��ü�� ��� �ִ� Optional ��ü�� ����, null �� �Ѿ�� ��� �� Optional ��ü�� ����
		Optional<Member> maybeNotMember = Optional.ofNullable(null); // �� Optional ��ü
		
		// Optional �� ��� �ִ� ��ü �����ϱ�
		// Optional �� ��� �ִ� ��ü�� ������ ��� �����ϰ� �ش� ���� ��ȯ��
		// Optional �� �� ��� ���� �ٸ��� ������
		maybeMember.get(); // �� Optional ��ü�� ���ؼ� NoSuchElementException �� ����
		maybeMember1.orElse(new Member()); // �� Optional ��ü�� ���ؼ�, �Ѿ�� ���ڸ� ��ȯ
		// maybeMember2.orElseGet(Supplier<? extends X> exceptionSupplier); // �� Optional ��ü�� ���ؼ�, �Ѿ�� �Լ��� ���ڸ� ���� ������ ���ܸ� ����
		
		int length = Optional.ofNullable(order.getMember().getAddress().getCity()).map(String::length).orElse(0);
		/*
		 * �����鼭�� �ٸ���
		 * 
		 *  String text = getText();
			Optional<String> maybeText = Optional.ofNullable(text);
			int length;
			if (maybeText.isPresent()) {
				length = maybeText.get().length();
			} else {
				length = 0;
			}
			
			String text = getText();
			int length;
			if (text != null) {
				length = maybeText.get().length();
			} else {
				length = 0;
			}
		 */
		
		// null ��ȯ
		Map<Integer, String> cities = new HashMap<>();
		cities.put(1, "Seoul");
		cities.put(2, "Busan");
		cities.put(3, "Daejeon");
		
		String city1 = cities.get(4); // returns null
		int length1 = city1 == null ? 0 : city1.length(); // null check
		System.out.println(length1);
		
		Optional<String> maybeCity = Optional.ofNullable(cities.get(4)); // Optional
		int length2 = maybeCity.map(String::length).orElse(0);
		System.out.println(length2);
		
		// ���� �߻�
		// null �� ��ȯ���� �ʰ� ���ܸ� ���������� ���
		List<String> cities1 = Arrays.asList("Seoul", "Busan", "Daejeon");
		
		String city2 = null;
		try {
			city2 = cities1.get(3); // throws exception
		} catch (ArrayIndexOutOfBoundsException e) {
			// ignore
		}
		int length3 = city2 == null ? 0 : city2.length(); // null check
		System.out.println(length3);
		
		Optional<String> maybeCity4 = getAsOptional(cities1, 3); // Optional
		int length4 = maybeCity4.map(String::length).orElse(0); // null-safe
		System.out.println(length4);
		
		// ifPresent() �޼ҵ�
		// ifPresent(Consumer<? super T> consumer) : �� �޼ҵ�� Ư�� ����� ��ȯ�ϴ� ��ſ� Optional ��ü�� ���ΰ� �ִ� ���� ������ ��쿡�� ����� ������ �Լ��� ���ڷ� �ѱ� �� ����
		Optional<String> maybeCity5 = getAsOptional(cities1, 3); // Optional
		maybeCity5.ifPresent(city3 -> {
			System.out.println("length : " + city3.length());
		});
	}
	
	/**
	 * � �ֹ��� �� ȸ���� ��� ���ÿ� ��� �ִ��� �˾Ƴ��� �޼ҵ�
	 * @param order
	 * @return
	 */
	public static String getCityOfMemberFromOrder(Order order) {
		return order.getMember().getAddress().getCity();
	}
	
	/**
	 * �Ʒ��� �ڵ� �����丵
	 * @param order
	 * @return
	 */
	public static String getCityOfMemberFrmOrder3(Order order) {
		return Optional.ofNullable(order)
				.map(Order::getMember)
				.map(Member::getAddress)
				.map(Address::getCity)
				.orElse("seoul");
	}
	
	// 1. ��ø null üũ�ϱ�
	public String getCityOfMemberFromOrder1(Order order) {
		if (order != null) {
			Member member = order.getMember();
			if (member != null) {
				Address address = member.getAddress();
				if (address != null) {
					String city = address.getCity();
					if (city != null) {
						return city;
					}
				}
			}
		}
		return "Seoul"; // default
	}
	
	// 2. ��濡�� return �ϱ�
	public String getCityOfMemberFromOrder2(Order order) {
		if (order == null) {
			return "Seoul";
		}
		Member member = order.getMember();
		if (member == null) {
			return "Seoul";
		}
		Address address = member.getAddress();
		if (address == null) {
			return "Seoul";
		}
		String city = address.getCity();
		if (city == null) {
			return "Seoul";
		}
		return city;
	}
	
	/**
	 * �Ʒ��� �ڵ� �����丵
	 * @param order
	 * @param min
	 * @return
	 */
	public Optional<Member> getMemberIfOrderWithin1(Order order, int min) {
		return Optional.ofNullable(order)
				.filter(o -> o.getDate().getTime() > System.currentTimeMillis() - min * 1000)
				.map(Order::getMember);
	}
	
	public Member getMemberIfOrderWithin(Order order, int min) {
		if(order != null && order.getDate().getTime() > System.currentTimeMillis() - min * 1000) {
			return order.getMember();
		}
		return null;
	}
	
	/**
	 * ���� ó���θ� ���μ� ������ƿ��Ƽ �޼ҵ�� �и�
	 * Optional Ŭ���������� ���丮 �޼ҵ带 ����Ͽ� ����ó�� �ÿ� ���� ó�� �ÿ� ��ȭ�� Optional ��ü�� ���� ������
	 * �� ��쿡�� Optional �� ���� ��ü�� null ���� �ƴ��� Ȯ���� �� �� �ֱ� ������ 2���� ���� ���丮 �޼ҵ带 �� �� ����
	 * @param <T>
	 * @param list
	 * @param index
	 * @return
	 */
	public static <T> Optional<T> getAsOptional(List<T> list, int index) {
		try {
			return Optional.of(list.get(index));
		} catch (ArrayIndexOutOfBoundsException e) {
			return Optional.empty();
		}
	}
}
