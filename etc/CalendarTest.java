package com.doosan.test.prac2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		System.out.println(Calendar.YEAR); // �ش� �ε����� ��Ÿ���� �� ��
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		System.out.println(calendar.get(Calendar.YEAR)); // ���� �⵵�� ��Ÿ��
		System.out.println(calendar.get(Calendar.MONTH) + 1);
		System.out.println(calendar.getTime());
	}
}
