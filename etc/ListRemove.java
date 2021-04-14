package com.doosan.test.prac;

import java.util.ArrayList;
import java.util.List;

public class ListRemove {

	public static void main(String[] args) {
		List<String> testArr = new ArrayList<>();
		testArr.add("1");
		testArr.add("2");
		testArr.add("3");
		testArr.add("2");
		testArr.add("4");
		
		testArr.remove("2");
		/**
		 * remove 메소드는 int 형을 인자로 하면 해당 인덱스의 값을 제거하고,
		 * Object 형을 인자로 하면 해당하는 처음 값을 지운다.
		 * 해당하는 값이 없으면 그대로 반환한다.
		 */
		for(String str : testArr) {
			System.out.print(str + " "); // 1 3 2 4
		}
	}
}
