package com.doosan.test.prac;

import java.util.Optional;

public class OptionalTest {
	
	public static void main(String[] args) {
		/**
		 * 링크 : http://www.tcpschool.com/java/java_stream_optional
		 * 링크2 : http://homoefficio.github.io/2019/10/03/Java-Optional-%EB%B0%94%EB%A5%B4%EA%B2%8C-%EC%93%B0%EA%B8%B0/
		 * 
		 * Optional<T> 클래스는 integer나 Double 클래스처럼 'T'타입 객체를 포장해 주는 래퍼 클래스(Wrapper class)이다.
		 * 따라서 Optional 인스턴스는 모든 타입의 참조 변수를 저장할 수 있다.
		 * 이러한 Optional 객체를 사용하면 예상치 못한 NullPointerException 예외를 제공하는 메소드로 간단히 회피할 수 있다.
		 * 즉, 복잡한 조건문 없이도 널(Null)값으로 인해 발생하는 예외를 처리할 수 있다.
		 */
		
		// Optional 객체의 생성
		/**
		 * of() 메소드나 ofNullable() 메소드를 사용하여 Optional 객체를 생성할 수 있다.
		 * 
		 * of() 메소드는 null이 아닌 명시된 값을 가지는 Optional 객체를 반환한다.
		 * 만약 of() 메소드를 통해 생성된 Optional 객체에 null이 저장되면 NullPointerException 예외가 발생한다.
		 * 
		 * 따라서 만약 참조 변수의 값이 만에 하나 null이 될 가능성이 있다면, ofNullable() 메소드를 사용하여 Optional 객체를 생성하는 것이 좋다.
		 * ofNullable() 메소드는 명시된 값이 null이 아니면 명시된 값을 가지는 Optional 객체를 반환하며, 명시된 값이 null이면 비어있는 Optional 객체를 반환한다.
		 */
		String str = "자바 Optional 객체";
//		str = null;
		Optional<String> opt = Optional.ofNullable(str);
		System.out.println(opt.get());
		
		// Optional 객체에 접근
		/**
		 * get() 메소드를 사용하면 Optional 객체에 저장된 값에 접근할 수 있다.
		 * 만약 Optional 객체에 저장된 값이 null이면, NoSuchElementException 예외가 발생한다.
		 * 따라서 get() 메소드를 호출하기 전에 isPresent() 메소드를 사용하며 Optional 객체에 저장된 값이 null인지 아닌지를 먼저 확인한 후 호출하는 것이 좋다.
		 */
		String str_2 = "자바 Optional 객체";
//		str_2 = null;
		Optional<String> opt_2 = Optional.ofNullable(str_2);
		if(opt_2.isPresent()) {
			System.out.println(opt_2.get());
		}
		
		/**
		 * 다음 메소드를 사용하여 null 대신에 대체할 값을 지정할 수도 있다.
		 * 
		 * 1. orElse() : 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 값을 반환한다.
		 * 2. orElseGet() : 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달될 람다 표현식의 결과값을 반환한다.
		 * 3. orElseThrow() : 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 예외를 발생시킨다.
		 */
		Optional<String> opt_3 = Optional.empty(); // Optional을 null로 초기화
		System.out.println(opt_3.orElse("빈 Optional 객체"));
		System.out.println(opt_3.orElseGet(String::new)); // opt_3에 값이 없을 때만 new String 실행
		
		
		
	}
}
