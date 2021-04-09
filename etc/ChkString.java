package com.doosan.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ChkString {
	public static void main (String[] args) {
		Optional<String> opt = Optional.ofNullable("ÀÚ¹Ù Optional °´Ã¼");

		System.out.println(opt.get());
		int i = 0;
		String word = "aa";
		if(chkWords.contains(word.toUpperCase())) {
			i++;
		}
		System.out.println("i : " + i);
	}
	
	public static List<String> chkWords = Arrays.asList(
			"AA",
			"BB",
			"CC"
		);
}
