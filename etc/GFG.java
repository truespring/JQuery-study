package com.doosan.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GFG {

	// static function to be calles
	static void someFunction(String s) {
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		
		// 링크 : https://ponyozzang.tistory.com/406

		// forEach 각 상황별 사용법
		
		// 1. 리스트와 메서드
		List<String> list = new ArrayList<String>();
		list.add("Geeks");
		list.add("For");
		list.add("GEEKS");
		
		// call the static method
		// using double colon operator
		list.forEach(GFG::someFunction); // 메서드 생성 및 사용
		System.out.println("--------------------");
		list.forEach(s -> System.out.println(s)); // 람다식 사용
		System.out.println("--------------------");
		list.forEach(System.out::println); // 람다식 생략
		System.out.println("--------------------");
		SampleVO vo = new SampleVO();
		vo.setNum(1);
		vo.setS("2");
		vo.setStr("3");
		List<SampleVO> voList = new ArrayList<SampleVO>();
		voList.add(vo);
		System.out.println("voList : " + voList.get(0).getNum());
		/*
		 * map은 요소들을 특정조건에 해당하는 값으로 변환
		 * filter는 요소들을 조건에 따라 걸러내는 작업
		 * sorted는 요소들을 정렬해주는 작업
		 * 요소들의 가공이 끝났다면 리턴해줄 결과를 collect를 통해 만듦
		 */
		List<String> newList = voList.stream().map(SampleVO::getS).collect(Collectors.toList());
		System.out.println("newList : " + newList); // [2]
		System.out.println("--------------------");
		int cnt = voList.stream().filter(item -> item.getS() == "2").collect(Collectors.toList()).size();
		System.out.println("cnt : " + cnt); // 1
		System.out.println("--------------------");
		int idx = voList.stream().filter(item -> item.getStr().equals("3")).collect(Collectors.toList()).size();
		System.out.println("idx : " + idx); // 1
		System.out.println("--------------------");
		
		// 2. for in 문
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("--------------------");
		
		// 3. 배열
		String[] strArr = { "a", "p", "p", "l", "e" };
		Arrays.stream(strArr).forEach(GFG::someFunction);
		System.out.println("--------------------");
		Arrays.stream(strArr).forEach(s -> System.out.println(s));
		System.out.println("--------------------");
		Arrays.stream(strArr).forEach(System.out::println);
		System.out.println("--------------------");
		
		// 4. 맵
		Map<String, String> map = new HashMap<>();
		map.put("korea", "korean");
		map.put("usa", "english");
		map.put("japan", "japanese");
		map.forEach((key,value) -> System.out.println(key + " : " + value));
	}

}
