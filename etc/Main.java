package com.doosan.test.optional;

import java.util.Optional;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
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
	}
	
	/**
	 * 어떤 주문을 한 회원이 어느 도시에 살고 있는지 알아내는 메소드
	 * @param order
	 * @return
	 */
	public static String getCityOfMemberFromOrder(Order order) {
		return order.getMember().getAddress().getCity();
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
}
