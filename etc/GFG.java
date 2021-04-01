package com.doosan.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GFG {

	// static function to be calles
	static void someFunction(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {

		// forEach �� ��Ȳ�� ����
		
		// 1. ����Ʈ�� �޼���
		List<String> list = new ArrayList<String>();
		list.add("Geeks");
		list.add("For");
		list.add("GEEKS");
		
		// call the static method
		// using double colon operator
		list.forEach(GFG::someFunction); // �޼��� ���� �� ���
		System.out.println("--------------------");
		list.forEach(s -> System.out.println(s)); // ���ٽ� ���
		System.out.println("--------------------");
		list.forEach(System.out::println); // ���ٽ� ����
		System.out.println("--------------------");
		
		// 2. for in ��
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("--------------------");
		
		// 3. �迭
		String[] strArr = { "a", "p", "p", "l", "e" };
		Arrays.stream(strArr).forEach(GFG::someFunction);
		System.out.println("--------------------");
		Arrays.stream(strArr).forEach(s -> System.out.println(s));
		System.out.println("--------------------");
		Arrays.stream(strArr).forEach(System.out::println);
		System.out.println("--------------------");
		
		// 4. ��
		Map<String, String> map = new HashMap<>();
		map.put("korea", "korean");
		map.put("usa", "english");
		map.put("japan", "japanese");
		map.forEach((key,value) -> System.out.println(key + " : " + value));
	}

}