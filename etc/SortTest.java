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
		map.put("distance", "15077");
		map.put("distance4", "4");
		map.put("distance0", "1");
		Map<String, Object> map2 = new HashMap<>();
		map2.put("distance", "7575");
		map2.put("distance2", "55");
		map2.put("distance3", "2");
		Map<String, Object> map3 = new HashMap<>();
		map3.put("distance", "6545");
		map3.put("distance2", "1");
		map3.put("distance3", "3");
//		System.out.println(map.get("distance").getClass().getName());
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
		/*
		 *  AA 1 b {distance=33, distance4=4, distance0=1}
			CC 5 F {distance=23, distance2=55, distance3=2}
			B 2 1 {distance=32, distance2=1, distance3=3}
		 */
		System.out.println("===========");

		voList.stream().map(item -> item.getMap().get("distance")).forEach(System.out::println);
		/*
		 *  33
			23
			32
		 */
		System.out.println("===========");
//		voList.sort((o1, o2) -> ((String) o1.getMap().get("distance")).compareTo((String)o2.getMap().get("distance"))); // 문자열 오름차순정렬
//		voList.stream().map(item -> item.toString()).forEach(System.out::println);
		/*
		 *  CC 5 F {distance=23, distance2=55, distance3=2}
			B 2 1 {distance=32, distance2=1, distance3=3}
			AA 1 b {distance=33, distance4=4, distance0=1}
		 */
//		System.out.println("===========");
//		voList.stream().map(item -> item.getMap().get("distance")).forEach(System.out::println);
		/*
		 *  23
			32
			33
		 */

		
		voList.sort((o1, o2) -> Double.compare(DataHandleUtil.objectToDouble(o1.getMap().get("distance")), DataHandleUtil.objectToDouble(o2.getMap().get("distance")))); // 숫자형 오름차순정렬
		for(SampleVO a : voList) {
			System.out.println(a.getMap().get("distance").toString());
		}
		
		Map<String, Object> map4 = new HashMap<>();
		map4.put("distance1", "1");
		map4.put("distance4", "1");
		map4.put("distance3", "1");
		map4.put("distance6", "1");
		map4.put("distance2", "1");
		System.out.println(map4);
	}
}
