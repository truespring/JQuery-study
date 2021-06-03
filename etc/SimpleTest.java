package com.doosan.test.prac4;

import java.util.Optional;

public class SimpleTest {

	public static void main(String[] args) {
		SampleVo vo = null;
		Optional<SampleVo> a = Optional.ofNullable(vo);
		if (a.isPresent()) {
			System.out.println("a : " + a);
		} else {
			System.out.println("b : " + a); // b : Optional.empty -> false
		}

		if (a.isEmpty()) {
			System.out.println("a : " + a); // a : Optional.empty -> true
		} else {
			System.out.println("b : " + a);
		}

		Object isA = true;
		if ((boolean) isA) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}
