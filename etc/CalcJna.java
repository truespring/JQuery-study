package com.doosan.test;

import com.doosan.test.JnaUnisteam.UniSteamCal;

public class CalcJna {

	public static void main(String[] args) {

		double cald3 = UniSteamCal.INSTANCE.STEAMPTM(20.6, 32.6, 4); //7.55
		double test = UniSteamCal.INSTANCE.STEAMPTH(24.3249, 79.5708, 0);
		

//		System.out.println("1 : " + UniSteamCal.INSTANCE.STEAMPTH(24.4321, 32.8483, 0)); // 139.8436  139.8552
//		System.out.println("2 : " + UniSteamCal.INSTANCE.STEAMPTH(20.3651, 156.8737, 0)); // 662.7785  662.8714
//		System.out.println("3 : " + UniSteamCal.INSTANCE.STEAMPTH(24.3249, 79.5708, 0)); // 335.1120  335.0485
//		System.out.println("4 : " + UniSteamCal.INSTANCE.STEAMPTH(33.8846, 375.9113, 0)); // 3168.9509  3168.8971
//		System.out.println("5 : " + UniSteamCal.INSTANCE.STEAMPTH(33.8353, 319.2050, 0)); // 3031.6983  3031.7149
//		System.out.println("6 : " + UniSteamCal.INSTANCE.STEAMPTH(140.4905, 585.8787, 0)); // 3554.7954  3554.9261
//		System.out.println("7 : " + UniSteamCal.INSTANCE.STEAMPTH(31.5749, 584.8450, 0)); // 3647.1417  3647.0892
//		System.out.println("8 : " + UniSteamCal.INSTANCE.STEAMPTH(3.7641, 261.3592, 0)); // 2988.5473  2988.6191
		
//		System.out.println("1 : " + UniSteamCal.INSTANCE.STEAMPTH(24.4321, 32.8483, 0)); // 139.85527350692195 엔탈피
//		System.out.println("2 : " + UniSteamCal.INSTANCE.STEAMPTV(24.4321, 32.8483, 0)); // 0.0010042263728834596 specific volume
//		System.out.println("3 : " + UniSteamCal.INSTANCE.STEAMPTW(24.4321, 32.8483, 0)); // 1521.211474324167 speed of sound
//		System.out.println("4 : " + UniSteamCal.INSTANCE.STEAMPTCP(24.4321, 32.8483, 0)); // 4.173208842354766 isobaric heat capacity
//		System.out.println("5 : " + UniSteamCal.INSTANCE.STEAMPTS(24.4321, 32.8483, 0)); // 0.4750783663996059 엔트로피
//		System.out.println("6 : " + UniSteamCal.INSTANCE.STEAMPST(24.4321, 32.8483, 0)); // -1.0
//		System.out.println("7 : " + UniSteamCal.INSTANCE.STEAMPQH(24.4321, 32.8483, 0)); // -1.0
//		System.out.println("8 : " + UniSteamCal.INSTANCE.STEAMPQS(24.4321, 32.8483, 0)); // -1.0
//		System.out.println("9 : " + UniSteamCal.INSTANCE.STEAMPTM(24.4321, 32.8483, 0)); // 7.512324521877508E-4 dynamic viscosity
//		System.out.println("10 : " + UniSteamCal.INSTANCE.STEAMPTK(24.4321, 32.8483, 0)); // 0.6202887564835162 thermal conductivity
//		System.out.println("11 : " + UniSteamCal.INSTANCE.STEAMPHT(24.4321, 32.8483, 0)); // 7.242223502010518
		

//		System.out.println("0 : 	" + UniSteamCal.INSTANCE.STEAMPTH(24.4321, 32.8483, 0));
//		System.out.println("1 : 	" + UniSteamCal.INSTANCE.STEAMPTH(24.4321, 32.8483, 1));
//		System.out.println("2 : 	" + UniSteamCal.INSTANCE.STEAMPTH(24.4321, 32.8483, 2));
//		System.out.println("3 : 	" + UniSteamCal.INSTANCE.STEAMPTH(24.4321, 32.8483, 3));
//		System.out.println("4 : 	" + UniSteamCal.INSTANCE.STEAMPTH(24.4321, 32.8483, 4));
//		System.out.println("5 : 	" + UniSteamCal.INSTANCE.STEAMPTH(24.4321, 32.8483, 5));
//		System.out.println("6 : 	" + UniSteamCal.INSTANCE.STEAMPTH(24.4321, 32.8483, 6));
//		System.out.println("7 : 	" + UniSteamCal.INSTANCE.STEAMPTH(24.4321, 32.8483, 7));
//		System.out.println("8 : 	" + UniSteamCal.INSTANCE.STEAMPTH(24.4321, 32.8483, 8));
//		System.out.println("9 : 	" + UniSteamCal.INSTANCE.STEAMPTH(24.4321, 32.8483, 9));
//		System.out.println("10 : 	" + UniSteamCal.INSTANCE.STEAMPTH(24.4321, 32.8483, 10));
		System.out.println("0 : 	" + UniSteamCal.INSTANCE.STEAMPTH(0.0397797208527778, 28.886, 0));
		System.out.println("0 : 	" + UniSteamCal.INSTANCE.STEAMPTH(0.03978, 28.866, 0));
		System.out.println("0 : 	" + UniSteamCal.INSTANCE.STEAMPTH(0.03978, 28.867, 0));
//		System.out.println("1 : 	" + UniSteamCal.INSTANCE.STEAMPTH(0.0397797, 32.8, 1));
//		System.out.println("2 : 	" + UniSteamCal.INSTANCE.STEAMPTH(0.0397797, 32.8, 2));
//		System.out.println("3 : 	" + UniSteamCal.INSTANCE.STEAMPTH(0.0397797, 32.8, 3));
//		System.out.println("4 : 	" + UniSteamCal.INSTANCE.STEAMPTH(0.0397797, 32.8, 4));
//		System.out.println("5 : 	" + UniSteamCal.INSTANCE.STEAMPTH(0.0397797, 32.8, 5));
//		System.out.println("6 : 	" + UniSteamCal.INSTANCE.STEAMPTH(0.0397797, 32.8, 6));
//		System.out.println("7 : 	" + UniSteamCal.INSTANCE.STEAMPTH(0.0397797, 32.8, 7));
//		System.out.println("8 : 	" + UniSteamCal.INSTANCE.STEAMPTH(0.0397797, 32.8, 8));
//		System.out.println("9 : 	" + UniSteamCal.INSTANCE.STEAMPTH(0.0397797, 32.8, 9));
//		System.out.println("10 : 	" + UniSteamCal.INSTANCE.STEAMPTH(0.0397797, 32.8, 10));

//		System.out.println("STEAMPST : 	" + UniSteamCal.INSTANCE.STEAMPST(0.0397797, 32.8, 0));
//		System.out.println("STEAMPQH : 	" + UniSteamCal.INSTANCE.STEAMPQH(0.0397797, 32.8, 0));
//		System.out.println("STEAMPQS : 	" + UniSteamCal.INSTANCE.STEAMPQS(0.0397797, 32.8, 0));
//		System.out.println("STEAMPTM : 	" + UniSteamCal.INSTANCE.STEAMPTM(0.0397797, 32.8, 0));
//		System.out.println("STEAMPTK : 	" + UniSteamCal.INSTANCE.STEAMPTK(0.0397797, 32.8, 0));
//		System.out.println("STEAMPHT : 	" + UniSteamCal.INSTANCE.STEAMPHT(0.0397797, 32.8, 0));
		
//		System.out.println("STEAMPT : " + UniSteamCal.INSTANCE.STEAMPT(0.0397797, 0));
//		System.out.println("STEAMPT : " + UniSteamCal.INSTANCE.STEAMPT(0.0397797, 1));
//		System.out.println("STEAMPT : " + UniSteamCal.INSTANCE.STEAMPT(0.0397797, 2));
//		System.out.println("STEAMPT : " + UniSteamCal.INSTANCE.STEAMPT(0.0397797, 3));
//		System.out.println("STEAMPT : " + UniSteamCal.INSTANCE.STEAMPT(0.0397797, 4));
//		System.out.println("STEAMPT : " + UniSteamCal.INSTANCE.STEAMPT(0.0397797, 5));
//		System.out.println("STEAMPT : " + UniSteamCal.INSTANCE.STEAMPT(0.0397797, 6));
//		System.out.println("STEAMPT : " + UniSteamCal.INSTANCE.STEAMPT(0.0397797, 7));
//		System.out.println("STEAMPT : " + UniSteamCal.INSTANCE.STEAMPT(0.0397797, 8));
//		System.out.println("STEAMPT : " + UniSteamCal.INSTANCE.STEAMPT(0.0397797, 9));
		
		
//		System.out.println("0 : 	" + UniSteamCal.INSTANCE.STEAMPT(0.045760, 0));
//		System.out.println("1 : 	" + UniSteamCal.INSTANCE.STEAMTP(0.045760, 0));

//		double testInterface = JnaUniSteamInterface.INSTANCE.STEAMPTH(24.4321, 32.8483, 0);
//		System.out.println("testInterface : " + testInterface);
		
//		JniUnisteam jni = new JniUnisteam(); // jni 객체 생성
		
//		System.out.println(jni.IF97STEAMPTH(2.3, 3.3, 1)); // 실제 dll 파일이 없어 호출 불가
		
	}

}
