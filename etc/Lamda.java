package com.doosan.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Lamda {

	// 리스트의 마지막 인덱스 값을 반환
	private static Function<List<Object>, Object> popStack = stack -> stack.remove(stack.size() - 1);
	
	public static void main(String[] args) {
		List<Object> arr = new ArrayList<Object>();
		arr.add(123.312);
		
		// 람다 메소드를 호출하고 .apply를 해줘야함
		double a = abs.apply(arr);
		System.out.println("a : " + a);
	}
	
	// Function<stack의 타입, 반환타입> 메소드 이름 = stack
	private static Function<List<Object>, Double> abs = stack -> {
		double a = (Double) popStack.apply(stack);
		return a;
	};
	
}
