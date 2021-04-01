package com.doosan.test;

import java.util.ArrayList;
import java.util.List;

public class GFG {

	// static function to be calles
	static void someFunction(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Geeks");
		list.add("For");
		list.add("GEEKS");
		
		// call the static method
		// using double colon operator
		list.forEach(GFG::someFunction);
		System.out.println("--------------------");
		list.forEach(s -> System.out.println(s));
		System.out.println("--------------------");
		for(String s : list) {
			System.out.println(s);
		}
	}

}
