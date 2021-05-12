package com.doosan.test.optional;

import com.doosan.test.prac2.CommonException;

public class Start {

	public static void main(String[] args) {
		Main main = new Main();
		String a = null;
		System.out.println(main.nvl(a));
		Object b = "asd";
		try {
			System.out.println(main.objectToLong(b));
		} catch (CommonException e) {
			e.printStackTrace();
		}
	}
}
