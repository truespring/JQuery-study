package com.doosan.test.prac4;

import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.doosan.test.prac4.TwiceClass.CoreProperties;

public class SimpleTest {
	
	private static Logger log = LoggerFactory.getLogger(SimpleTest.class);

	public static void main(String[] args) {
		SampleVo vo = null;
		Optional<SampleVo> a = Optional.ofNullable(vo);
		if (a.isPresent()) {
			System.out.println("isPresent true : " + a);
		} else {
			System.out.println("isPresent false : " + a); // b : Optional.empty -> false
		}

		if (a.isEmpty()) {
			System.out.println("isEmpty true : " + a); // a : Optional.empty -> true
		} else {
			System.out.println("isEmpty false : " + a);
		}

		Object isA = true;
		if ((boolean) isA) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		String ab = "a";
		SimpleTest st = new SimpleTest();
		System.out.println(st.nvl(ab));
		
		TwiceClass.CoreProperties cp = new CoreProperties(vo);
	}
	
	public String nvl(String str) {
		if (Objects.isNull(str)) {
			return null;
		}
		log.info("SimpleTest > nvl > str : [{}]", str);
		return str;
	}
}
