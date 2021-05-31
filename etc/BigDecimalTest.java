package com.doosan.test.prac3;

import java.math.BigDecimal;

public class BigDecimalTest {

	public static void main(String[] args) {
		// ��ũ :
		// https://velog.io/@new_wisdom/Java-BigDecimal%EA%B3%BC-%ED%95%A8%EA%BB%98%ED%95%98%EB%8A%94-%EC%95%84%EB%A7%88%EC%B0%8C%EC%9D%98-%EB%84%88%EB%93%9C%EC%A7%93#bigdecimal%EC%9D%84-%EC%99%9C-%EC%93%B0%EC%A7%80-
		
		double a = 100.0000000005;
		double b =  10.0000000004;
		
		float c = 100.000000000005f;
		float d =  10.000000000004f;

		if ((a - b) == 90.0000000001) {
			System.out.println("double ����");
		} else {
			System.out.println("double " + (a - b)); // �Ҽ��� 10��° �ڸ����� ���⿡ �ɸ�(90.00000000009999)
		}
		
		if ((c - d) == 90.000000000001f) {
			System.out.println("float ����"); // float �� double �� �ٸ��� �Ҽ��� ����� �� ��(90.000000000001f)
		} else {
			System.out.println("float : " + (c - d));
		}
		
		BigDecimal val = new BigDecimal("123.45"); // ���� ǥ��
		BigDecimal val2 = new BigDecimal(123.45); // �ڸ����� 123�̰� ���� 45�� �Ҽ����� ��Ÿ��
		BigDecimal val3 = BigDecimal.valueOf(123.45); // val �� ����
		System.out.println(val.unscaledValue()); // 12345
		System.out.println(val.scale()); // 2
		System.out.println(val.precision()); // 5

		if (val3.equals(val)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ�");
		}
		
		Double d1 = 123.45;
		BigDecimal bd1 = BigDecimal.valueOf(d1);
		if (bd1.doubleValue() == d1) { // BigDecimal To Double
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
	}
}
