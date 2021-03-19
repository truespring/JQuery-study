package com.doosan.test;

import java.util.ArrayList;
import java.util.List;

public class Calc3 {
	// 1CC
//	static double E3 = 18.628866;
//	static double E4 = 1010.1169;
//	static double E5 = 26.2681;
//	static double E6 = 19.4298;
//	static double E7 = 994.7201;
//	static double E8 = 454.8129;
//	static double E9 = 20.3199;
//	static double E12 = 39.8895;
//	static double E13 = 29215.6015;
//	static double E14 = 0.0445;
//	static double E16 = 1758.94018527778;
//	static double E18 = 34.8257;
//	static double E19 = 214.2;
//	static double E20 = 286.5988;
//	static double E21 = 146.6331;
//	static double E22 = 424.5715;
//	static double E23 = 0.980007993083333;
//	static double E24 = 60.0041;
//	static double E26 = 0.1012;
//	static double E27 = 92.8093;
//	static double E28 = 5.1463;
//	static double E29 = 1.3554;
//	static double E30 = 0.3083;
//	static double E31 = 0.2503;
//	static double E32 = 0.0072;
//	static double E33 = 0.022;
	
//	static double E36 = 49515.4786;
//	static double E37 = 54861.2712;
//	static double E41 = 7.64;
//	static double E43 = 4.59; // TODO 변수로 받아야 할 값 index
//	static double E44 = 7.91; // TODO 변수로 받아야 할 값 index
//	static double E45 = 0.1; // TODO 변수로 받아야 할 값 index
//	static double E46 = -0.01; // TODO 변수로 받아야 할 값 index
//	static double E48 = 29.471615; // TODO 변수로 받아야 할 값
//	static double E50 = 2.87;
//	static double E53 = E4 - E7;
//	static double E98 = 4;
//	static double E99 = 3;
//	static double E100 = 1.6;
//	static double E101 = 0.5;
//	static double E102 = 0; // 소수자리 늘려도 0
//	static double E103 = 0; // 소수자리 늘려도 0
//	static double E107 = 29000; // index
//	static double E108 = 30000; // index
//	static double E109 = 0.9784; // index
//	static double E110 = 0.9782; // index
//	static double E150 = 29000; // index
//	static double E151 = 30000; // index
//	static double E152 = 1.013; // index
//	static double E153 = 1.013; // index

	// 10ST
	static double F19 = 146.63;
	static double F24 = 86.0846;
//	static double F23 = 3522.2;
//	static double F26 = 3167.4;
//	static double F29 = 3644.0491;
//	static double F32 = 2979.6;
//	static double F35 = 129.196;
	static double F27 = 86.0846;
	static double F30 = 97.369;
	static double F33 = 8.383;
	static double F37 = 29.5316;

	// 10Cond
//	static double G7 = 23.2147;
//	static double G8 = 30.4578;
//	static double G11 = 85.9877;
//	static double G16 = 71.1273;
//	static double G19 = 8.4902;
//	static double G20 = 106.3315;
//	static double G21 = 0.0039;
//	static double G22 = 146.217;
//	static double G25 = 31.326;
//	static double G27 = 131.2018;
//	static double G31 = 3523.1795;
//	static double G34 = 3167.9279;
//	static double G37 = 3637.3086;
//	static double G40 = 2978.4236;
//	static double G43 = 131.2018;
//	static double G45 = 106.3276;

	// 11HRSG
//	static double H14 = E3 * 9 / 5 + 32;
//	static double H20 = -10214.165;
//	static double H21 = -4.8932428;
//	static double H22 = -0.0053765794;
//	static double H23 = 0.00000019202377;
//	static double H24 = 0.00000000035575832;
//	static double H25 = -9.0344688E-14;
//	static double H26 = 4.1635019;
//	static double H27 = -10440.397;
//	static double H28 = -11.29465;
//	static double H29 = -0.027022355;
//	static double H30 = 0.00001289036;
//	static double H31 = -0.0000000024780681;
//	static double H32 = 0; // 소수자리 늘려도 값이 없음
//	static double H33 = 6.5459673;
//	static double H80 = E26 / 100; // H는 1이 100%이기 때문에 100으로 나눠줌
//	static double H81 = E27 / 100;
//	static double H82 = E28 / 100;
//	static double H83 = E29 / 100;
//	static double H84 = E30 / 100;
//	static double H85 = E31 / 100;
//	static double H86 = E32 / 100;
//	static double H87 = E33 / 100;
	static double F94_H = 6564.7026; // 다른 열의 값을 참고함
	static double H96 = 0.02834964176; // TODO 11HRSG는 나중에
	static double H133 = 0;
	static double H229 = -2.4896;
	static double H230 = -2.1977;
	static double H231 = -2.0137;
	static double H232 = -1.2461;
	static double H233 = -4.4632;
	static double H239 = 285.8744;
	static double H240 = 264.3822;
	static double H241 = 280.3781;
	static double H242 = 137.4535;
	static double H243 = 535.607;
	static double H246 = 21302;
	static double H247 = 570;
	static double H248 = 357;
	static double H257 = 285.87;
	static double H258 = 264.38;
	static double H259 = 280.38;
	static double H260 = 137.45;
	static double H261 = 536.61;
	static double H289 = 103.1737;
	static double H292 = 138.0052;
	static double H293 = 18.0636;
	static double H296 = 658.9992;
	static double H297 = 9.1536;
	static double H300 = 331.9321;
	static double H304 = 3168.2941;
	static double H305 = 86.5416;
	static double H308 = 3032.64;
	static double H309 = 10.619;
	static double H314 = 3554.0094;
	static double H315 = 86.0846;
	static double H319 = 3645.8798;
	static double H320 = 97.369;
	static double H324 = 2989.5511;
	static double H325 = 8.383;

	public static void main(String[] args) {
		// 1CC
//		double E36 = 49515.4786;
//		double E37 = 54861.2712;
//		double E41 = 7.64;
//		double E43 = 4.59; // TODO index
//		double E44 = 7.91; // TODO index
//		double E45 = 0.1; // TODO index
//		double E46 = -0.01; // TODO index
//		double E48 = 29.471615; // TODO 변수로 받아야 할 값
//		double E50 = 2.87;
//		double E98 = 4;
//		double E99 = 3;
//		double E100 = 1.6;
//		double E101 = 0.5;
//		double E102 = 0; // 소수자리 늘려도 0
//		double E103 = 0; // 소수자리 늘려도 0
//		double E107 = 29000; // TODO index
//		double E108 = 30000; // TODO index
//		double E109 = 0.9784; // TODO index
//		double E110 = 0.9782; // TODO index
//		double E150 = 29000; // TODO index
//		double E151 = 30000; // TODO index
//		double E152 = 1.013; // TODO index
//		double E153 = 1.013; // TODO index
		Calc3 calc3 = new Calc3();
		double E3 = 19.5606;
		double E4 = 1011.2395;
		double E5 = 27.7924;
		double E6 = 20.3092;
		double E7 = 995.8692;
		double E8 = 455.6303;
		double E9 = 20.2521;
		double E12 = 39.6566;
		double E13 = 29047.6091;
		double E14 = 0.0458;
		double E16 = 1756.7589;
		double E18 = 34.6670;
		double E19 = 214.0928;
		double E20 = 285.3899;
		double E21 = 146.2170;
		double E22 = 422.8073;
		double E23 = 0.9799;
		double E24 = 60.0027;
		double E27 = 92.7128;
		double E28 = 5.5314;
		double E29 = 1.1029;
		double E30 = 0.2694;
		double E31 = 0.2635;
		double E32 = 0.0039;
		double E33 = 0.0129;
		double E36 = 49369.2005;
		double E37 = 54697.2727;
		double E41 = 7.6585;
		double E48 = 29.5841;
		double E50 = 2.8689;
//		System.out.println("Gross Power : " + (calc3.get1CCgrossPower(E3, E4, E5, E6, E7, E14, E18, E20, E21, E23, E24, E27, E28, E29, E30, E31, E32, E33, E36))); // 1
//		System.out.println("Net Power : " + (calc3.get1CCnetPower(E3, E4, E5, E6, E7, E14, E18, E20, E21, E22, E23, E24, E27, E28, E29, E30, E31, E32, E33, E36))); // 2
//		System.out.println("Gross Efficiency : " + getRound(calc3.get1CCgrossEfficiency(E3, E4, E5, E6, E7, E14, E16, E18, E20, E21, E23, E24, E37, E41, E48))); // 3
//		System.out.println("Net Efficiency : " + getRound(calc3.get1CCnetEfficiency(E3, E4, E5, E6, E7, E14, E16, E18, E20, E21, E22, E23, E24, E37, E41, E48))); // 4
//		System.out.println("11GT Gross Power : " + getRound(calc3.get1CCgt11GrossPower(E3, E4, E5, E6, E7, E12, E13, E20, E24, E27, E28, E29, E30, E31, E32, E33, E36))); // 5
//		System.out.println("11GT Designed Power : " + getRound(calc3.get1CCgt11DesignedPower(E13))); // 6
//		System.out.println("11GT Gross Efficiency : " + getRound(calc3.get1CCgt11GrossEfficiency(E3, E4, E5, E6, E7, E13, E16, E19, E20, E24, E27, E28, E29, E30, E31, E32, E33, E36, E41, E48, E50))); // 7
//		System.out.println("11GT Designed Efficiency : " + getRound(calc3.get1CCgt11DesignedEfficiency(E13))); // 8
//		System.out.println("11GT Compr. Efficiency(Polytropic) : " + getRound(calc3.get1CCgt11ComprEfficiencyPolytropic(E6, E7, E8, E9))); // 9
//		System.out.println("11GT Pressrurue Ratio : " + getRound(calc3.get1CCgt11PressrurueRatio(E7, E9))); // 10
//		System.out.println();
		
		// 10ST
		double F23 = 3522.2031;
		double F26 = 3167.3549;
		double F29 = 3644.0491;
		double F32 = 2979.5902;
		double F35 = 129.196;
		System.out.println("10ST Power output : " + getRound(calc3.get10STst10PowerOutput(F19)));
		System.out.println("10ST Energy In : " + getRound(calc3.get10STst10EnergyIn(F23, F24, F26, F27, F29, F30, F32, F33, F35, F37)));
		System.out.println("10ST Efficiency : " + getRound(calc3.get10STst10Efficiency(F19, F23, F24, F26, F27, F29, F30, F32, F33, F35, F37)));
		System.out.println();

//		double G3 = 19.5606;
//		double G5 = 27.7924;
//		double G25 = 31.326;
//		double G27 = 131.2018;
//		double G31 = 3523.1795;
//		double G34 = 3167.9279;
//		double G37 = 3637.3086;
//		double G40 = 2978.4236;
//		double G43 = 131.2018;
		// 10Cond
		double G3 = -0.8579292;
		double G5 = 46.5965;
		double G7 = 19.76779;
		double G8 = 22.83673;
		double G11 = 89.07769;
		double G16 = 34.61304;
		double G19 = 8.580707;
		double G20 = 45.44906;
		double G21 = 0.002531829;
		double G22 = 110.6257;
		double G25 = 31.326;
		double G27 = 131.2018;
		double G31 = 3523.1795;
		double G34 = 3167.9279;
		double G37 = 3637.3086;
		double G40 = 2978.4236;
		double G43 = 131.2018;
//		System.out.println("10Cond. P : " + calc3.get10Condcond10P());
//		System.out.println("10Cond. Sat. T : " + getRound(calc3.get10Condcond10SatT()));
//		System.out.println("TTD : " + getRound(calc3.get10CondtTD(G8, G25)));
		System.out.println("ITD : " + getRound(calc3.get10CondiTD(G3, G5, G25)));
//		System.out.println("CW T Rise : " + getRound(calc3.get10CondcWTRise(G7, G8)));
//		System.out.println("ST UEEP : " + getRound(calc3.get10CondsTUEEP(G11, G16, G19, G20, G22, G31, G34, G37, G40, G43, G45)));
//		System.out.println("Condensate Water H : " + getRound(calc3.get10CondcondensateWaterH(G27)));
//		System.out.println("Condensate Water F : " + getRound(calc3.get10CondcondensateWaterF(G20)));
//		System.out.println("Condenser Heat Load : " + getRound(calc3.get10CondcondenserHeatLoad(G11, G16, G19, G20, G21, G22, G27, G31, G34, G37, G40, G43, G45)));
		System.out.println("10Cond. Cleanliness : " + getRound(calc3.get10Condcond10Cleanliness(G3, G5, G7, G8, G11, G16, G19, G20, G21, G22, G25, G27, G31, G34, G37, G40, G43)));
		System.out.println();

		// 11HRSG TODO 나중에
//		calc3.get11HRSGenergyIn(E3, E4, E5, E16, E20, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48, H96, H229, H230, H231, H232, H233, H239, H240, H241, H242, H243, H246, H247, H248, H257, H258, H259, H260, H261);
//		calc3.get11HRSGenergyOut(E3, E4, E5, E16, E20, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48, H96, H229, H230, H231, H232, H233, H239, H240, H241, H242, H243, H246, H247, H248, H257, H258, H259, H260, H261);
//		calc3.get11HRSGenergyGain(H289, H292, H293, H296, H297, H300, H304, H305, H308, H309, H314, H315, H319, H320, H324, H325);
//		calc3.get11HRSGefficiency(E3, E4, E5, E16, E20, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48, H96, H229, H230, H231, H232, H233, H239, H240, H241, H242, H243, H246, H247, H248, H257, H258, H259, H260, H261, H289, H292, H293, H296, H297, H300, H304, H305, H308, H309, H314, H315, H319, H320, H324, H325);
	}

	// 1CC start
	// 1CC 1번
	public double get1CCgrossPower(double E3, double E4, double E5, double E6, double E7, double E14, double E18, double E20, double E21, double E23, double E24, double E27, double E28, double E29, double E30, double E31, double E32, double E33, double E36) {
		/*
		 * E20 = Elec.11GT Gross Power 
		 * E21 = Elec.10ST Gross Power 
		 * E155 = P Correction_Additive Correction 
		 * E157 = P Correction_Power Correction Product
		 */
		double grossPower = (E20 + E21 + getE155(E20, E21, E23) / 1000) * getE157(E3, E4, E5, E6, E7, E14, E18, E24, E27, E28, E29, E30, E31, E32, E33, E36);
//		System.out.printf("Gross Power : %.4f\n", grossPower); // 1번
		return grossPower;
	}

	// 1CC 2번
	public double get1CCnetPower(double E3, double E4, double E5, double E6, double E7, double E14, double E18, double E20, double E21, double E22, double E23, double E24, double E27, double E28, double E29, double E30, double E31, double E32, double E33, double E36) {
		/*
		 * E22 = Elec.Net Power 
		 * E155 = P Correction_Additive Correction 
		 * E157 = P Correction_Power Correction Product
		 */
		double netPower = (E22 + getE155(E20, E21, E23) / 1000) * getE157(E3, E4, E5, E6, E7, E14, E18, E24, E27, E28, E29, E30, E31, E32, E33, E36);
//		System.out.printf("Net Power : %.4f\n", netPower); // 2번
		return netPower;
	}

	// 1CC 3번
	public double get1CCgrossEfficiency(double E3, double E4, double E5, double E6, double E7, double E14, double E16, double E18, double E20, double E21, double E23, double E24, double E37, double E41, double E48) {
		double E53 = E4 - E7;
		/*
		 * E20 = Elec.11GT Gross Power 
		 * E21 = Elec.10ST Gross Power 
		 * E37 = HHV 
		 * E49 = Flow meter_11GT Mass Flow 
		 * E155 = P Correction_Additive Correction 
		 * E172 = Combined Cycle_HR Correction Product
		 */
		double grossEfficiency = (E20 + E21 + getE155(E20, E21, E23) / 1000) / (getE49(E16, E41, E48) / 3600 * E37 / 1000) * getE172(E3, E4, E5, E6, E7, E14, E18, E24); 
//		System.out.printf("Gross Efficiency : %.4f\n", grossEfficiency * 100); // 3번
		return grossEfficiency * 100;
	}

	// 1CC 4번
	public double get1CCnetEfficiency(double E3, double E4, double E5, double E6, double E7, double E14, double E16, double E18, double E20, double E21, double E22, double E23, double E24, double E37, double E41, double E48) {
		double E53 = E4 - E7;
		/*
		 * E22 = Elec.Net Power 
		 * E37 = HHV 
		 * E49 = Flow meter_11GT Mass Flow 
		 * E155 = P Correction_Additive Correction 
		 * E172 = Combined Cycle_HR Correction Product
		 */
		double netEfficiency = (E22 + getE155(E20, E21, E23) / 1000) / (getE49(E16, E41, E48) / 3600 * E37 / 1000) * getE172(E3, E4, E5, E6, E7, E14, E18, E24); 
//		System.out.printf("Net Efficiency : %.4f\n", netEfficiency * 100); // 4번
		return netEfficiency * 100;
	}

	// 1CC 5번
	public double get1CCgt11GrossPower(double E3, double E4, double E5, double E6, double E7, double E12, double E13, double E20, double E24, double E27, double E28, double E29, double E30, double E31, double E32, double E33, double E36) {
		double E56 = -0.00809296 * Math.pow((0.001 * E4), 2) + 1.02802 * (0.001 * E4) - 0.0330795;
		double E53 = E4 - E7;
		double E57 = -0.00129716 * (E53) + 1.01038;
		double E58 = 0;
		if (E6 < 15) {
			E58 = -0.00000101272 * Math.pow(E6, 3) - 0.0000216136 * Math.pow(E6, 2) - 0.00283226 * (E6) + 1.05076;
		} else {
			E58 = -0.000000899352 * Math.pow(E6, 3) + 0.00000117656 * Math.pow(E6, 2) - 0.00445136 * (E6) + 1.06954;
		}
		double E60 = E3;
		List<Number> relTest = new ArrayList<Number>();
		relTest.add(0);
		relTest.add(15);
		relTest.add(25);
		relTest.add(35);
		relTest.add(45);
		double E61 = getIndex(relTest, getMatch(E60, relTest, 1));
		double E62 = getIndex(relTest, getMatch(E60, relTest, 1) + 1);
		double E65 = -0.000000935858 * Math.pow((0.01 * E5), 3) - 0.0000141332 * Math.pow((0.01 * E5), 2) + 0.00381307 * (0.01 * E5) + 0.997717;
		double E66 = -0.0000553283 * Math.pow((0.01 * E5), 3) - 0.000688925 * Math.pow((0.01 * E5), 2) + 0.00787826 * (0.01 * E5) + 0.995533;
		double E67 = -0.0000548537 * Math.pow((0.01 * E5), 3) - 0.000691077 * Math.pow((0.01 * E5), 2) + 0.00786734 * (0.01 * E5) + 0.99554;
		double E68 = 0.0000468319 * Math.pow((0.01 * E5), 3) - 0.00547762 * Math.pow((0.01 * E5), 2) + 0.00715796 * (0.01 * E5) + 0.997667;
		double E69 = 0.0055358 * Math.pow((0.01 * E5), 3) - 0.0286947 * Math.pow((0.01 * E5), 2) - 0.00528963 * (0.01 * E5) + 1.01231;
		List<Number> e5Arr = new ArrayList<Number>();
		e5Arr.add(E65);
		e5Arr.add(E66);
		e5Arr.add(E67);
		e5Arr.add(E68);
		e5Arr.add(E69);
		double E63 = getIndex(e5Arr, getMatch(E60, relTest, 1));
		double E64 = getIndex(e5Arr, getMatch(E60, relTest, 1) + 1);
		double E59 = E63 + (E60 - E61) * (E64 - E63) / (E62 - E61);
		double E71 = E3;
		List<Number> speedTest = new ArrayList<Number>();
		speedTest.add(0);
		speedTest.add(15);
		speedTest.add(25);
		speedTest.add(32);
		speedTest.add(46);
		double E72 = getIndex(speedTest, getMatch(E71, speedTest, 1));
		double E73 = getIndex(speedTest, getMatch(E71, speedTest, 1) + 1);
		double E76 = 174.706 * Math.pow((E24 / 60), 3) - 538.226 * Math.pow((E24 / 60), 2) + 551.577 * (E24 / 60) - 187.057;
		double E77 = -112.386 * Math.pow((E24 / 60), 3) + 301.717 * Math.pow((E24 / 60), 2) - 265.928 * (E24 / 60) + 77.597;
		double E78 = 225.864 * Math.pow((E24 / 60), 3) - 710.323 * Math.pow((E24 / 60), 2) + 744.364 * (E24 / 60) - 258.905;
		double E79 = -19.4615 * Math.pow((E24 / 60), 3) + 21.6669 * Math.pow((E24 / 60), 2) + 17.2299 * (E24 / 60) - 18.4353;
		double E80 = -527.474 * Math.pow((E24 / 60), 3) + 1545.48 * Math.pow((E24 / 60), 2) - 1503.97 * (E24 / 60) + 486.964;
		List<Number> e24Arr = new ArrayList<Number>();
		e24Arr.add(E76);
		e24Arr.add(E77);
		e24Arr.add(E78);
		e24Arr.add(E79);
		e24Arr.add(E80);
		double E74 = getIndex(e24Arr, getMatch(E60, speedTest, 1));
		double E75 = getIndex(e24Arr, getMatch(E60, speedTest, 1) + 1);
		double E70 = E74 + (E71 - E72) * (E75 - E74) / (E73 - E72);
		double E82 = getE35(E27, E28, E29, E30, E31, E32, E33);
		List<Number> gasTest = new ArrayList<Number>();
		gasTest.add(2.979);
		gasTest.add(3.155);
		gasTest.add(3.3);
		gasTest.add(3.45);
		double E83 = getIndex(gasTest, getMatch(E82, gasTest, 1));
		double E84 = getIndex(gasTest, getMatch(E82, gasTest, 1) + 1);
		double E87 = 0.0000311312 * Math.pow((E36 / 1000), 2) - 0.00391754 * (E36 / 1000) + 1.12045;
		double E88 = 0.0000309164 * Math.pow((E36 / 1000), 2) - 0.00389258 * (E36 / 1000) + 1.11677;
		double E89 = 0.0000314845 * Math.pow((E36 / 1000), 2) - 0.00393467 * (E36 / 1000) + 1.11524;
		double E90 = 0.0000318051 * Math.pow((E36 / 1000), 2) - 0.00395701 * (E36 / 1000) + 1.11333;
		List<Number> e36Arr = new ArrayList<Number>();
		e36Arr.add(E87);
		e36Arr.add(E88);
		e36Arr.add(E89);
		e36Arr.add(E90);
		double E85 = getIndex(e36Arr, getMatch(E82, gasTest, 1));
		double E86 = getIndex(e36Arr, getMatch(E82, gasTest, 1) + 1);
		double E81 = E85 + (E82 - E83) * (E86 - E85) / (E84 - E83);
		double E98 = 4;
		double E99 = 3;
		double E100 = 1.6;
		double E101 = 0.5;
		double E102 = 0;
		double E103 = 0;
		double E91 = -0.00000275451 * Math.pow(getE92(E3), 2) + 0.00196996 * getE92(E3) + 1;
		double E104 = -0.000000706787 * Math.pow(E12, 2) - 0.000211037 * (E12) + 1.01134;
		
		List<Double> e55Arr = new ArrayList<Double>();
		e55Arr.add(E56);
		e55Arr.add(E57);
		e55Arr.add(E58);
		e55Arr.add(E59);
		e55Arr.add(E70);
		e55Arr.add(E81);
		e55Arr.add(E91);
		e55Arr.add(E104);
		e55Arr.add(getE105(E13));
		double E55 = getProduct(e55Arr) / 0.9972;
		/*
		 * E20 = Elec.11GT Gross Power 
		 * E55 = P Correction_11GT Power Correction Product
		 * E105 = P Correction_11GT Equivalent Box Hours
		 */
		double gt11GrossPower = E20 / E55 * getE105(E13);
//		System.out.printf("11GT Gross Power : %.4f\n", gt11GrossPower); // 5번
		return gt11GrossPower;
	}

	// 1CC 6번
	public double get1CCgt11DesignedPower(double E13) {
		double T192 = 292.012;
		/*
		 * E105 = P Correction_11GT Equivalent Box Hours
		 */
		double gt11DesignedPower = T192 * getE105(E13);
//		System.out.printf("11GT Designed Power : %.4f\n", gt11DesignedPower); // 6번
		return gt11DesignedPower;
	}

	// 1CC 7번
	public double get1CCgt11GrossEfficiency(double E3, double E4, double E5, double E6, double E7, double E13, double E16, double E19, double E20, double E24, double E27, double E28, double E29, 
			double E30, double E31, double E32, double E33, double E36, double E41, double E48, double E50) {
		double E51 = E50 * (E19 - 15);
		double E52 = getE49(E16, E41, E48) * (E36 + E51) / 3600;
		double E112 = 0;
		if (E6 < 15) {
			E112 = 0.00000998827 * Math.pow(E6, 2) - 0.0000390012 * (E6) + 0.998338;
		} else {
			E112 = 0.0000816215 * Math.pow(E6, 2) - 0.00254304 * (E6) + 1.01978;
		}
		double E53 = E4 - E7;
		double E113 = 0.000303968 * E53 + 0.997568;
		double E115 = E3;
		List<Number> rel_HRArr = new ArrayList<Number>();
		rel_HRArr.add(0);
		rel_HRArr.add(15);
		rel_HRArr.add(25);
		rel_HRArr.add(35);
		rel_HRArr.add(45);
		double E116 = getIndex(rel_HRArr, getMatch(E115, rel_HRArr, 1));
		double E117 = getIndex(rel_HRArr, getMatch(E115, rel_HRArr, 1) + 1);
		double E120 = 0.000012196 * Math.pow((0.01 * E5), 2) + 0.000130036 * (0.01 * E5) + 0.999918;
		double E121 = 0.000270936 * Math.pow((0.01 * E5), 2) + 0.0012887 * (0.01 * E5) + 0.999129;
		double E122 = 0.000631947 * Math.pow((0.01 * E5), 2) + 0.00344285 * (0.01 * E5) + 0.997707;
		double E123 = 0.00228459 * Math.pow((0.01 * E5), 2) + 0.0076479 * (0.01 * E5) + 0.994589;
		double E124 = 0.00615837 * Math.pow((0.01 * E5), 2) + 0.0266238 * (0.01 * E5) + 0.981809;
		List<Number> e115Arr = new ArrayList<Number>();
		e115Arr.add(E120);
		e115Arr.add(E121);
		e115Arr.add(E122);
		e115Arr.add(E123);
		e115Arr.add(E124);
		double E118 = getIndex(e115Arr, getMatch(E115, rel_HRArr, 1));
		double E119 = getIndex(e115Arr, getMatch(E115, rel_HRArr, 1) + 1);
		double E126 = E3;
		List<Number> speed_HRArr = new ArrayList<Number>();
		speed_HRArr.add(0);
		speed_HRArr.add(15);
		speed_HRArr.add(25);
		speed_HRArr.add(32);
		speed_HRArr.add(46);
		double E127 = getIndex(speed_HRArr, getMatch(E126, speed_HRArr, 1));
		double E128 = getIndex(speed_HRArr, getMatch(E126, speed_HRArr, 1) + 1);
		double E131 = 8.56974 * Math.pow((E24 / 60), 2) - 16.772 * (E24 / 60) + 9.20226;
		double E132 = 14.2284 * Math.pow((E24 / 60), 2) - 28.4244 * (E24 / 60) + 15.196;
		double E133 = 13.0933 * Math.pow((E24 / 60), 2) - 26.4545 * (E24 / 60) + 14.3612;
		double E134 = 15.4076 * Math.pow((E24 / 60), 2) - 31.3277 * (E24 / 60) + 16.9201;
		double E135 = 24.1123 * Math.pow((E24 / 60), 2) - 49.827 * (E24 / 60) + 26.7147;
		List<Number> e126Arr = new ArrayList<Number>();
		e126Arr.add(E131);
		e126Arr.add(E132);
		e126Arr.add(E133);
		e126Arr.add(E134);
		e126Arr.add(E135);
		double E129 = getIndex(e126Arr, getMatch(E126, speed_HRArr, 1));
		double E130 = getIndex(e126Arr, getMatch(E126, speed_HRArr, 1) + 1);
		double E125 = E129 + (E126 - E127) * (E130 - E129) / (E128 - E127);
		double E114 = E118 + (E115 - E116) * (E119 - E118) / (E117 - E116);
		double E137 = getE35(E27, E28, E29, E30, E31, E32, E33);
		List<Number> gas_HRTest = new ArrayList<Number>();
		gas_HRTest.add(2.979);
		gas_HRTest.add(3.155);
		gas_HRTest.add(3.3);
		gas_HRTest.add(3.45);
		double E138 = getIndex(gas_HRTest, getMatch(E137, gas_HRTest, 1));
		double E139 = getIndex(gas_HRTest, getMatch(E137, gas_HRTest, 1) + 1);
		double E142 = -0.00000921516 * Math.pow((0.001 * E36), 2) + 0.00119282 * (0.001 * E36) + 0.962838;
		double E143 = -0.00000923981 * Math.pow((0.001 * E36), 2) + 0.00119605 * (0.001 * E36) + 0.96349;
		double E144 = -0.00000945902 * Math.pow((0.001 * E36), 2) + 0.00121527 * (0.001 * E36) + 0.963644;
		double E145 = -0.00000961569 * Math.pow((0.001 * E36), 2) + 0.00122947 * (0.001 * E36) + 0.963899;
		List<Number> e137Arr = new ArrayList<Number>();
		e137Arr.add(E142);
		e137Arr.add(E143);
		e137Arr.add(E144);
		e137Arr.add(E145);
		double E140 = getIndex(e137Arr, getMatch(E137, gas_HRTest, 1));
		double E141 = getIndex(e137Arr, getMatch(E137, gas_HRTest, 1) + 1);
		double E136 = E140 + (E137 - E138) * (E141 - E140) / (E139 - E138);
		double E146 = 0.00000203144 * Math.pow(getE92(E3), 2) - 0.0000754444 * getE92(E3) + 1;
		List<Double> e111Arr = new ArrayList<Double>();
		e111Arr.add(E112);
		e111Arr.add(E113);
		e111Arr.add(E114);
		e111Arr.add(E125);
		e111Arr.add(E136);
		e111Arr.add(E146);
		e111Arr.add(getE148(E13));
		double E111 = getProduct(e111Arr) / 1.0007;
		/*
		 * E20 = Elec.11GT Gross Power 
		 * E52 = 11GT Fuel Qinput 
		 * E111 = HR Correction_11GT HR Correction Product 
		 * E148 = HR Correction_11GT Equivalent Box Hours
		 */
		double gt11GrossEfficiency = (E20 * 1000) / E52 * (E111 / getE148(E13));
//		System.out.printf("11GT Gross Efficiency : %.4f\n", gt11GrossEfficiency * 100); // 7번
		return gt11GrossEfficiency * 100;
	}

	// 1CC 8번
	public double get1CCgt11DesignedEfficiency(double E13) {
		double T194 = 0.3957;
		/*
		 * E148 = HR Correction_11GT Equivalent Box Hours
		 */
		double gt11DesignedEfficiency = T194 / getE148(E13);
//		System.out.printf("11GT Designed Efficiency : %.4f\n", gt11DesignedEfficiency * 100); // 8번
		return gt11DesignedEfficiency * 100;
	}

	// 1CC 9번
	public double get1CCgt11ComprEfficiencyPolytropic(double E6, double E7, double E8, double E9) {
		/*
		 * E6 = GT_11Comp. Tin 
		 * E7 = GT_11Comp. Pin 
		 * E8 = GT_11Comp. Tout 
		 * E9 = GT_11Comp. Pout
		 */
		double gt11ComprEfficiencyPolytropic = (0.4 / 1.4) * Math.log(E9 / (E7 / 1000))
				/ Math.log((E8 + 273.15) / (E6 + 273.15));
//		System.out.printf("11GT Compr. Efficiency(Polytropic) : %.4f\n", gt11ComprEfficiencyPolytropic * 100); // 9번
		return gt11ComprEfficiencyPolytropic * 100;
	}

	// 1CC 10번
	public double get1CCgt11PressrurueRatio(double E7, double E9) {
		/*
		 * E7 = GT_11Comp. Pin 
		 * E9 = GT_11Comp. Pout
		 */
		double gt11PressrurueRatio = E9 * 1000 / E7;
//		System.out.printf("11GT Pressrurue Ratio : %.4f\n", gt11PressrurueRatio); // 10번
		return gt11PressrurueRatio;
	}
	// 1CC end
	
	// 10ST start
	// 10ST 1번
	// 1CC end

	// 10ST start
	// 10ST 1번
	public double get10STst10PowerOutput(double F19) {
		double st10PowerOutput = F19;
//		System.out.printf("10ST Power output : %.4f\n", st10PowerOutput); // 1번
		return st10PowerOutput;
	}
	
	// 10ST 2번
	public double get10STst10EnergyIn(double F23, double F24, double F26, double F27, double F29, double F30, double F32, double F33, double F35, double F37) {
		double F22 = (F23 * F24) / 1000;
		double F25 = -F26 / 1000 * F27;
		double F28 = (F29 * F30) / 1000;
		double F31 = F32 / 1000 * F33;
		double F34 = -F35 * F37 / 1000;
		/*
		 * F22 = Energy in from HP Boiler 
		 * F25 = Energy out to CRH Boiler 
		 * F28 = Energy in from HRH Boiler 
		 * F31 = Energy in from LP Boiler 
		 * F34 = Energy out to Condensor Pre Heater
		 */
		double st10EnergyIn = (F22 + F28 + F31) + (F25 + F34);
//		System.out.printf("10ST Energy In : %.4f\n", st10EnergyIn); // 2번
		return st10EnergyIn;
	}

	// 10ST 3번
	public double get10STst10Efficiency(double F19, double F23, double F24, double F26, double F27, double F29, double F30, double F32, double F33, double F35, double F37) {
		double st10Efficiency = get10STst10PowerOutput(F19) / get10STst10EnergyIn(F23, F24, F26, F27, F29, F30, F32, F33, F35, F37);
//		System.out.printf("10ST Power output : %.4f\n", get10STst10PowerOutput(F19)); // 1번
//		System.out.printf("10ST Energy In : %.4f\n", get10STst10EnergyIn(F23, F24, F26, F27, F29, F30, F32, F33, F35, F37)); // 2번
//		System.out.printf("10ST Efficiency : %.4f\n", st10Efficiency * 100); // 3번
		return st10Efficiency * 100;
	}
	// 10ST end

	// 10Cond start
	// 10Cond 1번
	public double get10Condcond10P() {
		double cond10P = 0.04576; // 1번
//		System.out.printf("10Cond. P : %.4f\n", cond10P); // 1번
		return cond10P;
	}

	// 10Cond 2번
	public double get10Condcond10SatT() {
		double cond10SatT = 31.33;// TODO 다른 엑셀에서 가져오는 값 10Cond 2번
//		System.out.printf("10Cond. Sat. T : %.4f\n", cond10SatT); // 2번
		return cond10SatT;
	}

	// 10Cond 3번
	public double get10CondtTD(double G8, double G25) {
		/*
		 * G8 = Cond_Cond Out CW T 
		 * G25 = Condenser Hotwell T
		 */
		double tTD = G25 - G8; // 3번
//		System.out.printf("TTD : %.4f\n", tTD); // 3번
		return tTD;
	}

	// 10Cond 4번
	public double get10CondiTD(double G3, double G5, double G25) {
		/*
		 * G7 = Cond_Cond In CW T 
		 * G25 = Condenser Hotwell T
		 */
		double G6 =G3*Math.atan(0.151977*Math.pow((G5+8.313659), 0.5))+Math.atan(G3+G5)-Math.atan(G5-1.676331)+0.00391838*Math.pow(G5, 1.5)*Math.atan(0.023101*G5)-4.686035;
		System.out.println("G6 : " + G6);
		double iTD = G25 - G6; // 4번
//		System.out.printf("ITD : %.4f\n", iTD); // 4번
		return iTD;
	}

	// 10Cond 5번
	public double get10CondcWTRise(double G7, double G8) {
		/*
		 * G7 = Cond_Cond In CW T 
		 * G8 = Cond_Cond Out CW T
		 */
		double cWTRise = G8 - G7; // 5번
//		System.out.printf("CW T Rise : %.4f\n", cWTRise); // 5번
		return cWTRise;
	}

	// 10Cond 6번
	public double get10CondsTUEEP(double G11, double G16, double G19, double G20, double G21, double G22, double G31, double G34, double G37, double G40, double G43) {
		/*
		 * G20 = ST_After CEP water F 
		 * G26 = ST Energy in - ST Energy out
		 */
		double G45 = G20 - G21;
		double sTUEEP = getG26(G11, G16, G19, G22, G31, G34, G37, G40, G43, G45) / G20 * 1000; // 6번
//		System.out.printf("ST UEEP : %.4f\n", sTUEEP); // 6번
		return sTUEEP;
	}

	// 10Cond 7번
	public double get10CondcondensateWaterH(double G27) {
		double condensateWaterH = G27; // 7번
//		System.out.printf("Condensate Water H : %.4f\n", condensateWaterH); // 7번
		return condensateWaterH;
	}

	// 10Cond 8번
	public double get10CondcondensateWaterF(double G20) {
		/*
		 * G20 = ST_After CEP water F
		 */
		double condensateWaterF = G20 / 3.6; // 8번
//		System.out.printf("Condensate Water F : %.4f\n", condensateWaterF); // 8번
		return condensateWaterF;
	}

	// 10Cond 9번
	public double get10CondcondenserHeatLoad(double G11, double G16, double G19, double G20, double G21, 
			double G22, double G27,double G31, double G34, double G37, double G40, double G43, double G45) {
		/*
		 * G20 = ST_After CEP water F 
		 * G21 = ST_Condenser make up water F 
		 * G27 = Condensate water H 
		 * G28 = ST UEEP
		 */
		double condenserHeatLoad = (getG28(G11, G16, G19, G20, G22, G31, G34, G37, G40, G43, G45) - G27) * (G20 - G21) / 1000; // 9번
//		System.out.printf("Condenser Heat Load : %.4f\n", condenserHeatLoad); // 9번
		return condenserHeatLoad;
	}

	// 10Cond 10번
	public double get10Condcond10Cleanliness(double G3, double G5, double G7, double G8, double G11, double G16, double G19, double G20, double G21, double G22, double G25, 
			double G27, double G31, double G34, double G37, double G40, double G43) {
		double G45 = G20 - G21;
		double G29 = (getG28(G11, G16, G19, G20, G22, G31, G34, G37, G40, G43, G45) - G27) * (G20 - G21) / 1000;
		double G6 = G3*Math.atan(0.151977*Math.pow((G5+8.313659), 0.5))+Math.atan(G3+G5)-Math.atan(G5-1.676331)+0.00391838*Math.pow(G5, 1.5)*Math.atan(0.023101*G5)-4.686035;
		double G47 = G25 - G6;
		double G48 = G25 - G8;
		double G52 = G7 * 9 / 5 + 32;
		List<Number> unitArr = new ArrayList<Number>();
		unitArr.add(35);
		unitArr.add(40);
		unitArr.add(45);
		unitArr.add(50);
		unitArr.add(55);
		unitArr.add(60);
		unitArr.add(70);
		unitArr.add(80);
		unitArr.add(90);
		unitArr.add(100);
		List<Number> tagArr = new ArrayList<Number>();
		tagArr.add(0.57);
		tagArr.add(0.64);
		tagArr.add(0.72);
		tagArr.add(0.79);
		tagArr.add(0.86);
		tagArr.add(0.92);
		tagArr.add(1);
		tagArr.add(1.04);
		tagArr.add(1.08);
		tagArr.add(1.1);
		double G53 = getIndex(unitArr, getMatch(G52, unitArr, 1));
		double G54 = getIndex(unitArr, getMatch(G52, unitArr, 1) + 1);
		double G55 = getIndex(tagArr, getMatch(G52, unitArr, 1));
		double G56 = getIndex(tagArr, getMatch(G52, unitArr, 1) + 1);
		double G51 = G55 + (G52 - G53) * (G56 - G55) / (G54 - G53);
		double G49 = (G47 - G48) / Math.log(G47 / G48);
		double T46 = 14050;
		double T50 = 2582;
		double T67 = 0.89;
		double T68 = 1.97;
		/*
		 * G29 = Heat load on condenser 
		 * G49 = Logarithmic Mean Temp. 
		 * G51 = CW inlet T factor
		 */
		double cond10Cleanliness = 1000000 * G29 / (T50 * G51 * T67 * Math.sqrt(T68) * T46 * G49); // 10번
//		System.out.printf("10Cond. Cleanliness : %.4f\n", cond10Cleanliness * 100); // 10번
		return cond10Cleanliness * 100;
	}
	// 10Cond end

	// 11HRSG start
	// 11HRSG 1번
	public double get11HRSGenergyIn(double E3, double E4, double E5, double E16, double E20, double E26, double E27, double E28, double E29, double E30, double E31, double E32, double E33, 
			double E41, double E48, 
			double H96, double H229, double H230, double H231, double H232, double H233, double H239, double H240, double H241, double H242, double H243, double H246, 
			double H247, double H248, double H257, double H258, double H259, double H260, double H261) {
		double H266 = getH262(E3, E4, E5, E16, E20, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48, H96, H229, H230, H231, H232, H233, H239, H240, H241, H242, H243, H246, H247, H248, H257, H258, H259, H260, H261) 
				* getH238(E3, E4, E5, H239, H240, H241, H242, H243) 
				+ getH183(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48) 
				* getH256(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48, H96, H257, H258, H259, H260, H261);
		/*
		 * H266 = ASME PTC 4.4 HRSG Performance 2. GT exhaust mass flow and energy - 11GT exhaust energy
		 */
		double energyIn = H266 * 1.0548 / 1000 / 3600;
//		System.out.printf("ASME PTC 4.4 HRSG Performance 6. HRSG efficiency - 11HRSG energy in : %.4f\n", energyIn); // 1번
		return energyIn;
	}

	// 11HRSG 2번
	public double get11HRSGenergyOut(double E3, double E4, double E5, double E16, double E20, double E26, double E27, double E28, double E29, double E30, double E31, double E32, double E33, 
			double E41, double E48, 
			double H96, double H229, double H230, double H231, double H232, double H233, double H239, double H240, double H241, double H242, double H243, 
			double H246, double H247, double H248, double H257, double H258, double H259, double H260, double H261) {
		List<Double> gt11GasArr = new ArrayList<Double>();
		gt11GasArr.add(getH204(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48, H96));
		gt11GasArr.add(getH205(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48));
		gt11GasArr.add(getH206(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48));
		gt11GasArr.add(getH207(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48));
		gt11GasArr.add(getH208(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48));
		List<Number> airArr = new ArrayList<Number>();
		airArr.add(26.9927);
		airArr.add(23.965);
		airArr.add(22.6741);
		airArr.add(13.4997);
		airArr.add(48.6042);
		double H272 = getSumArr(gt11GasArr, airArr);
		List<Double> massAirArr = new ArrayList<Double>();
		massAirArr.add(getH69(E3, E4, E5));
		massAirArr.add(getH70(E3, E4, E5));
		massAirArr.add(getH71(E3, E4, E5));
		massAirArr.add(getH72(E3, E4, E5));
		massAirArr.add(getH73(E3, E4, E5));
		List<Number> balanceAirArr = new ArrayList<Number>();
		balanceAirArr.add(26.9927);
		balanceAirArr.add(23.965);
		balanceAirArr.add(22.6741);
		balanceAirArr.add(13.4997);
		balanceAirArr.add(48.6042);
		double H278 = getSumArr(massAirArr, balanceAirArr);
		double H284 = getH183(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48) 
				* H272 + getH262(E3, E4, E5, E16, E20, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48, H96, H229, H230, H231, H232, H233, H239, H240, H241, H242, H243, H246, H247, H248, H257, H258, H259, H260, H261) * H278;
		/*
		 * H284 = ASME PTC 4.4 HRSG Performance 3. HRSG stack energy  - 11HRSG stack energy
		 */
		double energyOut = H284 * 1054.8 / 1000000 / 3600;
//		System.out.printf("ASME PTC 4.4 HRSG Performance 6. HRSG efficiency - 11HRSG energy out : %.4f\n", energyOut); // 2번
		return energyOut;
	}

	// 11HRSG 3번
	public double get11HRSGenergyGain(double H289, double H292, double H293, double H296, double H297, double H300, double H304, double H305, 
			double H308, double H309, double H314, double H315, double H319, double H320, double H324, double H325) {
//		double H289 = 103.1737;
//		double H292 = 138.0052;
//		double H293 = 18.0636;
//		double H296 = 658.9992;
//		double H297 = 9.1536;
//		double H300 = 331.9321;
		double H301 = (H292 * H289 + H293 * H296 + H297 * H300) / 1000;
//		double H304 = 3168.2941;
//		double H305 = 86.5416;
//		double H308 = 3032.64;
//		double H309 = 10.619;
		double H310 = (H304 * H305 + H308 * H309) / 1000;
//		double H314 = 3554.0094;
//		double H315 = 86.0846;
		double H316 = H314 * H315 / 1000;
//		double H319 = 3645.8798;
//		double H320 = 97.369;
		double H321 = H319 * H320 / 1000;
//		double H324 = 2989.5511;
//		double H325 = 8.383;
		double H326 = H324 * H325 / 1000;
		/*
		 * H301 = ASME PTC 4.4 HRSG Performance 4. Working fluid energy in (a) 11HRSG condenser preheater energy in
		 * H310 = ASME PTC 4.4 HRSG Performance 4. Working fluid energy in (b) 11HRSG cold reheat energy in
		 * H316 = ASME PTC 4.4 HRSG Performance 5. Working fluid energy out (a) 11HRSG HP steam energy out
		 * H321 = ASME PTC 4.4 HRSG Performance 5. Working fluid energy out (b) 11HRSG HRH steam energy out
		 * H326 = ASME PTC 4.4 HRSG Performance 5. Working fluid energy out (c) 11HRSG LP steam energy out
		 */
		double energyGain = H316 + H321 + H326 - (H301 + H310);
//		System.out.printf("ASME PTC 4.4 HRSG Performance 6. HRSG efficiency - 11HRSG working fluid energy gain : %.4f\n", energyGain); // 3번
		return energyGain;
	}

	// 11HRSG 4번
	public double get11HRSGefficiency(double E3, double E4, double E5, double E16, double E20, double E26, double E27, double E28, double E29, double E30, double E31, double E32, double E33, 
			double E41, double E48, double H96, double H229, double H230, double H231, double H232, double H233, double H239, double H240, 
			double H241, double H242, double H243, double H246, double H247, double H248, double H257, double H258, double H259, double H260, double H261, double H289, double H292, 
			double H293, double H296, double H297, double H300, double H304, double H305, double H308, double H309, double H314, double H315, double H319, double H320, double H324, double H325) {
		Calc3 calc3 = new Calc3();
		double efficiency = calc3.get11HRSGenergyGain(H289, H292, H293, H296, H297, H300, H304, H305, H308, H309, H314, H315, H319, H320, H324, H325) / (calc3.get11HRSGenergyIn(E3, E4, E5, E16, E20, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48, H96, H229, H230, H231, H232, H233, H239, H240, H241, H242, H243, H246, H247, H248, H257, H258, H259, H260, H261) 
				- calc3.get11HRSGenergyOut(E3, E4, E5, E16, E20, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48, H96, H229, H230, H231, H232, H233, H239, H240, H241, H242, H243, H246, H247, H248, H257, H258, H259, H260, H261));
		System.out.printf("ASME PTC 4.4 HRSG Performance 6. HRSG efficiency - 11HRSG energy in : %.4f\n", calc3.get11HRSGenergyIn(E3, E4, E5, E16, E20, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48, H96, H229, H230, H231, H232, H233, H239, H240, H241, H242, H243, H246, H247, H248, H257, H258, H259, H260, H261)); // 1번
		System.out.printf("ASME PTC 4.4 HRSG Performance 6. HRSG efficiency - 11HRSG energy out : %.4f\n", calc3.get11HRSGenergyOut(E3, E4, E5, E16, E20, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48, H96, H229, H230, H231, H232, H233, H239, H240, H241, H242, H243, H246, H247, H248, H257, H258, H259, H260, H261)); // 2번
		System.out.printf("ASME PTC 4.4 HRSG Performance 6. HRSG efficiency - 11HRSG working fluid energy gain : %.4f\n", calc3.get11HRSGenergyGain(H289, H292, H293, H296, H297, H300, H304, H305, H308, H309, H314, H315, H319, H320, H324, H325)); // 3번
		System.out.printf("ASME PTC 4.4 HRSG Performance 6. HRSG efficiency (a) 11HRSG efficiency : %.4f\n", efficiency * 100); // 4번
		return efficiency;
	}
	// 11HRSG end

	public static double getE35(double E27, double E28, double E29, double E30, double E31, double E32, double E33) {
		double E35 = ((E27 * 1 + E28 * 2 + E29 * 3 + E30 * 4 + E31 * 4 + E32 * 5 + E33 * 5) * 12.011)
				/ ((E27 * 4 + E28 * 6 + E29 * 8 + E30 * 10 + E31 * 10 + E32 * 12 + E33 * 12) * 1.00794);
		return E35;
	}

	public static double getE49(double E16, double E41, double E48) {
		double E43 = 4.59;
		double E44 = 7.91;
		double E45 = 0.1;
		double E46 = -0.01;
		double E42 = E45 + (E41 - E43) * (E46 - E45) / (E44 - E43);
		double E47 = E16 / (1 + E42 / 100);
		double E49 = E47 * E48;

		return E49;
	}

	public static double getE92(double E3) {
		double E93 = E3;
		List<Number> otcArr = new ArrayList<Number>();
		otcArr.add(-20);
		otcArr.add(-10);
		otcArr.add(0);
		otcArr.add(10);
		otcArr.add(15);
		otcArr.add(40); // 고정값
		double E94 = getIndex(otcArr, getMatch(E93, otcArr, 1));
		double E95 = getIndex(otcArr, getMatch(E93, otcArr, 1) + 1);
		List<Number> e93Arr = new ArrayList<Number>();
		e93Arr.add(4);
		e93Arr.add(3);
		e93Arr.add(1.6);
		e93Arr.add(0.5);
		e93Arr.add(0);
		e93Arr.add(0); // 고정값으로 보임
		double E96 = getIndex(e93Arr, getMatch(E93, otcArr, 1));
		double E97 = getIndex(e93Arr, getMatch(E93, otcArr, 1) + 1);
		double E92 = E96 + (E93 - E94) * (E97 - E96) / (E95 - E94);
		return E92;
	}

	public static double getE105(double E13) {
		// TODO index있음 getE105
		double E107 = 29000;
		double E108 = 30000;
		double E109 = 0.9784; 
		double E110 = 0.9782;
		double E106 = E13;
		double E105 = E109 + (E106 - E107) * (E110 - E109) / (E108 - E107);
		return E105;
	}

	public static double getE148(double E13) {
		// TODO index있음 getE148
		double E150 = 29000;
		double E151 = 30000;
		double E152 = 1.013; 
		double E153 = 1.013;
		double E149 = E13;
		double E148 = E152 + (E149 - E150) * (E153 - E152) / (E151 - E150);
		return E148;
	}

	public static double getE155(double E20, double E21, double E23) {
		double E155 = -(2071.25714 + 1.32386288 * (E20 + E21) + 0.000778400374 * Math.pow((E20 + E21), 2)
				+ 0.0000065121077 * Math.pow((E20 + E21), 3))
				+ (2071.24286 + 1.3193055 * (E20 + E21) + 0.000224179308 * Math.pow((E20 + E21), 2)
						+ 0.00000644427324 * Math.pow((E20 + E21), 3))
				- (1 - E23) / (1 - 0.95)
						* ((2071.24286 + 1.3193055 * (E20 + E21) + 0.000224179308 * Math.pow((E20 + E21), 2)
								+ 0.00000644427324 * Math.pow((E20 + E21), 3))
								- (2071.25714 + 1.32386288 * (E20 + E21) + 0.000778400374 * Math.pow((E20 + E21), 2)
										+ 0.0000065121077 * Math.pow((E20 + E21), 3)));

		return E155;
	}

	public static double getE157(double E3, double E4, double E5, double E6, double E7, double E14, double E18, double E24, double E27, double E28, double E29, double E30, double E31, double E32, double E33, double E36) {
		List<Double> list = new ArrayList<Double>();
		double E53 = E4 - E7;
		double E158 = 0;
		if (E3 > -5) {
			E158 = 0.0000000000227947 * Math.pow(E3, 6) - 0.000000000904288 * Math.pow(E3, 5)
					+ 0.0000000116046 * Math.pow(E3, 4) + 0.00000153038 * Math.pow(E3, 3)
					+ 0.0000313905 * Math.pow(E3, 2) + 0.00173846 * (E3) + 0.962479;
		} else {
			E158 = 0.00006077479 * Math.pow(E3, 2) + 0.0005937187 * (E3) + 0.9617201;
		}
		
		double E161 = E5 - 60;
		double E162 = E6;
		double E165 = E36 - 49307.9; // TODO 변수로 받아야 할 값
		double E166 = getE35(E27, E28, E29, E30, E31, E32, E33);
		double E168 = E24 / 60;
		double E169 = E6;
		double E159 = 0.000001208792 * Math.pow(E4 - 1013, 2) - 0.0009982435 * (E4 - 1013) + 1;
		double E160 = 1 - 0.00003899067 * E161 + 0.000000399928 * Math.pow(E161, 2) - 1.734723E-17 * E162
				- 1.084202E-18 * Math.pow(E162, 2) - 0.000000734811 * E161 * E162 + 0.00000006844623 * E161 * (2 * E162)
				+ 0.0000003040975 * E161 * Math.pow(E162, 2)
				- 0.000000002054733 * Math.pow(E161, 2) * Math.pow(E162, 2);
		double E163 = -0.000000007423235 * (Math.pow(E18 - 15, 2)) - 0.000007852198 * (E18 - 15) + 1;
		double E164 = 0.9125875 + 0.00000101875 * E165 - 0.000000000209375 * Math.pow(E165, 2) + 0.0435 * E166
				- 0.005 * Math.pow(E166, 2) - 0.000000125 * E165 * E166 + 0.0000000000625 * Math.pow(E165, 2) * E166
				+ 4.336809E-19 * E165 * Math.pow(E166, 2);
		double E167 = 1 + 0.004432362 * E168 + 0.00118746 * Math.pow(E168, 2) + 3.469447E-18 * E169
				+ 2.168404E-19 * Math.pow(E169, 2) - 0.00008495811 * E168 * E169
				+ 0.00005173638 * Math.pow(E168, 2) * E169 - 0.0000289971 * E168 * Math.pow(E169, 2)
				+ 0.000007918523 * Math.pow(E168, 2) * Math.pow(E169, 2);
		double E170 = 0.001460719 * (E53 - 8) + 1;
		double E171 = 0.000000000000352771 * Math.pow(E14 * 1000 - 41.9, 6)
				- 0.0000000000645594 * Math.pow(E14 * 1000 - 41.9, 5)
				+ 0.00000000417418 * Math.pow(E14 * 1000 - 41.9, 4) - 0.000000178082 * Math.pow(E14 * 1000 - 41.9, 3)
				+ 0.00000874248 * Math.pow(E14 * 1000 - 41.9, 2) + 0.000369709 * (E14 * 1000 - 41.9) + 1;

		list.add(E158);
		list.add(E159);
		list.add(E160);
		list.add(E163);
		list.add(E164);
		list.add(E167);
		list.add(E170);
		list.add(E171);

		double E157 = getProduct(list);
		return E157;
	}

	public static double getE172(double E3, double E4, double E5, double E6, double E7, double E14, double E18, double E24) {
		double E53 = E4 - E7;
		List<Double> list = new ArrayList<Double>();
		double E173 = 0;

		if (E3 < -2.5) {
			E173 = 0.0000247122 * Math.pow(E3, 2) - 0.0004919713 * E3 + 1.005837;
		} else {
			E173 = -0.00000000000637832 * Math.pow(E3, 6) + 0.0000000000894723 * Math.pow(E3, 5)
					+ 0.0000000158761 * Math.pow(E3, 4) + 0.00000014839 * Math.pow(E3, 3)
					+ 0.0000220328 * Math.pow(E3, 2) - 0.000776154 * E3 + 1.00564;
		}
		double E174 = 0.0000002306463 * Math.pow((E4 - 1013), 2) - 0.00001619771 * (E4 - 1013) + 1;
		double E176 = E5 - 60;
		double E177 = E6;
		double E175 = 1 + 0.000007228621 * E176 + 0.0000004123121 * Math.pow(E176, 2) - 1.734723E-17 * E177
				- 1.084202E-18 * Math.pow(E177, 2) + 0.000002907698 * E176 * E177
				+ 0.00000006920143 * Math.pow(E176, 2) * E177 + 0.0000002463781 * E176 * Math.pow(E177, 2)
				- 0.000000002323444 * Math.pow(E176, 2) * Math.pow(E177, 2);
		double E178 = 0.00000001846533 * Math.pow((E18 - 15), 2) + 0.00003493607 * E18 + 1;
		double E179 = 1;
		double E181 = E24 / 60;
		double E182 = E6;
		double E180 = 1 + 0.001947536 * E181 + 0.0008529767 * Math.pow(E181, 2) + 3.469447E-18 * E182
				+ 2.168404E-19 * Math.pow(E182, 2) - 0.000124597 * E181 * E182
				+ 0.00001966455 * Math.pow(E181, 2) * E182 - 0.000001528704 * E181 * Math.pow(E182, 2)
				+ 0.00000006724679 * Math.pow(E181, 2) * Math.pow(E182, 2);
		double E183 = 0.0001600026 * (E53 - 8) + 1;
		double E184 = 0.000000000000356177 * Math.pow((E14 * 1000 - 41.9), 6)
				- 0.0000000000650473 * Math.pow((E14 * 1000 - 41.9), 5)
				+ 0.00000000418965 * Math.pow((E14 * 1000 - 41.9), 4) - 0.00000017802 * Math.pow((E14 * 1000 - 41.9), 3)
				+ 0.00000924954 * Math.pow((E14 * 1000 - 41.9), 2) + 0.000369423 * (E14 * 1000 - 41.9) + 1;

		list.add(E173);
		list.add(E174);
		list.add(E175);
		list.add(E178);
		list.add(E179);
		list.add(E180);
		list.add(E183);
		list.add(E184);

		double E172 = getProduct(list);
		return E172;
	}

	public static double getG26(double G11, double G16, double G19, double G22, double G31, double G34, double G37, double G40, double G43, double G45) {
		double G32 = G11;
		double G30 = (G31 * G32) / 1000;
		double G35 = G11;
		double G33 = -G34 / 1000 * (G35);
		double G38 = G16;
		double G36 = (G37 * G38) / 1000;
		double G41 = G19;
		double G39 = G40 / 1000 * (G41);
		double G42 = -G43 * G45 / 1000;
		double G26 = (G30 + G36 + G39) + (G33 + G42) - G22;
		return G26;
	}

	public static double getG28(double G11, double G16, double G19, double G20, double G22, double G31, double G34, double G37, double G40, double G43, double G45) {
		double G28 = getG26(G11, G16, G19, G22, G31, G34, G37, G40, G43, G45) / G20 * 1000;
		return G28;
	}

	public static double getH35(double E3, double E5) {
		double H14 = E3 * 9 / 5 + 32;
		double H20 = -10214.165;
		double H21 = -4.8932428;
		double H22 = -0.0053765794;
		double H23 = 0.00000019202377;
		double H24 = 0.00000000035575832;
		double H25 = -9.0344688E-14;
		double H26 = 4.1635019;
		double H27 = -10440.397;
		double H28 = -11.29465;
		double H29 = -0.027022355;
		double H30 = 0.00001289036;
		double H31 = -0.0000000024780681;
		double H32 = 0; // 소수자리 늘려도 값이 없음
		double H33 = 6.5459673;
		double H15 = E5;
		double H17 = 0;
		if (H14 < 32) {
			double H18 = H20 / (H14 + 459.67) + H21 + H22 * (H14 + 459.67) + H23 * Math.pow((H14 + 459.67), 2)
					+ H24 * Math.pow((H14 + 459.67), 3) + H25 * Math.pow((H14 + 459.67), 4)
					+ H26 * Math.log(H14 + 459.67);
			H17 = Math.exp(H18);
		} else {
			double H19 = H27 / (H14 + 459.67) + H28 + H29 * (H14 + 459.67) + H30 * Math.pow((H14 + 459.67), 2)
					+ H31 * Math.pow((H14 + 459.67), 3) + H32 * Math.pow((H14 + 459.67), 4)
					+ H33 * Math.log(H14 + 459.67);
			H17 = Math.exp(H19);
		}
		double H35 = H17 * H15 / 100;
		return H35;
	}

	public static double getH37(double E3, double E4, double E5) {
		double H13 = E4 * 0.0145038;
		double H37 = (H13 - getH35(E3, E5)) / H13;
		return H37;
	}

	public static double getH39(double E3, double E4, double E5) {
		double H39 = (1 / getH37(E3, E4, E5) - 1) * 18.01528 / 28.9651159;
		return H39;
	}

	public static double getH41(double E3, double E4, double E5) {
		double H41 = getH37(E3, E4, E5) * 0.78084 * 100;
		return H41;
	}

	public static double getH42(double E3, double E4, double E5) {
		double H42 = getH37(E3, E4, E5) * 0.209476 * 100;
		return H42;
	}

	public static double getH43(double E3, double E4, double E5) {
		double H43 = getH37(E3, E4, E5) * 0.009365 * 100;
		return H43;
	}

	public static double getH44(double E3, double E4, double E5) {
		double H44 = getH37(E3, E4, E5) * 0.000319 * 100;
		return H44;
	}

	public static double getH45(double E3, double E4, double E5) {
		double H45 = (1 - getH37(E3, E4, E5)) * 100;
		return H45;
	}
	

	public static double getH47(double E3, double E4, double E5) {
		double H47 = getH41(E3, E4, E5) * (14.0067 * 2) + getH42(E3, E4, E5) * (15.9994 * 2) + getH43(E3, E4, E5) * 39.948
				+ getH44(E3, E4, E5) * (12.0107 + 15.9994 * 2) + getH45(E3, E4, E5) * (1.00794 * 2 + 15.9994);
		return H47;
	}
	

	public static double getH69(double E3, double E4, double E5) {
		double H69 = getH41(E3, E4, E5) * (14.0067 * 2) / getH47(E3, E4, E5);
		return H69;
	}
	

	public static double getH70(double E3, double E4, double E5) {
		double H70 = getH42(E3, E4, E5) * (15.9994 * 2) / getH47(E3, E4, E5);
		return H70;
	}
	

	public static double getH71(double E3, double E4, double E5) {
		double H71 = getH44(E3, E4, E5) * (12.0107 + 15.9994 * 2) / getH47(E3, E4, E5);
		return H71;
	}
	

	public static double getH72(double E3, double E4, double E5) {
		double H72 = getH43(E3, E4, E5) * 39.948 / getH47(E3, E4, E5);
		return H72;
	}
	

	public static double getH73(double E3, double E4, double E5) {
		double H73 = getH45(E3, E4, E5) * (1.00794 * 2 + 15.9994) / getH47(E3, E4, E5);
		return H73;
	}

	public static double getH121(double E16, double E26, double E27, double E28, double E29, double E30, double E31, double E32, double E33, double E41, double E48) { // TODO 파람 넣어야함
		double H80 = E26 / 100; // H는 1이 100%이기 때문에 100으로 나눠줌
		double H81 = E27 / 100;
		double H82 = E28 / 100;
		double H83 = E29 / 100;
		double H84 = E30 / 100;
		double H85 = E31 / 100;
		double H86 = E32 / 100;
		double H87 = E33 / 100;
		double H78 = getE49(E16, E41, E48)*2.20462;
		double H92 = 17.3741;
		double H94 = H78 / H92;
		double H106 = -H94 * (H80 * 0 + H81 * 2 + H82 * 3.5 + H83 * 5 + H85 * 6.5 + H84 * 6.5 + H87 * 8 + H86 * 8);
		double H116 = H106;
		double H121 = -H116 / 0.209476 * 28.9651159;
		return H121;
	}

	public static double getH125(double E3, double E4, double E5, double E16, double E26, double E27, double E28, double E29, double E30, double E31, double E32, double E33, double E41, double E48) {
		double H125 = getH121(E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48) * (1 + getH39(E3, E4, E5));
		return H125;
	}
	

	public static double getH131(double E3, double E4, double E5, double E16, double E26, double E27, double E28, double E29, double E30, double E31, double E32, double E33, double E41, double E48) {
		double H125 = getH121(E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48) * (1 + getH39(E3, E4, E5));
		double H131 = H125;
		return H131;
	}

	public static double getH135(double E16, double E41, double E48) {
		double H135 = getE49(E16, E41, E48) * 2.20462;
		return H135;
	}

	public static double getH183(double E3, double E4, double E5, double E16, double E26, double E27, double E28, double E29, double E30, double E31, double E32, double E33, double E41, double E48) {
		double H133 = 0;
		double H183 = getH131(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48) + H133 + getH135(E16, E41, E48);
		return H183;
	}
	

	public static double getH204(double E3, double E4, double E5, double E16, double E26, double E27, double E28, double E29, double E30, double E31, double E32, double E33, double E41, double E48, 
			 double H96) {
		double H54 = getH125(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48) * getH41(E3, E4, E5) / getH47(E3, E4, E5);
		double H153 = H54;
		double H78 = getE49(E16, E41, E48)*2.20462;
		double H92 = 17.3741;
		double H94 = H78 / H92;
		double H105 = H94 * H96 * 1;
		double H155 = H105;
		double H151 = H153 + H155;
		double H189 = H151 * (14.0067 * 2) / getH183(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48);
		double H204 = H189;
		return H204;
	}

	public static double getH205(double E3, double E4, double E5, double E16, double E26, double E27, double E28, double E29, double E30, double E31, double E32, double E33, double E41, double E48) {
		double H55 = getH125(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48) * getH42(E3, E4, E5) / getH47(E3, E4, E5);
		double H161 = H55;
		double H78 = getE49(E16, E41, E48)*2.20462;
		double H92 = 17.3741;
		double H94 = H78 / H92;
		double H80 = E26 / 100; // H는 1이 100%이기 때문에 100으로 나눠줌
		double H81 = E27 / 100;
		double H82 = E28 / 100;
		double H83 = E29 / 100;
		double H84 = E30 / 100;
		double H85 = E31 / 100;
		double H86 = E32 / 100;
		double H87 = E33 / 100;
		double H106 = -H94 * (H80 * 0 + H81 * 2 + H82 * 3.5 + H83 * 5 + H85 * 6.5 + H84 * 6.5 + H87 * 8 + H86 * 8);
		double H163 = H106;
		double H159 = H161 + H163;
		double H191 = H159 * (15.9994 * 2) / getH183(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48);
		double H205 = H191;
		return H205;
	}

	public static double getH206(double E3, double E4, double E5, double E16, double E26, double E27, double E28, double E29, double E30, double E31, double E32, double E33, double E41, double E48) {
		double H57 = getH125(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48) * getH44(E3, E4, E5) / getH47(E3, E4, E5);
		double H78 = getE49(E16, E41, E48) * 2.20462;
		double H92 = 17.37414;
		double H94 = H78 / H92;
		double H80 = E26 / 100; // H는 1이 100%이기 때문에 100으로 나눠줌
		double H81 = E27 / 100;
		double H82 = E28 / 100;
		double H83 = E29 / 100;
		double H84 = E30 / 100;
		double H85 = E31 / 100;
		double H86 = E32 / 100;
		double H87 = E33 / 100;
		double H107 = H94 * (H80 * 0 + H81 * 1 + H82 * 2 + H83 * 3 + H85 * 4 + H84 * 4 + H87 * 5 + H86 * 5);
		double H169 = H57;
		double H171 = H107;
		double H167 = H169 + H171;
		double H193 = H167 * (12.0107 + 15.9994 * 2) / getH183(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48);
		double H206 = H193;
		return H206;
	}

	public static double getH207(double E3, double E4, double E5, double E16, double E26, double E27, double E28, double E29, double E30, double E31, double E32, double E33, double E41, double E48) {
		double H56 = getH125(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48) * getH43(E3, E4, E5) / getH47(E3, E4, E5);
		double H177 = H56;
		double H179 = 0; // 엑셀에 값이 없음
		double H175 = H177 + H179;
		double H195 = H175 * (39.948) / getH183(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48);
		double H207 = H195;
		return H207;
	}

	public static double getH208(double E3, double E4, double E5, double E16, double E26, double E27, double E28, double E29, double E30, double E31, double E32, double E33, double E41, double E48) {
		double H58 = getH125(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48) * getH45(E3, E4, E5) / getH47(E3, E4, E5);
		double H144 = H58;
		double H78 = getE49(E16, E41, E48) * 2.20462;
		double H92 = 17.37414;
		double H80 = E26 / 100; // H는 1이 100%이기 때문에 100으로 나눠줌
		double H81 = E27 / 100;
		double H82 = E28 / 100;
		double H83 = E29 / 100;
		double H84 = E30 / 100;
		double H85 = E31 / 100;
		double H86 = E32 / 100;
		double H87 = E33 / 100;
		double H94 = H78 / H92;
		double H108 = H94 * (H80 * 0 + H81 * 2 + H82 * 3 + H83 * 4 + H85 * 5 + H84 * 5 + H87 * 6 + H86 * 6);
		double H133 = 0;
		double H146 = H108 + H133 / 18.01528;
		double H142 = H144 + H146;
		double H197 = H142 * (1.00794 * 2 + 15.9994) / getH183(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48);
		double H208 = H197;
		return H208;
	}

	public static double getH238(double E3, double E4, double E5, double H239, double H240, double H241, double H242, double H243) {
		List<Double> gt11Arr = new ArrayList<Double>();
		gt11Arr.add(getH69(E3, E4, E5));
		gt11Arr.add(getH70(E3, E4, E5));
		gt11Arr.add(getH71(E3, E4, E5));
		gt11Arr.add(getH72(E3, E4, E5));
		gt11Arr.add(getH73(E3, E4, E5));
		List<Number> airArr = new ArrayList<Number>();
		airArr.add(H239);
		airArr.add(H240);
		airArr.add(H241);
		airArr.add(H242);
		airArr.add(H243);
		double H238 = getSumArr(gt11Arr, airArr);
		return H238;
	}

	public static double getH256(double E3, double E4, double E5, double E16, double E26, double E27, double E28, double E29, double E30, double E31, double E32, double E33, 
			double E41, double E48, 
			double H96, double H257, double H258, double H259, double H260, double H261) {
		List<Double> gt11Arr = new ArrayList<Double>();
		gt11Arr.add(getH204(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48, H96));
		gt11Arr.add(getH205(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48));
		gt11Arr.add(getH206(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48));
		gt11Arr.add(getH207(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48));
		gt11Arr.add(getH208(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48));
		List<Number> airArr = new ArrayList<Number>();
		airArr.add(H257);
		airArr.add(H258);
		airArr.add(H259);
		airArr.add(H260);
		airArr.add(H261);
		double H256 = getSumArr(gt11Arr, airArr);
		return H256;
	}

	public static double getH262(double E3, double E4, double E5, double E16, double E20, double E26, double E27, double E28, double E29, double E30, double E31, double E32, double E33, 
			double E41, double E48, 
			double H96, double H229, double H230, double H231, double H232, double H233, double H239, double H240, double H241, double H242, double H243, 
			double H246, double H247, double H248, double H257, double H258, double H259, double H260, double H261) {
		double H226 = E20 * 3412141.16;
		List<Double> gt11Arr = new ArrayList<Double>();
		gt11Arr.add(getH69(E3, E4, E5));
		gt11Arr.add(getH70(E3, E4, E5));
		gt11Arr.add(getH71(E3, E4, E5));
		gt11Arr.add(getH72(E3, E4, E5));
		gt11Arr.add(getH73(E3, E4, E5));
		List<Number> airArr = new ArrayList<Number>();
		airArr.add(H229);
		airArr.add(H230);
		airArr.add(H231);
		airArr.add(H232);
		airArr.add(H233);
		double H228 = getSumArr(gt11Arr, airArr);
		double H249 = H246 + H247 - H248;
		double H250 = H249 * getH135(E16, E41, E48);
		double H252 = H226 * 0.027;
		double H262 = (H226 + H252 + getH131(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48) 
		* getH256(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48, H96, H257, H258, H259, H260, H261)
		+ getH135(E16, E41, E48)
		* getH256(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48, H96, H257, H258, H259, H260, H261)
		- (getH131(E3, E4, E5, E16, E26, E27, E28, E29, E30, E31, E32, E33, E41, E48) * H228 + H250))
				/ (H228 - getH238(E3, E4, E5, H239, H240, H241, H242, H243));
		return H262;
	}

	// {sum(arr_1 : arr_2)} 두 배열에서 각 인덱스에 해당하는 값을 곱한 뒤 전부 더함
	public static double getSumArr(List arr_1, List arr_2) {
		double temp = 0;
		for (int i = 0; i < arr_1.size(); i++) {
			temp += Double.parseDouble(arr_1.get(i).toString()) * Double.parseDouble(arr_2.get(i).toString());
		}
		return temp;
	}

	// product(arr) arr의 각 값들을 전부 곱함
	public static double getProduct(List<Double> list) {
		double temp = 1;
		for (int i = 0; i < list.size(); i++) {
			temp *= Double.parseDouble(list.get(i).toString());
		}
		return temp;
	}

	// index(arr, row_num) arr에서 해당 index(row_num)의 값을 찾음
	public static double getIndex(List<Number> arr, int rowNum) {
		return Double.parseDouble(arr.get(rowNum - 1).toString());
	}

	// match(lookup_value, lookup_arr, match_type(-1, 0, 1)) 찾을 값(lookup_value)이 lookup_arr의 몇 번째 index인지 찾음
	public static int getMatch(double lookUpValue, List<Number> arr, int matchType) {
		int idx = 0;
		if (matchType == 1) { // 오름차순 정렬
			for (int i = 0; i < arr.size(); i++) {
				if (Double.parseDouble(arr.get(i).toString()) > lookUpValue) {
					idx = i;
					break;
				}
			}
		} else if (matchType == 0) { // 정렬 상관없음
			for (int i = 0; i < arr.size(); i++) {
				if (Double.parseDouble(arr.get(i).toString()) == lookUpValue) {
					idx = i + 1;
					break;
				}
			}
		} else { // 내림차순 정렬
			for (int i = 0; i < arr.size(); i++) {
				if (Double.parseDouble(arr.get(i).toString()) < lookUpValue) {
					idx = i;
					break;
				}
			}
		}
		return idx;
	}

	// match(lookup_value, lookup_arr) match_type를 입력하지 않으면 기본값은 1임
	public static int getMatch(double lookUpValue, List<Number> arr) {
		// match_type가 없으면 1
		return getMatch(lookUpValue, arr, 1);
	}
	
	//
	public static double getRound(double value) {
		String num = String.format("%.2f", value);
		return Double.parseDouble(num);
	}
//	public static double getRound(double value) {
//		return Math.round(value * 100) / 100;
//	}
}
