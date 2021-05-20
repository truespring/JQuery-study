package com.doosan.test.prac3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NullTest {

	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
//		List<String> a = null;

		String b = NullTest.listNull(a); // null 로 초기화하면 strArr.isEmpty() 에서 NullPointerException 에러 발생
		System.out.println(b);

		String str = new String();
//		String str = null;
		System.out.println(NullTest.nvl(str)); // 객체를 생성하든 null 로 초기화를 하든 상관없음
	}

	public static String listNull(List<String> strArr) {
		if (strArr != null && strArr.size() != 0) {
			return "1";
		}
		return "2";
	}

	public static String nvl(String str) {
		if (Objects.isNull(str)) {
			return "";
		}
		return str;
	}
}
