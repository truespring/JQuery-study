package com.doosan.test.prac3;

import java.util.Objects;

public class ObjectTest {

	public static void main(String[] args) {
		// 링크 : https://multifrontgarden.tistory.com/205
		
		String str1 = null;
		String str2 = null;

		ObjectTest.isChk1(str1, str2);
		ObjectTest.isChk2(str1, str2);

		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str1, "hello")); // 첫 번째 인자가 null 이면 두 번째 인자를 출력

//		ObjectTest.nullChk(str1);

		ObjectTest.isNull(str1);
		ObjectTest.nonNull(str1);
		System.out.println("==================");
		System.out.println(Objects.isNull(str1));
		System.out.println(Objects.nonNull(str1));
	}

	/**
	 * null 방어를 위한 메소드이지만 str1 이 null 이 아니어야만 확인이 가능
	 * 
	 * @param str1
	 * @param str2
	 */
	public static void isChk1(String str1, String str2) {
		if (str1 != null && str1.equals(str2)) {
			System.out.println("true");
			return;
		}
		System.out.println("false");
	}

	/**
	 * null 방어를 위한 메소드
	 * 
	 * @param str1
	 * @param str2
	 */
	public static void isChk2(String str1, String str2) {
		if (Objects.equals(str1, str2)) {
			System.out.println("true");
			return;
		}
		System.out.println("false");
	}

	/**
	 * null 이 들어왔을때 NPE 메세지를 설정
	 * 
	 * @param str1
	 */
	public static void nullChk(String str1) {
		String str2 = Objects.requireNonNull(str1, "default");
		System.out.println(str2);
	}

	/**
	 * null 이면 true
	 * 
	 * @param str1
	 */
	public static void isNull(String str1) {
		if (Objects.isNull(str1)) {
			System.out.println("true");
			return;
		}
		System.out.println("false");
	}

	/**
	 * not null 이면 true
	 * 
	 * @param str1
	 */
	public static void nonNull(String str1) {
		if (Objects.nonNull(str1)) {
			System.out.println("true");
			return;
		}
		System.out.println("false");
	}
	
	/**
	 * 문자열 null 방어
	 * 
	 * @param str
	 * @return
	 */
	public static String nvl(String str) {
		if(Objects.isNull(str)) {
			return "";
		}
		return str;
	}
}
