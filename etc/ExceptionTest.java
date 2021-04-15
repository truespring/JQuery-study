package com.doosan.test.prac;

public class ExceptionTest {

	public static void main(String[] args) {
		
	}
	
	public void testMethod(String a) throws CommonException {
		if(a == null) {
			throw new CommonException("error code");
		}
	}
}
