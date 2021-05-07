package com.doosan.test.prac;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionTest {
	private final Logger logger = LoggerFactory.getLogger(ExceptionTest.class);

	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();
		try {
			String a = null;
			et.testMethod(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void testMethod(String a) throws Exception {
//		if(a == null) {
//			throw new CommonException("公~具龋~");
//		}
		try {
			String b = (String) a;
			Long c = Long.parseLong(b);
//			System.out.println(a.toString());
			System.out.println(b);
			System.out.println(c);
		} catch(Exception e) {
			throw new CommonException("公~具龋~", e);
		}
	}
}
