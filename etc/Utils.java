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
	 * � ��ü�� null ���θ� �Ǵ��ϰ�, null �̶�� �޽����� �Բ� exception �� �߻���ŵ�ϴ�.
	 * 
	 * @param object null ���θ� �˻��Ϸ��� ��ü
	 * @throws CommonException ��ü�� null �� ���
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
