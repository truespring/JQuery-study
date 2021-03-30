package com.doosan.test;

import com.doosan.test.JnaUnisteam.UniSteamCal;

public class CalcJna {

	public static void main(String[] args) {

		double cald3 = UniSteamCal.INSTANCE.STEAMPTM(20.6, 32.6, 4); //7.55
		double test = UniSteamCal.INSTANCE.STEAMPTH(24.3249, 79.5708, 0);

		System.out.println("1 : " + UniSteamCal.INSTANCE.STEAMPTH(24.4321, 32.8483, 0)); // 139.8436  139.8552
		System.out.println("2 : " + UniSteamCal.INSTANCE.STEAMPTH(20.3651, 156.8737, 0)); // 662.7785  662.8714
		System.out.println("3 : " + UniSteamCal.INSTANCE.STEAMPTH(24.3249, 79.5708, 0)); // 335.1120  335.0485
		System.out.println("4 : " + UniSteamCal.INSTANCE.STEAMPTH(33.8846, 375.9113, 0)); // 3168.9509  3168.8971
		System.out.println("5 : " + UniSteamCal.INSTANCE.STEAMPTH(33.8353, 319.2050, 0)); // 3031.6983  3031.7149
		System.out.println("6 : " + UniSteamCal.INSTANCE.STEAMPTH(140.4905, 585.8787, 0)); // 3554.7954  3554.9261
		System.out.println("7 : " + UniSteamCal.INSTANCE.STEAMPTH(31.5749, 584.8450, 0)); // 3647.1417  3647.0892
		System.out.println("8 : " + UniSteamCal.INSTANCE.STEAMPTH(3.7641, 261.3592, 0)); // 2988.5473  2988.6191
		
//		System.out.println("1 : " + UniSteamCal.INSTANCE.STEAMPTH(24.4321, 32.8483, 0)); // 139.85527350692195 ��Ż��
//		System.out.println("2 : " + UniSteamCal.INSTANCE.STEAMPTV(24.4321, 32.8483, 0)); // 0.0010042263728834596 specific volume
//		System.out.println("3 : " + UniSteamCal.INSTANCE.STEAMPTW(24.4321, 32.8483, 0)); // 1521.211474324167 speed of sound
//		System.out.println("4 : " + UniSteamCal.INSTANCE.STEAMPTCP(24.4321, 32.8483, 0)); // 4.173208842354766 isobaric heat capacity
//		System.out.println("5 : " + UniSteamCal.INSTANCE.STEAMPTS(24.4321, 32.8483, 0)); // 0.4750783663996059 ��Ʈ����
//		System.out.println("6 : " + UniSteamCal.INSTANCE.STEAMPST(24.4321, 32.8483, 0)); // -1.0
//		System.out.println("7 : " + UniSteamCal.INSTANCE.STEAMPQH(24.4321, 32.8483, 0)); // -1.0
//		System.out.println("8 : " + UniSteamCal.INSTANCE.STEAMPQS(24.4321, 32.8483, 0)); // -1.0
//		System.out.println("9 : " + UniSteamCal.INSTANCE.STEAMPTM(24.4321, 32.8483, 0)); // 7.512324521877508E-4 dynamic viscosity
//		System.out.println("10 : " + UniSteamCal.INSTANCE.STEAMPTK(24.4321, 32.8483, 0)); // 0.6202887564835162 thermal conductivity
//		System.out.println("11 : " + UniSteamCal.INSTANCE.STEAMPHT(24.4321, 32.8483, 0)); // 7.242223502010518
		
//		JniUnisteam jni = new JniUnisteam(); // jni ��ü ����
		
//		System.out.println(jni.IF97STEAMPTH(2.3, 3.3, 1)); // ���� dll ������ ���� ȣ�� �Ұ�
		
	}

}