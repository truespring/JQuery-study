package com.doosan.test.prac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeMethod {

	public static void main(String[] args) {
		Long nowTime = System.currentTimeMillis();
		System.out.println(nowTime); // 1618557846668
		
		Date currentDate = new Date();
		System.out.println(currentDate); // Fri Apr 16 16:24:06 KST 2021
		System.out.println(dateToTimeString(currentDate)); // 20210416162406
		
	}
	
	public static Long dateToTimeString(Date date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String dateString = simpleDateFormat.format(date); // Date -> String 형변환
		try {
			date = simpleDateFormat.parse(dateString); // String -> Date 형변환
			System.out.println(date); // Fri Apr 16 16:24:06 KST 2021
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return objectToLong(dateString);
	}
	
	public static Long objectToLong(Object object) {
		Long longObject = null;
		try {
			longObject = Long.parseLong(object.toString()); // Object -> Long 형변환
		} catch (NumberFormatException | NullPointerException e) {
			
		}
		return longObject;
	}
}
