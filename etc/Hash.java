package com.doosan.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Hash {

	public static void main(String[] args) {
		Map<String, String> result = new HashMap<>();
		String subject = "subject";
		String name = "gyuhwan";
		result.put("subject", subject);
		result.put("name", name);
		System.out.println("map : " + result);
		Object chk = "asd";
		Object[] objArr = {
				"a",
				1,
				'c',
		};
		for(Object arr : objArr) {
			System.out.println(arr);
		}
		boolean isChk = false;
		
		if(chk instanceof ArrayList) {
			isChk = true;
		}
		System.out.println(isChk);
	}
	
	public static HashMap<String, Integer> functions = new HashMap<String, Integer>() {{
		put("asd", 1);
		put("abbb", 3);
	}};
	
	public static Predicate<Object> isOperation = str -> Arrays.asList("+", "-", "*", "/", "^").contains(str);
	
	private static int ifFunction(List<Object> list, int start, List<String> msg) {
		if(start > 0) {
			Object obj = list.get(start - 1);
			String str = String.valueOf(obj);
			if(obj instanceof String
					&& !isOperation.test(obj)) {
				start = obj instanceof String ? start - 1 : start;
				if(!functions.containsKey(str.toUpperCase()) && !Arrays.asList("PREVIOUS").contains(str.toUpperCase())) {
					msg.add("\""+obj+"\"");
				}
			}
		}
		return start;
	}

}
