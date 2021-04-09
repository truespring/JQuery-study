package prac;

import java.util.ArrayList;
import java.util.List;

public class Casting {

	public static void main(String[] args) {

		/**
		 * double 은 기본 자료형, 일반 변수
		 * Double 은 참조 자료형, 참조 변수
		 */
		
		int a = 100;
		double b = a; // 자동 형변환
		double c = 100; // 자동 형변환
		Double d = (double) a; // 자동 형변환 안됨
		Double e = b;
		Double f = c;
		Double g = 100.0;
		double h = g;
		
//		List<Double> doubleArr = new ArrayList();
//		doubleArr.add(a);
//		doubleArr.add(b);
//		doubleArr.add(c);
//		doubleArr.add(d);
//		doubleArr.add(e);
//		doubleArr.add(f);
//		doubleArr.add(g);
//		doubleArr.add(h);
//
//		List<double> doubleArr_2 = new ArrayList();
//		doubleArr_2.add(a);
//		doubleArr_2.add(b);
//		doubleArr_2.add(c);
//		doubleArr_2.add(d);
//		doubleArr_2.add(e);
//		doubleArr_2.add(f);
//		doubleArr_2.add(g);
//		doubleArr_2.add(h);
		
//		int a = -1;
//		Math.abs(a);
//		System.out.println(a);
	}

}
