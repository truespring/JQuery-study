package com.doosan.test.prac;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		Object[] objArr = {"��", "ȭ", "��", "��", "��", "��", "��"};
		System.out.println(objArr); // [ a, b, c, ... , n ]
		List<Object[]> objList = new ArrayList<>();
		objList.add(objArr);
		objList.add(objArr);
		System.out.println(objList); // [ [ a, b, c, ... , n], [ a, b, c, ... , n], ... , [ a, b, c, ... , n] ]
	}
}
