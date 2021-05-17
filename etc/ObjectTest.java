package com.doosan.test.prac3;

import java.util.Objects;

public class ObjectTest {

	public static void main(String[] args) {
		// ��ũ : https://multifrontgarden.tistory.com/205
		
		String str1 = null;
		String str2 = null;

		ObjectTest.isChk1(str1, str2);
		ObjectTest.isChk2(str1, str2);

		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str1, "hello")); // ù ��° ���ڰ� null �̸� �� ��° ���ڸ� ���

//		ObjectTest.nullChk(str1);

		ObjectTest.isNull(str1);
		ObjectTest.nonNull(str1);
		System.out.println("==================");
		System.out.println(Objects.isNull(str1));
		System.out.println(Objects.nonNull(str1));
	}

	/**
	 * null �� ���� �޼ҵ������� str1 �� null �� �ƴϾ�߸� Ȯ���� ����
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
	 * null �� ���� �޼ҵ�
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
	 * null �� �������� NPE �޼����� ����
	 * 
	 * @param str1
	 */
	public static void nullChk(String str1) {
		String str2 = Objects.requireNonNull(str1, "default");
		System.out.println(str2);
	}

	/**
	 * null �̸� true
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
	 * not null �̸� true
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
	 * ���ڿ� null ���
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
