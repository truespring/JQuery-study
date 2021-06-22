package com.doosan.test.prac4;

import java.lang.reflect.Method;
import java.util.Objects;

import com.doosan.test.prac2.CommonException;

public class Utils {
	// https://12bme.tistory.com/129
	
	public static void main(String[] args) {
		
		Object obj = null;
		Utils util = new Utils();
		
		try {
			util.checkObjectIsNotNull(obj);
		} catch (CommonException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 어떤 객체의 null 여부를 판단하고, null 이라면 메시지와 함께 exception 을 발생시킵니다.
	 * 
	 * @param object null 여부를 검사하려는 객체
	 * @throws CommonException 객체가 null 인 경우
	 */
	private void checkObjectIsNotNull(Object object) throws CommonException {
		if (Objects.nonNull(object)) {
			return;
		}
		
		String className = "";
		try {
			Method method = this.getClass().getDeclaredMethod("checkObjectIsNotNull", Object.class);
			className = method.getParameters()[0].getClass().getSimpleName();
		} catch (NoSuchMethodException | IndexOutOfBoundsException | NullPointerException e) {
			e.printStackTrace();
		}
		
		throw new CommonException("" + className + " + This value is null.");
	}
}
