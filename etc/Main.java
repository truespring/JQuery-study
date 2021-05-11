package com.doosan.test.optional;

import java.util.Optional;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
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
	}
	
	/**
	 * � �ֹ��� �� ȸ���� ��� ���ÿ� ��� �ִ��� �˾Ƴ��� �޼ҵ�
	 * @param order
	 * @return
	 */
	public static String getCityOfMemberFromOrder(Order order) {
		return order.getMember().getAddress().getCity();
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
}
