package com.doosan.test.optional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 링크 : https://www.daleseo.com/java8-optional-before/
		Order order = new Order();
		String city = getCityOfMemberFromOrder(order); // returns null
		System.out.println(city.length()); // throws NPE!
		/*
		 * NPE 발생 시나리오
		 * 1. order 의 결과가 null
		 * 2. order.getMember() 의 결과가 null
		 * 3. order.getMember().getAddress() 의 결과가 null
		 * 4. order.getMember().getAddress().getCity() 의 결과가 null
		 */
		
		
		Optional<Member> maybeMember = Optional.empty(); // 빈 Optional 객체 생성, 싱글톤 인스턴스
		Optional<Member> maybeMember1 = Optional.of(new Member()); // null 이 아닌 객체를 담고 있는 Optional 객체, null 이 넘어올 경우 NPE를 던짐
		
		Optional<Member> maybeMember2 = Optional.ofNullable(new Member()); // null 인지 아닌지 확신할 수 없는 객체를 담고 있는 Optional 객체를 생성, null 이 넘어올 경우 빈 Optional 객체를 얻어옴
		Optional<Member> maybeNotMember = Optional.ofNullable(null); // 빈 Optional 객체
		
		// Optional 이 담고 있는 객체 접근하기
		// Optional 이 담고 있는 객체가 존재할 경우 동일하게 해당 값을 반환함
		// Optional 이 빈 경우 각각 다르게 동작함
		maybeMember.get(); // 빈 Optional 객체에 대해서 NoSuchElementException 을 던짐
		maybeMember1.orElse(new Member()); // 빈 Optional 객체에 대해서, 넘어온 인자를 반환
		// maybeMember2.orElseGet(Supplier<? extends X> exceptionSupplier); // 빈 Optional 객체에 대해서, 넘어온 함수형 인자를 통해 생성된 예외를 던짐
		
		int length = Optional.ofNullable(order.getMember().getAddress().getCity()).map(String::length).orElse(0);
		/*
		 * 같으면서도 다르다
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
		
		// null 반환
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
		
		// 예외 발생
		// null 을 반환하지 않고 예외를 던저버리는 경우
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
		
		// ifPresent() 메소드
		// ifPresent(Consumer<? super T> consumer) : 이 메소드는 특정 결과를 반환하는 대신에 Optional 객체가 감싸고 있는 값이 존재할 경우에만 실행될 로직을 함수형 인자로 넘길 수 있음
		Optional<String> maybeCity5 = getAsOptional(cities1, 3); // Optional
		maybeCity5.ifPresent(city3 -> {
			System.out.println("length : " + city3.length());
		});
	}
	
	/**
	 * 어떤 주문을 한 회원이 어느 도시에 살고 있는지 알아내는 메소드
	 * @param order
	 * @return
	 */
	public static String getCityOfMemberFromOrder(Order order) {
		return order.getMember().getAddress().getCity();
	}
	
	/**
	 * 아래의 코드 리팩토링
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
	
	// 1. 중첩 null 체크하기
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
	
	// 2. 사방에서 return 하기
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
	 * 아래의 코드 리펙토링
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
	 * 예외 처리부를 감싸서 정적유틸리티 메소드로 분리
	 * Optional 클래스의정적 팩토리 메소드를 사용하여 정상처리 시와 예외 처리 시에 반화할 Optional 객체를 각각 지정함
	 * 이 경우에는 Optional 에 담을 객체가 null 인지 아닌지 확실히 알 수 있기 때문에 2개의 정적 팩토리 메소드를 쓸 수 있음
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
