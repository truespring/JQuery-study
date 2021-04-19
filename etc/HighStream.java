package com.doosan.test.prac2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HighStream {
	private static long counter;
	private static void wasCalled() {
		counter++;
	}

	public static void main(String[] args) {
		// Stream 고급편
		// 링크 : https://futurecreator.github.io/2018/08/26/java-8-streams-advanced/
		
		// 1. 동작 순서
		List<String> list = Arrays.asList("Eric", "Elena", "Java");
		list.stream()
				.filter(el -> {
					System.out.println("filter() was called.");
					return el.contains("a");
				})
				.map(el -> {
					System.out.println("map() was called.");
					return el.toUpperCase();
				})
				.findFirst();
		/**
		 * 처음 요소인 Eric 은 a 문자열을 가지고 있지 않기 때문에 다음 요소로 넘어간다. 이 때 filter() was called 가 한 번 출력된다.
		 * 다음 요소인 Elena 에서 filter() was called 가 한 번 더 출력된다. Elena 는 a 를 가지고 있기 때문에 다음 연산으로 넘어갈 수 있다.
		 * 다음 연산인 map 에서 toUpperCase 메소드가 호출된다. 이 떄 map() was called 가 출련된다.
		 * 마지막 연산인 findFirst 는 첫 번째 요소만을 반환하는 연산이다. 따라서 최종 결과는 Elena 이고, 다음 연산은 수행할 필요가 없어 종료된다.
		 */
		
		// 2. 선능 향상
		// 스트림은 한 요소씩 수직적으로 실행된다. 여기에 스트림의 성능을 개선할 수 있는 힌트가 숨어있다.
		list.stream()
		  .map(el -> {
		    wasCalled();
		    return el.substring(0, 3);
		  })
		  .skip(2)
		  .collect(Collectors.toList());
		
		System.out.println(counter);
		
		List<String> collect = list.stream()
				  .skip(2)
				  .map(el -> {
				    wasCalled();
				    return el.substring(0, 3);
				  })
				  .collect(Collectors.toList());
		
		// 3. 스트림 재사용
		// 종료 작업을 하지 않는 한 하나의 인스턴스로서 계속해서 사용이 가능하다. 하지만 종료 작업을 하는 순간 스트림이 닫히기 때문에 재사용은 할 수 없다. 스트림은 저장된 데이터를 꺼내서 처리하는 용도이지 데이터를 저장하려는 목적으로 설계되지 않았기 때문이다.
		Stream<String> stream = 
				Stream.of("Eric", "Elena", "Java")
				.filter(name -> name.contains("a"));
		
		Optional<String> firstElement = stream.findFirst();
		Optional<String> anyElement = stream.findAny(); // IllegalStateException: stream has already been operated upon or closed
		// findFirst 메소드를 실행하면서 스트림이 닫히기 때문에 findAny 하는 순간 런타임 예외가 발생한다. 컴파일러가 캐치할 수 없기 때문에 Stream 이 닫힌 후에 사용되지 않는지 주의해야 한다.
		
		List<String> names =
				Stream.of("Eric", "Elena", "Java")
				.filter(name -> name.contains("a"))
				.collect(Collectors.toList());
		
		Optional<String> firstElement_2 = names.stream().findFirst();
		Optional<String> anyElement_2 = names.stream().findAny();
		// 데이터를 List 에 저장하고 필요할 때마다 스트림을 생성해 사용한다.
	}
}
