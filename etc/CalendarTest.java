package com.doosan.test.prac2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		System.out.println(Calendar.YEAR); // 해당 인덱스를 나타내는 듯 함
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		System.out.println(calendar.get(Calendar.YEAR)); // 현재 년도를 나타냄
		System.out.println(calendar.get(Calendar.MONTH) + 1);
		System.out.println(calendar.getTime());
	}
}
