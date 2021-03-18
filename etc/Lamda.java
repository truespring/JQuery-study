package com.doosan.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Lamda {

	// ����Ʈ�� ������ �ε��� ���� ��ȯ
	private static Function<List<Object>, Object> popStack = stack -> stack.remove(stack.size() - 1);
	
	public static void main(String[] args) {
		List<Object> arr = new ArrayList<Object>();
		arr.add(123.312);
		
		// ���� �޼ҵ带 ȣ���ϰ� .apply�� �������
		double a = abs.apply(arr);
		System.out.println("a : " + a);
	}
	
	// Function<stack�� Ÿ��, ��ȯŸ��> �޼ҵ� �̸� = stack
	private static Function<List<Object>, Double> abs = stack -> {
		double a = (Double) popStack.apply(stack);
		return a;
	};
	
}
