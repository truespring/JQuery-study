package com.doosan.test.prac3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.doosan.test.SampleVO;

public class SortTest {

	public static void main(String[] args) {
		List<SampleVO> voList = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("distance", "33");
		Map<String, Object> map2 = new HashMap<>();
		map2.put("distance", "23");
		Map<String, Object> map3 = new HashMap<>();
		map3.put("distance", "32");
		SampleVO vo = new SampleVO("AA", 1, "b", map);
		SampleVO vo2 = new SampleVO("CC", 5, "F", map2);
		SampleVO vo3 = new SampleVO("B", 2, "1", map3);
//		SampleVO vo4 = new SampleVO("Z", 7, "ZZ");
//		SampleVO vo5 = new SampleVO("7", 4, "1");
		voList.add(vo);
		voList.add(vo2);
		voList.add(vo3);
//		voList.add(vo4);
//		voList.add(vo5);
		
		for(SampleVO a : voList) {
			System.out.println(a.toString());
		}
		System.out.println("===========");
		
		voList.sort((o1, o2) -> ((String) o1.getMap().get("distance")).compareTo((String)o2.getMap().get("distance"))); // 문자열 오름차순정렬
		voList.stream().map(item -> item.getMap().get("distance")).forEach(System.out::println);
//		System.out.println("===========");
//		
//		voList.sort((o1, o2) -> Long.compare(o1.getNum(), o2.getNum())); // 숫자형 오름차순정렬
//		for(SampleVO a : voList) {
//			System.out.println(a.toString());
//		}
	}
}
