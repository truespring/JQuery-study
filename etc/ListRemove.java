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
		 * remove �޼ҵ�� int ���� ���ڷ� �ϸ� �ش� �ε����� ���� �����ϰ�,
		 * Object ���� ���ڷ� �ϸ� �ش��ϴ� ó�� ���� �����.
		 * �ش��ϴ� ���� ������ �״�� ��ȯ�Ѵ�.
		 */
		for(String str : testArr) {
			System.out.print(str + " "); // 1 3 2 4
		}
	}
}
