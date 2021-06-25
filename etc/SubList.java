package com.doosan.test.prac4;

import java.util.ArrayList;
import java.util.List;

public class SubList {

	public static void main(String[] args) {
		// https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=yjw2288&logNo=221072561904
		// ConcurrentModificationException 관련 링크 : https://m.blog.naver.com/tmondev/220393974518
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 10; i ++) {
			list.add(i + 1);
		}
		// subList 는 부모의 값을 가진다.
		List<Integer> subList = new ArrayList<>(list.subList(0, 3));
//		List<Integer> subList = list.subList(0, 3); // subList [1, 2, 3] list [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println(subList); // subList[1, 2, 3]
		list.remove(0); // list [2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println(subList); // subList[?, 2, 3]
		
		list = list.subList(0, 3);
		System.out.println(list);
		
	}
}
