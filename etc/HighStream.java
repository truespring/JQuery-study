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
		// Stream �����
		// ��ũ : https://futurecreator.github.io/2018/08/26/java-8-streams-advanced/
		
		// 1. ���� ����
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
		 * ó�� ����� Eric �� a ���ڿ��� ������ ���� �ʱ� ������ ���� ��ҷ� �Ѿ��. �� �� filter() was called �� �� �� ��µȴ�.
		 * ���� ����� Elena ���� filter() was called �� �� �� �� ��µȴ�. Elena �� a �� ������ �ֱ� ������ ���� �������� �Ѿ �� �ִ�.
		 * ���� ������ map ���� toUpperCase �޼ҵ尡 ȣ��ȴ�. �� �� map() was called �� ��õȴ�.
		 * ������ ������ findFirst �� ù ��° ��Ҹ��� ��ȯ�ϴ� �����̴�. ���� ���� ����� Elena �̰�, ���� ������ ������ �ʿ䰡 ���� ����ȴ�.
		 */
		
		// 2. ���� ���
		// ��Ʈ���� �� ��Ҿ� ���������� ����ȴ�. ���⿡ ��Ʈ���� ������ ������ �� �ִ� ��Ʈ�� �����ִ�.
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
		
		// 3. ��Ʈ�� ����
		// ���� �۾��� ���� �ʴ� �� �ϳ��� �ν��Ͻ��μ� ����ؼ� ����� �����ϴ�. ������ ���� �۾��� �ϴ� ���� ��Ʈ���� ������ ������ ������ �� �� ����. ��Ʈ���� ����� �����͸� ������ ó���ϴ� �뵵���� �����͸� �����Ϸ��� �������� ������� �ʾұ� �����̴�.
		Stream<String> stream = 
				Stream.of("Eric", "Elena", "Java")
				.filter(name -> name.contains("a"));
		
		Optional<String> firstElement = stream.findFirst();
		Optional<String> anyElement = stream.findAny(); // IllegalStateException: stream has already been operated upon or closed
		// findFirst �޼ҵ带 �����ϸ鼭 ��Ʈ���� ������ ������ findAny �ϴ� ���� ��Ÿ�� ���ܰ� �߻��Ѵ�. �����Ϸ��� ĳġ�� �� ���� ������ Stream �� ���� �Ŀ� ������ �ʴ��� �����ؾ� �Ѵ�.
		
		List<String> names =
				Stream.of("Eric", "Elena", "Java")
				.filter(name -> name.contains("a"))
				.collect(Collectors.toList());
		
		Optional<String> firstElement_2 = names.stream().findFirst();
		Optional<String> anyElement_2 = names.stream().findAny();
		// �����͸� List �� �����ϰ� �ʿ��� ������ ��Ʈ���� ������ ����Ѵ�.
	}
}
