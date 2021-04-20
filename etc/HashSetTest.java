package com.doosan.test.prac2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// 링크 : https://coding-factory.tistory.com/554
		HashSet<Integer> set1 = new HashSet<Integer>(); // HashSet 생성
		HashSet<Integer> set2 = new HashSet<>(); // new 에서 타입 파라미터 생략 가능
		HashSet<Integer> set3 = new HashSet<Integer>(set1); // set1 의 모든 값을 가진 HashSet 생성
		HashSet<Integer> set4 = new HashSet<Integer>(10); // 초기 용량(capacity) 지정
		HashSet<Integer> set5 = new HashSet<Integer>(10, 0.7f); // 초기 capacity, load factor 지정
		HashSet<Integer> set6 = new HashSet<Integer>(Arrays.asList(1,2,3)); // 초기값 지정
		
		HashSet<Integer> set7 = new HashSet<Integer>();
		set7.add(1); // 값 추가
		set7.add(2);
		set7.add(3);
		
		HashSet<Integer> set8 = new HashSet<Integer>(Arrays.asList(1,2,3)); // 초기값 지정
		set8.remove(1); // 값 1 제거
		set8.clear(); // 모든 값 제거
		
		HashSet<Integer> set9 = new HashSet<Integer>(Arrays.asList(1,2,3)); // 초기값 지정
		System.out.println(set9.size()); // set 크기 : 3
		
		HashSet<Integer> set10 = new HashSet<Integer>(Arrays.asList(1,2,3)); // 초기값 지정
		System.out.println(set10); // 전체 출력 [1,2,3]
		Iterator iter = set10.iterator(); // Iterator 사용
		while(iter.hasNext()) { // 값이 있으면 true, 값이 없으면 false
			System.out.println(iter.next());
		}

		HashSet<Integer> set11 = new HashSet<Integer>(Arrays.asList(1,2,3)); // 초기값 지정
		System.out.println(set11.contains(1)); // set 내부에 값 1이 있는지 확인 : true
	}
}
