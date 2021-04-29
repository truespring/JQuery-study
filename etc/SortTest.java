package com.doosan.test.prac3;

import java.util.ArrayList;
import java.util.List;

import com.doosan.test.SampleVO;

public class SortTest {

	public static void main(String[] args) {
		List<SampleVO> voList = new ArrayList<>();
		SampleVO vo = new SampleVO("AA", 1, "b");
		SampleVO vo2 = new SampleVO("CC", 5, "F");
		SampleVO vo3 = new SampleVO("B", 2, "1");
		SampleVO vo4 = new SampleVO("Z", 7, "ZZ");
		SampleVO vo5 = new SampleVO("7", 4, "1");
		voList.add(vo);
		voList.add(vo2);
		voList.add(vo3);
		voList.add(vo4);
		voList.add(vo5);
		
		for(SampleVO a : voList) {
			System.out.println(a.toString());
		}
		System.out.println("===========");
		voList.sort((o1, o2) -> o1.getS().compareTo(o2.getS())); // 오름차순정렬
		
		for(SampleVO a : voList) {
			System.out.println(a.toString());
		}
	}
}
