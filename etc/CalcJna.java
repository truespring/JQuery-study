package com.doosan.test;

import com.doosan.test.JnaUnisteam.UniSteamCal;

public class CalcJna {

	public static void main(String[] args) {

		double cald3 = UniSteamCal.INSTANCE.STEAMPTM(20.6, 32.6, 4); //7.55

		System.out.println("cald3 : " + cald3); // 7.55E-4
		
//		JniUnisteam jni = new JniUnisteam(); // jni ��ü ����
		
//		System.out.println(jni.IF97STEAMPTH(2.3, 3.3, 1)); // ���� dll ������ ���� ȣ�� �Ұ�
		
	}

}
