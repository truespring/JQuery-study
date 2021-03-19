package com.doosan.test;

import java.util.ArrayList;
import java.util.List;

public class Calc2 {
	// 1CC
	static double E3 = 18.628866;
	static double E4 = 1010.1169;
	static double E5 = 26.2681;
	static double E6 = 19.4298;
	static double E7 = 994.7201;
	static double E8 = 454.8129;
	static double E9 = 20.3199;
	static double E12 = 39.8895;
	static double E13 = 29215.6015;
	static double E14 = 0.0445;
	static double E16 = 1758.94018527778;
	static double E18 = 34.8257;
	static double E19 = 214.2;
	static double E20 = 286.5988;
	static double E21 = 146.6331;
	static double E22 = 424.5715;
	static double E23 = 0.980007993083333;
	static double E24 = 60.0041;
	static double E26 = 0.1012;
	static double E27 = 92.8093;
	static double E28 = 5.1463;
	static double E29 = 1.3554;
	static double E30 = 0.3083;
	static double E31 = 0.2503;
	static double E32 = 0.0072;
	static double E33 = 0.022;
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
	static double G6 = 23.2147;
	static double G7 = 30.4578;
	static double G8 = 0.044522;
	static double G11 = 85.9877;
	static double G16 = 71.1273;
	static double G19 = 8.4902;
	static double G20 = 106.3315;
	static double G21 = 0.0039;
	static double G22 = 146.217;
//	static double G25 = 31.326;
//	static double G27 = 131.2018;
//	static double G31 = 3523.1795;
//	static double G34 = 3167.9279;
//	static double G37 = 3637.3086;
//	static double G40 = 2978.4236;
//	static double G43 = 131.2018;
	static double G45 = 106.3276;

	// 11HRSG
	static double H14 = E3 * 9 / 5 + 32;
	static double H20 = -10214.165;
	static double H21 = -4.8932428;
	static double H22 = -0.0053765794;
	static double H23 = 0.00000019202377;
	static double H24 = 0.00000000035575832;
	static double H25 = -9.0344688E-14;
	static double H26 = 4.1635019;
	static double H27 = -10440.397;
	static double H28 = -11.29465;
	static double H29 = -0.027022355;
	static double H30 = 0.00001289036;
	static double H31 = -0.0000000024780681;
	static double H32 = 0; // 소수자리 늘려도 값이 없음
	static double H33 = 6.5459673;
	static double H80 = E26 / 100; // H는 1이 100%이기 때문에 100으로 나눠줌
	static double H81 = E27 / 100;
	static double H82 = E28 / 100;
	static double H83 = E29 / 100;
	static double H84 = E30 / 100;
	static double H85 = E31 / 100;
	static double H86 = E32 / 100;
	static double H87 = E33 / 100;
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

	public static void main(String[] args) {
		// 1CC
		double E36 = 49515.4786;
		double E37 = 54861.2712;
		double E41 = 7.64;
		double E43 = 4.59; // TODO index
		double E44 = 7.91; // TODO index
		double E45 = 0.1; // TODO index
		double E46 = -0.01; // TODO index
		double E48 = 29.471615; // TODO 변수로 받아야 할 값
		double E50 = 2.87;
		double E98 = 4;
		double E99 = 3;
		double E100 = 1.6;
		double E101 = 0.5;
		double E102 = 0; // 소수자리 늘려도 0
		double E103 = 0; // 소수자리 늘려도 0
		double E107 = 29000; // TODO index
		double E108 = 30000; // TODO index
		double E109 = 0.9784; // TODO index
		double E110 = 0.9782; // TODO index
		double E150 = 29000; // TODO index
		double E151 = 30000; // TODO index
		double E152 = 1.013; // TODO index
		double E153 = 1.013; // TODO index
		Calc2 calc = new Calc2();
//		System.out.println("Gross Power : " + (calc.grossPower(-8.485968, 1022.316, 43.40639, -7.724998, 1006.308, 0.02689452, 34.99349, 312.6481, 106.1173, 1, 60.0243, 92.96777, 4.843701, 1.413752, 0.3417591, 0.3044243, 0.004515381, 0.01714556, 49526.0))); // 1
//		System.out.println("Net Power : " + (calc.netPower(E3, E4, E5, E6, E7, E14, E18, E20, E21, E22, E23, E24, E27, E28, E29, E30, E31, E32, E33, E36))); // 2
//		System.out.println("Gross Efficiency : " + (calc.grossEfficiency(E3, E4, E5, E6, E7, E14, E16, E18, E20, E21, E23, E24, E37, E41, E48))); // 3
//		System.out.println("Net Efficiency : " + (calc.netEfficiency(E3, E4, E5, E6, E7, E14, E16, E18, E20, E21, E22, E23, E24, E37, E41, E48))); // 4
//		System.out.println("11GT Gross Power : " + (calc.gtGrossPower(-9.46253, 1022.382, 32.01316, -8.374996, 1006.453, 438.2943, 30662.05, 313.9733, 59.99111, 93.02291, 4.802974, 1.407514, 0.3394698, 0.3019198, 0.004579946, 0.01696417, 49526.0))); // 5
//		System.out.println("11GT Designed Power : " + (calc.gtDesignedPower(E13))); // 6
//		System.out.println("11GT Gross Efficiency : " + (calc.gtGrossEfficiency(19.6, 1011.2, 27.8, 20.3, 995.9, 29047.6, 1756.8, 214.1, 285.4, 60.0, 92.7128, 5.5314, 1.1029, 0.2694, 0.2635, 0.0039, 0.0129, 49526, 7.6277, 29.4488, 2.8751))); // 7
//		System.out.println("11GT Designed Efficiency : " + (calc.gtDesignedEfficiency(E13))); // 8
//		System.out.println("11GT Compr. Efficiency(Polytropic) : " + (calc.gtComprEfficiencyPolytropic(E6, E7, E8, E9))); // 9
//		System.out.println("11GT Pressrurue Ratio : " + (calc.gtPressrurueRatio(E7, E9))); // 10
		System.out.println();
		
		// 10ST
		double F23 = 3522.2031;
		double F26 = 3167.3549;
		double F29 = 3644.0491;
		double F32 = 2979.5902;
		double F35 = 129.196;
//		System.out.println("10ST Power output : " + (calc.stPowerOutput(F19)));
//		System.out.println("10ST Energy In : " + (calc.stEnergyIn(F23, F24, F26, F27, F29, F30, F32, F33, F35, F37)));
		System.out.println("10ST Efficiency : " + (calc.st10Efficiency(F19, F23, F24, F26, F27, F29, F30, F32, F33, F35, F37)));
		System.out.println();

		double G25 = 31.326;
		double G27 = 131.2018;
		double G31 = 3523.1795;
		double G34 = 3167.9279;
		double G37 = 3637.3086;
		double G40 = 2978.4236;
		double G43 = 131.2018;
		// 10Cond
//		System.out.println("10Cond. P : " + calc.cond10P(G8));
//		System.out.println("10Cond. Sat. T : " + (calc.cond10SatT(30.85)));
//		System.out.println("TTD : " + (calc.tTD(G7, G25)));
//		System.out.println("ITD : " + (calc.iTD(G6, G25)));
//		System.out.println("CW T Rise : " + (calc.cwTRise(G6, G7)));
//		System.out.println("ST UEEP : " + (calc.stUEEP(G11, G16, G19, G20, G22, G31, G34, G37, G40, G43, G45)));
//		System.out.println("Condensate Water H : " + (calc.condensateWaterH(G27)));
//		System.out.println("Condensate Water F : " + (calc.condensateWaterF(G20)));
//		System.out.println("Condenser Heat Load : " + (calc.condenserHeatLoad(G11, G16, G19, G20, G21, G22, G27, G31, G34, G37, G40, G43, G45)));
//		System.out.println("10Cond. Cleanliness : " + (calc.cond10Cleanliness(G6, G7, G11, G16, G19, G20, G21, G22, G25, G27, G31, G34, G37, G40, G43, G45)));
		System.out.println();

		// 11HRSG TODO 나중에
//		calc.get11HRSGenergyIn(E41, E43, E44, E45, E46, E48);
//		calc.get11HRSGenergyOut(E41, E43, E44, E45, E46, E48);
//		calc.get11HRSGenergyGain();
//		calc.get11HRSGefficiency(E41, E43, E44, E45, E46, E48);
	}

    // 1CC start
    // 1CC 1번
    public double grossPower(double ambientT, double ambientP, double ambientRH, double compTin, double compPin, double stCondenserP, double gasT, double gtGrossPowerTag, double stGrossPower, double gtPowerFactor, double stFrequency, double methane, double ethane, double propane, double butane, double isobutane, double pentane, double isopentane, double lhv) {
        /*
         * gtGrossPowerTag = Elec.11GT Gross Power
         * stGrossPower = Elec.10ST Gross Power
         * pAdditiveCorrection = P Correction_Additive Correction
         * pPowerCorrectionProduct = P Correction_Power Correction Product
         */
        double grossPower = (gtGrossPowerTag + stGrossPower + pAdditiveCorrection(gtGrossPowerTag, stGrossPower, gtPowerFactor) / 1000) * pPowerCorrectionProduct(ambientT, ambientP, ambientRH, compTin, compPin, stCondenserP, gasT, stFrequency, methane, ethane, propane, butane, isobutane, pentane, isopentane, lhv);
//		System.out.printf("Gross Power : %.4f\n", grossPower); // 1번
        return grossPower;
    };

    // 1CC 2번
    public double netPower(double ambientT, double ambientP, double ambientRH, double compTin, double compPin, double stCondenserP, double gasT, double gtGrossPowerTag, double stGrossPower, double elNetPower, double gtPowerFactor, double stFrequency, double methane, double ethane, double propane, double butane, double isobutane, double pentane, double isopentane, double lhv) {
        /*
         * netPower = Elec.Net Power
         * pAdditiveCorrection = P Correction_Additive Correction
         * pPowerCorrectionProduct = P Correction_Power Correction Product
         */
        double netPower = (elNetPower + pAdditiveCorrection(gtGrossPowerTag, stGrossPower, gtPowerFactor) / 1000) * pPowerCorrectionProduct(ambientT, ambientP, ambientRH, compTin, compPin, stCondenserP, gasT, stFrequency, methane, ethane, propane, butane, isobutane, pentane, isopentane, lhv);
//		System.out.printf("Net Power : %.4f\n", netPower); // 2번
        return netPower;
    };

    // 1CC 3번
    public double grossEfficiency(double ambientT, double ambientP, double ambientRH, double compTin, double compPin, double stCondenserP, double gasFlowRate, double gasT, double gtGrossPowerTag, double stGrossPower, double gtPowerFactor, double stFrequency, double hhv, double reynoldsNumber, double gtDensity) {
        /*
         * gtGrossPowerTag = Elec.11GT Gross Power
         * stGrossPower = Elec.10ST Gross Power
         * hhv = HHV
         * gtMassFlow = Flow meter_11GT Mass Flow
         * pAdditiveCorrection = P Correction_Additive Correction
         * hrCorrectionProduct = Combined Cycle_HR Correction Product
         */
        double grossEfficiency = (gtGrossPowerTag + stGrossPower + pAdditiveCorrection(gtGrossPowerTag, stGrossPower, gtPowerFactor) / 1000) / (gtMassFlow(gasFlowRate, reynoldsNumber, gtDensity) / 3600 * hhv / 1000) * hrCorrectionProduct(ambientT, ambientP, ambientRH, compTin, compPin, stCondenserP, gasT, stFrequency);
//		System.out.printf("Gross Efficiency : %.4f\n", grossEfficiency * 100); // 3번
        return grossEfficiency * 100;
    };

    // 1CC 4번
    public double netEfficiency(double ambientT, double ambientP, double ambientRH, double compTin, double compPin, double stCondenserP, double gasFlowRate, double gasT, double gtGrossPowerTag, double stGrossPower, double netPower, double gtPowerFactor, double stFrequency, double hhv, double reynoldsNumber, double gtDensity) {
        /*
         * netPower = Elec.Net Power
         * hhv = HHV
         * gtMassFlow = Flow meter_11GT Mass Flow
         * pAdditiveCorrection = P Correction_Additive Correction
         * hrCorrectionProduct = Combined Cycle_HR Correction Product
         */
        double netEfficiency = (netPower + pAdditiveCorrection(gtGrossPowerTag, stGrossPower, gtPowerFactor) / 1000) / (gtMassFlow(gasFlowRate, reynoldsNumber, gtDensity) / 3600 * hhv / 1000) * hrCorrectionProduct(ambientT, ambientP, ambientRH, compTin, compPin, stCondenserP, gasT, stFrequency);
//		System.out.printf("Net Efficiency : %.4f\n", netEfficiency * 100); // 4번
        return netEfficiency * 100;
    };

    // 1CC 5번
    public double gtGrossPower(double ambientT, double ambientP, double ambientRH, double compTin, double compPin, double gtExhaustPress, double gtEBH, double gtGrossPowerTag, double stFrequency, double methane, double ethane, double propane, double butane, double isobutane, double pentane, double isopentane, double lhv) {
        double ambP = -0.00809296 * Math.pow((0.001 * ambientP), 2) + 1.02802 * (0.001 * ambientP) - 0.0330795;
        double gtFilterDP = ambientP - compPin;
        double gtCompInletPLoss = -0.00129716 * (gtFilterDP) + 1.01038;
        double gtCompInletT = 0;
        if (compTin < 15) {
            gtCompInletT = -0.00000101272 * Math.pow(compTin, 3) - 0.0000216136 * Math.pow(compTin, 2) - 0.00283226 * (compTin) + 1.05076;
        } else {
            gtCompInletT = -0.000000899352 * Math.pow(compTin, 3) + 0.00000117656 * Math.pow(compTin, 2) - 0.00445136 * (compTin) + 1.06954;
        }
        double E60 = Math.abs(ambientT);
        List<Number> pHumTestArr = new ArrayList<>();
        pHumTestArr.add(0);
        pHumTestArr.add(15);
        pHumTestArr.add(25);
        pHumTestArr.add(35);
        pHumTestArr.add(45);
        double E61 = getIndex(pHumTestArr, getMatch(E60, pHumTestArr, 1));
        double E62 = getIndex(pHumTestArr, getMatch(E60, pHumTestArr, 1) + 1);
        double E65 = -0.000000935858 * Math.pow((0.01 * ambientRH), 3) - 0.0000141332 * Math.pow((0.01 * ambientRH), 2) + 0.00381307 * (0.01 * ambientRH) + 0.997717;
        double E66 = -0.0000553283 * Math.pow((0.01 * ambientRH), 3) - 0.000688925 * Math.pow((0.01 * ambientRH), 2) + 0.00787826 * (0.01 * ambientRH) + 0.995533;
        double E67 = -0.0000548537 * Math.pow((0.01 * ambientRH), 3) - 0.000691077 * Math.pow((0.01 * ambientRH), 2) + 0.00786734 * (0.01 * ambientRH) + 0.99554;
        double E68 = 0.0000468319 * Math.pow((0.01 * ambientRH), 3) - 0.00547762 * Math.pow((0.01 * ambientRH), 2) + 0.00715796 * (0.01 * ambientRH) + 0.997667;
        double E69 = 0.0055358 * Math.pow((0.01 * ambientRH), 3) - 0.0286947 * Math.pow((0.01 * ambientRH), 2) - 0.00528963 * (0.01 * ambientRH) + 1.01231;
        List<Number> pHumArr = new ArrayList<>();
        pHumArr.add(E65);
        pHumArr.add(E66);
        pHumArr.add(E67);
        pHumArr.add(E68);
        pHumArr.add(E69);
        double E63 = getIndex(pHumArr, getMatch(E60, pHumTestArr, 1));
        double E64 = getIndex(pHumArr, getMatch(E60, pHumTestArr, 1) + 1);
        double relHumidity = E63 + (E60 - E61) * (E64 - E63) / (E62 - E61);
        double E71 = Math.abs(ambientT);
        List<Number> pSpdTestArr = new ArrayList<>();
        pSpdTestArr.add(0);
        pSpdTestArr.add(15);
        pSpdTestArr.add(25);
        pSpdTestArr.add(32);
        pSpdTestArr.add(46);
        double E72 = getIndex(pSpdTestArr, getMatch(E71, pSpdTestArr, 1));
        double E73 = getIndex(pSpdTestArr, getMatch(E71, pSpdTestArr, 1) + 1);
        double E76 = 174.706 * Math.pow((stFrequency / 60), 3) - 538.226 * Math.pow((stFrequency / 60), 2) + 551.577 * (stFrequency / 60) - 187.057;
        double E77 = -112.386 * Math.pow((stFrequency / 60), 3) + 301.717 * Math.pow((stFrequency / 60), 2) - 265.928 * (stFrequency / 60) + 77.597;
        double E78 = 225.864 * Math.pow((stFrequency / 60), 3) - 710.323 * Math.pow((stFrequency / 60), 2) + 744.364 * (stFrequency / 60) - 258.905;
        double E79 = -19.4615 * Math.pow((stFrequency / 60), 3) + 21.6669 * Math.pow((stFrequency / 60), 2) + 17.2299 * (stFrequency / 60) - 18.4353;
        double E80 = -527.474 * Math.pow((stFrequency / 60), 3) + 1545.48 * Math.pow((stFrequency / 60), 2) - 1503.97 * (stFrequency / 60) + 486.964;
        List<Number> pSpdArr = new ArrayList<>();
        pSpdArr.add(E76);
        pSpdArr.add(E77);
        pSpdArr.add(E78);
        pSpdArr.add(E79);
        pSpdArr.add(E80);
        double E74 = getIndex(pSpdArr, getMatch(E60, pSpdTestArr, 1));
        double E75 = getIndex(pSpdArr, getMatch(E60, pSpdTestArr, 1) + 1);
        double relEngineSpeed = E74 + (E71 - E72) * (E75 - E74) / (E73 - E72);
        double E82 = chRatio(methane, ethane, propane, butane, isobutane, pentane, isopentane);
        List<Number> pGasTestArr = new ArrayList<>();
        pGasTestArr.add(2.979);
        pGasTestArr.add(3.155);
        pGasTestArr.add(3.3);
        pGasTestArr.add(3.45);
        double E83 = getIndex(pGasTestArr, getMatch(E82, pGasTestArr, 1));
        double E84 = getIndex(pGasTestArr, getMatch(E82, pGasTestArr, 1) + 1);
        double E87 = 0.0000311312 * Math.pow((lhv / 1000), 2) - 0.00391754 * (lhv / 1000) + 1.12045;
        double E88 = 0.0000309164 * Math.pow((lhv / 1000), 2) - 0.00389258 * (lhv / 1000) + 1.11677;
        double E89 = 0.0000314845 * Math.pow((lhv / 1000), 2) - 0.00393467 * (lhv / 1000) + 1.11524;
        double E90 = 0.0000318051 * Math.pow((lhv / 1000), 2) - 0.00395701 * (lhv / 1000) + 1.11333;
        List<Number> pGasArr = new ArrayList<>();
        pGasArr.add(E87);
        pGasArr.add(E88);
        pGasArr.add(E89);
        pGasArr.add(E90);
        double E85 = getIndex(pGasArr, getMatch(E82, pGasTestArr, 1));
        double E86 = getIndex(pGasArr, getMatch(E82, pGasTestArr, 1) + 1);
        double fuelGasLHV = E85 + (E82 - E83) * (E86 - E85) / (E84 - E83);

        double otcDeviation = -0.00000275451 * Math.pow(getE92(ambientT), 2) + 0.00196996 * getE92(ambientT) + 1;
        double diffusorExhaustPressureLoss = -0.000000706787 * Math.pow(gtExhaustPress, 2) - 0.000211037 * (gtExhaustPress) + 1.01134;
        List<Double> gtPowerCorrectionProductArr = new ArrayList<>();
        gtPowerCorrectionProductArr.add(ambP);
        gtPowerCorrectionProductArr.add(gtCompInletPLoss);
        gtPowerCorrectionProductArr.add(gtCompInletT);
        gtPowerCorrectionProductArr.add(relHumidity);
        gtPowerCorrectionProductArr.add(relEngineSpeed);
        gtPowerCorrectionProductArr.add(fuelGasLHV);
        gtPowerCorrectionProductArr.add(otcDeviation);
        gtPowerCorrectionProductArr.add(diffusorExhaustPressureLoss);
        gtPowerCorrectionProductArr.add(pGTEquivalentBoxHours(gtEBH));
        double gtPowerCorrectionProduct = getProduct(gtPowerCorrectionProductArr) / 0.9972;
        /*
         * gtGrossPowerTag = Elec.11GT Gross Power
         * gtPowerCorrectionProduct = P Correction_11GT Power Correction Product
         * pGTEquivalentBoxHours = P Correction_11GT Equivalent Box Hours
         */
        double gtGrossPower = gtGrossPowerTag / gtPowerCorrectionProduct * pGTEquivalentBoxHours(gtEBH);
//		System.out.printf("11GT Gross Power : %.4f\n", gtGrossPower); // 5번
        return gtGrossPower;
    };

    // 1CC 6번
    public double gtDesignedPower(double gtEBH) {
        double T192 = 292.012;
        /*
         * pGTEquivalentBoxHours = P Correction_11GT Equivalent Box Hours
         */
        double gtDesignedPower = T192 * pGTEquivalentBoxHours(gtEBH);
//		System.out.printf("11GT Designed Power : %.4f\n", gtDesignedPower); // 6번
        return gtDesignedPower;
    };

    // 1CC 7번
    public double gtGrossEfficiency(double ambientT, double ambientP, double ambientRH, double compTin, double compPin, double gtEBH, double gasFlowRate, double gasTAfterFPRH, double gtGrossPowerTag, double stFrequency, double methane, double ethane, double propane,
                                            double butane, double isobutane, double pentane, double isopentane, double lhv, double reynoldsNumber, double gtDensity, double gtFuelCp) {
        double gtFuelEnthalpyAbove15C = gtFuelCp * (gasTAfterFPRH - 15);
        double gtFuelQinput = gtMassFlow(gasFlowRate, reynoldsNumber, gtDensity) * (lhv + gtFuelEnthalpyAbove15C) / 3600;
        double hrGtComprInletT;
        if (compTin < 15) {
            hrGtComprInletT = 0.00000998827 * Math.pow(compTin, 2) - 0.0000390012 * (compTin) + 0.998338;
        } else {
            hrGtComprInletT = 0.0000816215 * Math.pow(compTin, 2) - 0.00254304 * (compTin) + 1.01978;
        }
        double gtFilterDP = ambientP - compPin;
        double hrGtComprInletPLoss = 0.000303968 * gtFilterDP + 0.997568;
        double E115 = Math.abs(ambientT);
        List<Number> hrHumTestArr = new ArrayList<>();
        hrHumTestArr.add(0);
        hrHumTestArr.add(15);
        hrHumTestArr.add(25);
        hrHumTestArr.add(35);
        hrHumTestArr.add(45);
        double E116 = getIndex(hrHumTestArr, getMatch(E115, hrHumTestArr, 1));
        double E117 = getIndex(hrHumTestArr, getMatch(E115, hrHumTestArr, 1) + 1);
        double E120 = 0.000012196 * Math.pow((0.01 * ambientRH), 2) + 0.000130036 * (0.01 * ambientRH) + 0.999918;
        double E121 = 0.000270936 * Math.pow((0.01 * ambientRH), 2) + 0.0012887 * (0.01 * ambientRH) + 0.999129;
        double E122 = 0.000631947 * Math.pow((0.01 * ambientRH), 2) + 0.00344285 * (0.01 * ambientRH) + 0.997707;
        double E123 = 0.00228459 * Math.pow((0.01 * ambientRH), 2) + 0.0076479 * (0.01 * ambientRH) + 0.994589;
        double E124 = 0.00615837 * Math.pow((0.01 * ambientRH), 2) + 0.0266238 * (0.01 * ambientRH) + 0.981809;
        List<Number> hrHumArr = new ArrayList<>();
        hrHumArr.add(E120);
        hrHumArr.add(E121);
        hrHumArr.add(E122);
        hrHumArr.add(E123);
        hrHumArr.add(E124);
        double E118 = getIndex(hrHumArr, getMatch(E115, hrHumTestArr, 1));
        double E119 = getIndex(hrHumArr, getMatch(E115, hrHumTestArr, 1) + 1);
        double E126 = Math.abs(ambientT);
        List<Number> hrSpdTestArr = new ArrayList<Number>();
        hrSpdTestArr.add(0);
        hrSpdTestArr.add(15);
        hrSpdTestArr.add(25);
        hrSpdTestArr.add(32);
        hrSpdTestArr.add(46);
        double E127 = getIndex(hrSpdTestArr, getMatch(E126, hrSpdTestArr, 1));
        double E128 = getIndex(hrSpdTestArr, getMatch(E126, hrSpdTestArr, 1) + 1);
        double E131 = 8.56974 * Math.pow((stFrequency / 60), 2) - 16.772 * (stFrequency / 60) + 9.20226;
        double E132 = 14.2284 * Math.pow((stFrequency / 60), 2) - 28.4244 * (stFrequency / 60) + 15.196;
        double E133 = 13.0933 * Math.pow((stFrequency / 60), 2) - 26.4545 * (stFrequency / 60) + 14.3612;
        double E134 = 15.4076 * Math.pow((stFrequency / 60), 2) - 31.3277 * (stFrequency / 60) + 16.9201;
        double E135 = 24.1123 * Math.pow((stFrequency / 60), 2) - 49.827 * (stFrequency / 60) + 26.7147;
        List<Number> hrSpdArr = new ArrayList<Number>();
        hrSpdArr.add(E131);
        hrSpdArr.add(E132);
        hrSpdArr.add(E133);
        hrSpdArr.add(E134);
        hrSpdArr.add(E135);
        double E129 = getIndex(hrSpdArr, getMatch(E126, hrSpdTestArr, 1));
        double E130 = getIndex(hrSpdArr, getMatch(E126, hrSpdTestArr, 1) + 1);
        double E125 = E129 + (E126 - E127) * (E130 - E129) / (E128 - E127);
        double hrRelHumidity = E118 + (E115 - E116) * (E119 - E118) / (E117 - E116);
        double E137 = chRatio(methane, ethane, propane, butane, isobutane, pentane, isopentane);
        List<Number> hrGasTestArr = new ArrayList<Number>();
        hrGasTestArr.add(2.979);
        hrGasTestArr.add(3.155);
        hrGasTestArr.add(3.3);
        hrGasTestArr.add(3.45);
        double E138 = getIndex(hrGasTestArr, getMatch(E137, hrGasTestArr, 1));
        double E139 = getIndex(hrGasTestArr, getMatch(E137, hrGasTestArr, 1) + 1);
        double E142 = -0.00000921516 * Math.pow((0.001 * lhv), 2) + 0.00119282 * (0.001 * lhv) + 0.962838;
        double E143 = -0.00000923981 * Math.pow((0.001 * lhv), 2) + 0.00119605 * (0.001 * lhv) + 0.96349;
        double E144 = -0.00000945902 * Math.pow((0.001 * lhv), 2) + 0.00121527 * (0.001 * lhv) + 0.963644;
        double E145 = -0.00000961569 * Math.pow((0.001 * lhv), 2) + 0.00122947 * (0.001 * lhv) + 0.963899;
        List<Number> hrGasArr = new ArrayList<Number>();
        hrGasArr.add(E142);
        hrGasArr.add(E143);
        hrGasArr.add(E144);
        hrGasArr.add(E145);
        double E140 = getIndex(hrGasArr, getMatch(E137, hrGasTestArr, 1));
        double E141 = getIndex(hrGasArr, getMatch(E137, hrGasTestArr, 1) + 1);
        double E136 = E140 + (E137 - E138) * (E141 - E140) / (E139 - E138);
        double E146 = 0.00000203144 * Math.pow(getE92(ambientT), 2) - 0.0000754444 * getE92(ambientT) + 1;
        List<Double> hrGtHrCorrectionProductArr = new ArrayList<Double>();
        hrGtHrCorrectionProductArr.add(hrGtComprInletT);
        hrGtHrCorrectionProductArr.add(hrGtComprInletPLoss);
        hrGtHrCorrectionProductArr.add(hrRelHumidity);
        hrGtHrCorrectionProductArr.add(E125);
        hrGtHrCorrectionProductArr.add(E136);
        hrGtHrCorrectionProductArr.add(E146);
        hrGtHrCorrectionProductArr.add(hrGTEquivalentBoxHours(gtEBH));
        double hrGtHrCorrectionProduct = getProduct(hrGtHrCorrectionProductArr) / 1.0007;
        /*
         * gtGrossPowerTag = Elec.11GT Gross Power
         * gtFuelQinput = 11GT Fuel Qinput
         * hrGtHrCorrectionProduct = HR Correction_11GT HR Correction Product
         * hrGTEquivalentBoxHours = HR Correction_11GT Equivalent Box Hours
         */
        double gtGrossEfficiency = (gtGrossPowerTag * 1000) / gtFuelQinput * (hrGtHrCorrectionProduct / hrGTEquivalentBoxHours(gtEBH));
//		System.out.printf("11GT Gross Efficiency : %.4f\n", gtGrossEfficiency * 100); // 7번
        return gtGrossEfficiency * 100;
    };

    // 1CC 8번
    public double gtDesignedEfficiency(double gtEBH) {
        double T194 = 0.3957;
        /*
         * hrGTEquivalentBoxHours = HR Correction_11GT Equivalent Box Hours
         */
        double gtDesignedEfficiency = T194 / hrGTEquivalentBoxHours(gtEBH);
//		System.out.printf("11GT Designed Efficiency : %.4f\n", gtDesignedEfficiency * 100); // 8번
        return gtDesignedEfficiency * 100;
    };

    // 1CC 9번
    public double gtComprEfficiencyPolytropic(double compTin, double compPin, double compTout, double compPout) {
        /*
         * compTin = GT_11Comp. Tin
         * compPin = GT_11Comp. Pin
         * compTout = GT_11Comp. Tout
         * compPout = GT_11Comp. Pout
         */
        double gtComprEfficiencyPolytropic = (0.4 / 1.4) * Math.log(compPout / (compPin / 1000))
                / Math.log((compTout + 273.15) / (compTin + 273.15));
//		System.out.printf("11GT Compr. Efficiency(Polytropic) : %.4f\n", gtComprEfficiencyPolytropic * 100); // 9번
        return gtComprEfficiencyPolytropic * 100;
    };

    // 1CC 10번
    public double gtPressrurueRatio(double compPin, double compPout) {
        /*
         * compPin = GT_11Comp. Pin
         * compPout = GT_11Comp. Pout
         */
        double gtPressrurueRatio = compPout * 1000 / compPin;
//		System.out.printf("11GT Pressrurue Ratio : %.4f\n", gtPressrurueRatio); // 10번
        return gtPressrurueRatio;
    };
    // 1CC end
    // 10ST start
    // 10ST 1번 RIMS.WR.10MAG10FP002//XQ01
    public double stPowerOutput(double stGrossPower) {
        double stPowerOutput = stGrossPower;
		System.out.printf("10ST Power output : %.4f\n", stPowerOutput); // 1번
        return stPowerOutput;
    };

    // 10ST 2번
    public double stEnergyIn(double steamFromHPBoiler1H, double steamFromHPBoiler1F, double steamToCRHBoiler1H, double steamToCRHBoiler1F, double steamFromHRHBoiler1H, double steamFromHRHBoiler1F, double steamFromLPBoiler1H, double steamFromLPBoiler1F, double condensateWaterToCondensorH, double condensateWaterF) {
        double energyInFromHPBoiler = (steamFromHPBoiler1H * steamFromHPBoiler1F) / 1000;
        double energyOutToCRHBoiler = -steamToCRHBoiler1H / 1000 * steamToCRHBoiler1F;
        double energyInFromHRHBoiler = (steamFromHRHBoiler1H * steamFromHRHBoiler1F) / 1000;
        double energyInFromLPBoiler = steamFromLPBoiler1H / 1000 * steamFromLPBoiler1F;
        double energyOutToCondensorPreHeater = -condensateWaterToCondensorH * condensateWaterF / 1000;
        /*
         * energyInFromHPBoiler = Energy in from HP Boiler
         * energyOutToCRHBoiler = Energy out to CRH Boiler
         * energyInFromHRHBoiler = Energy in from HRH Boiler
         * energyInFromLPBoiler = Energy in from LP Boiler
         * energyOutToCondensorPreHeater = Energy out to Condensor Pre Heater
         */
        double stEnergyIn = (energyInFromHPBoiler + energyInFromHRHBoiler + energyInFromLPBoiler) + (energyOutToCRHBoiler + energyOutToCondensorPreHeater);
		System.out.printf("10ST Energy In : %.4f\n", stEnergyIn); // 2번
        return stEnergyIn;
    };

    // 10ST 3번
    public double st10Efficiency(double stGrossPower, double steamFromHPBoiler1H, double steamFromHPBoiler1F, double steamToCRHBoiler1H, double steamToCRHBoiler1F, double steamFromHRHBoiler1H, double steamFromHRHBoiler1F, double steamFromLPBoiler1H, double steamFromLPBoiler1F, double condensateWaterToCondensorH, double condensateWaterF) {
        double st10Efficiency = stPowerOutput(stGrossPower) / stEnergyIn(steamFromHPBoiler1H, steamFromHPBoiler1F, steamToCRHBoiler1H, steamToCRHBoiler1F, steamFromHRHBoiler1H, steamFromHRHBoiler1F, steamFromLPBoiler1H, steamFromLPBoiler1F, condensateWaterToCondensorH, condensateWaterF);
//		System.out.printf("10ST Power output : %.4f\n", get10STst10PowerOutput(stGrossPower)); // 1번
//		System.out.printf("10ST Energy In : %.4f\n", get10STst10EnergyIn(steamFromHPBoiler1H, steamFromHPBoiler1F, steamToCRHBoiler1H, steamToCRHBoiler1F, steamFromHRHBoiler1H, steamFromHRHBoiler1F, steamFromLPBoiler1H, steamFromLPBoiler1F, condensateWaterToCondensorH, condensateWaterF)); // 2번
//		System.out.printf("10ST Efficiency : %.4f\n", st10Efficiency * 100); // 3번
        return st10Efficiency * 100;
    };
    // 10ST end
    // 10Cond start
    // 10Cond 1번
    public double cond10P(double st10CondenserP) {
        double cond10P = st10CondenserP; // 1번
//		System.out.printf("10Cond. P : %.4f\n", cond10P); // 1번
        return cond10P;
    };

    // 10Cond 2번
    public double cond10SatT(double val) {
        double cond10SatT = val;
//		System.out.printf("10Cond. Sat. T : %.4f\n", cond10SatT); // 2번
        return cond10SatT;
    };

    // 10Cond 3번
    public double tTD(double condOutCWT, double condenserHotwellT) {
        /*
         * condOutCWT = Cond_Cond Out CW T
         * condenserHotwellT = Condenser Hotwell T
         */
        double terminalTempDifference = condenserHotwellT - condOutCWT; // 3번
        double tTD = terminalTempDifference;
//		System.out.printf("TTD : %.4f\n", tTD); // 3번
        return tTD;
    };

    // 10Cond 4번
    public double iTD(double condInCWT, double condenserHotwellT) {
        /*
         * condInCWT = Cond_Cond In CW T
         * condenserHotwellT = Condenser Hotwell T
         */
        double initialTempDifference = condenserHotwellT - condInCWT;
        double iTD =  initialTempDifference; // 4번
//		System.out.printf("ITD : %.4f\n", iTD); // 4번
        return iTD;
    };

    // 10Cond 5번
    public double cwTRise(double condInCWT, double condOutCWT) {
        /*
         * condInCWT = Cond_Cond In CW T
         * condOutCWT = Cond_Cond Out CW T
         */
        double cwTRise = condOutCWT - condInCWT; // 5번
//		System.out.printf("CW T Rise : %.4f\n", cwTRise); // 5번
        return cwTRise;
    };

    // 10Cond 6번
    public double stUEEP(double steamFromHPBoiler1F, double steamFromHRHBoiler1F, double steamFromLPBoiler1F, double afterCEPWaterF, double stGrossPower, double steamFromHPBoiler1H, double steamToCRHBoiler1H, double steamFromHRHBoiler1H, double steamFromLPBoiler1H, double condensateWaterToCondensorH, double condensateWaterF) {
        /*
         * afterCEPWaterF = ST_After CEP water F
         * stEnergyInSTEnergyOut = ST Energy in - ST Energy out
         */
        double stUEEP = stEnergyInSTEnergyOut(steamFromHPBoiler1F, steamFromHRHBoiler1F, steamFromLPBoiler1F, stGrossPower, steamFromHPBoiler1H, steamToCRHBoiler1H, steamFromHRHBoiler1H, steamFromLPBoiler1H, condensateWaterToCondensorH, condensateWaterF) / afterCEPWaterF * 1000; // 6번
//		System.out.printf("ST UEEP : %.4f\n", stUEEP); // 6번
        return stUEEP;
    };

    // 10Cond 7번
    public double condensateWaterH(double condensateWaterHTag) {
        double condensateWaterH = condensateWaterHTag; // 7번
//		System.out.printf("Condensate Water H : %.4f\n", condensateWaterH); // 7번
        return condensateWaterH;
    };

    // 10Cond 8번
    public double condensateWaterF(double afterCEPWaterF) {
        /*
         * afterCEPWaterF = ST_After CEP water F
         */
        double condensateWaterF = afterCEPWaterF / 3.6; // 8번
//		System.out.printf("Condensate Water F : %.4f\n", condensateWaterF); // 8번
        return condensateWaterF;
    };

    // 10Cond 9번
    public double condenserHeatLoad(double steamFromHPBoiler1F, double steamFromHRHBoiler1F, double steamFromLPBoiler1F, double afterCEPWaterF, double condenserMakeUpWaterF,
                                             double stGrossPower, double condensateWaterHTag,double steamFromHPBoiler1H, double steamToCRHBoiler1H, double steamFromHRHBoiler1H, double steamFromLPBoiler1H, double condensateWaterToCondensorH, double condensateWaterF) {
        /*
         * afterCEPWaterF = ST_After CEP water F
         * condenserMakeUpWaterF = ST_Condenser make up water F
         * condensateWaterHTag = Condensate water H
         * G28 = ST UEEP
         */
        double condenserHeatLoad = (stUEEP(steamFromHPBoiler1F, steamFromHRHBoiler1F, steamFromLPBoiler1F, afterCEPWaterF, stGrossPower, steamFromHPBoiler1H, steamToCRHBoiler1H, steamFromHRHBoiler1H, steamFromLPBoiler1H, condensateWaterToCondensorH, condensateWaterF) - condensateWaterHTag) * (afterCEPWaterF - condenserMakeUpWaterF) / 1000; // 9번
//		System.out.printf("Condenser Heat Load : %.4f\n", condenserHeatLoad); // 9번
        return condenserHeatLoad;
    };

    // 10Cond 10번
    public double cond10Cleanliness(double condInCWT, double condOutCWT, double steamFromHPBoiler1F, double steamFromHRHBoiler1F, double steamFromLPBoiler1F, double afterCEPWaterF, double condenserMakeUpWaterF, double stGrossPower, double condenserHotwellT,
                                             double condensateWaterHTag, double steamFromHPBoiler1H, double steamToCRHBoiler1H, double steamFromHRHBoiler1H, double steamFromLPBoiler1H, double condensateWaterToCondensorH, double condensateWaterF) {
        double heatLoadOnCondenser = (stUEEP(steamFromHPBoiler1F, steamFromHRHBoiler1F, steamFromLPBoiler1F, afterCEPWaterF, stGrossPower, steamFromHPBoiler1H, steamToCRHBoiler1H, steamFromHRHBoiler1H, steamFromLPBoiler1H, condensateWaterToCondensorH, condensateWaterF) - condensateWaterHTag) * (afterCEPWaterF - condenserMakeUpWaterF) / 1000;
        double initialTempDifference = condenserHotwellT - condInCWT;
        double terminalTempDifference = condenserHotwellT - condOutCWT;
        double G52 = condInCWT * 9 / 5 + 32;
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
        double cwInletTFactor = G55 + (G52 - G53) * (G56 - G55) / (G54 - G53);
        double logarithmicMeanTemp = (initialTempDifference - terminalTempDifference) / Math.log(initialTempDifference / terminalTempDifference);
        double totalOutsideTubeSurfaceAreaTag = 14050;
        double tubeODFactorTag = 2582;
        double tubeMaterialAndGaugeFactorTag = 0.89;
        double cwVelocityTag = 1.97;
        /*
         * heatLoadOnCondenser = Heat load on condenser
         * logarithmicMeanTemp = Logarithmic Mean Temp.
         * cwInletTFactor = CW inlet T factor
         */
        double cond10Cleanliness = 1000000 * heatLoadOnCondenser / (tubeODFactorTag * cwInletTFactor * tubeMaterialAndGaugeFactorTag * Math.sqrt(cwVelocityTag) * totalOutsideTubeSurfaceAreaTag * logarithmicMeanTemp); // 10번
//		System.out.printf("10Cond. Cleanliness : %.4f\n", cond10Cleanliness * 100); // 10번
        return cond10Cleanliness * 100;
    };
    // 10Cond end
    // 필요 수식
    private double chRatio(double methane, double ethane, double propane, double butane, double isobutane, double pentane, double isopentane) {
        double chRatio = ((methane * 1 + ethane * 2 + propane * 3 + butane * 4 + isobutane * 4 + pentane * 5 + isopentane * 5) * 12.011)
                / ((methane * 4 + ethane * 6 + propane * 8 + butane * 10 + isobutane * 10 + pentane * 12 + isopentane * 12) * 1.00794);
        return chRatio;
    };

    private double gtMassFlow(double gasFlowRate, double reynoldsNumber, double gtDensity) {
        double E43 = 4.59;
        double E44 = 7.91;
        double E45 = 0.1;
        double E46 = -0.01;
        double E42 = E45 + (reynoldsNumber - E43) * (E46 - E45) / (E44 - E43);
        double E47 = gasFlowRate / (1 + E42 / 100);
        double gtMassFlow = E47 * gtDensity;
        return gtMassFlow;
    };

    private double getE92(double ambientT) {
        double E98 = 4;
        double E99 = 3;
        double E100 = 1.6;
        double E101 = 0.5;
        double E102 = 0;
        double E103 = 0;
        double E93 = ambientT;
        List<Number> pOTCTestArr = new ArrayList<>();
        pOTCTestArr.add(-20);
        pOTCTestArr.add(-10);
        pOTCTestArr.add(0);
        pOTCTestArr.add(10);
        pOTCTestArr.add(15);
        pOTCTestArr.add(40); // 고정값
        double E94 = getIndex(pOTCTestArr, getMatch(E93, pOTCTestArr, 1));
        double E95 = getIndex(pOTCTestArr, getMatch(E93, pOTCTestArr, 1) + 1);
        List<Number> pOTCArr = new ArrayList<>();
        pOTCArr.add(E98);
        pOTCArr.add(E99);
        pOTCArr.add(E100);
        pOTCArr.add(E101);
        pOTCArr.add(E102);
        pOTCArr.add(E103);
        double E96 = getIndex(pOTCArr, getMatch(E93, pOTCTestArr, 1));
        double E97 = getIndex(pOTCArr, getMatch(E93, pOTCTestArr, 1) + 1);
        double E92 = E96 + (E93 - E94) * (E97 - E96) / (E95 - E94);
        return E92;
    };

    private double pGTEquivalentBoxHours(double gtEBH) {
        double E107 = 29000;
        double E108 = 30000;
        double E109 = 0.9784;
        double E110 = 0.97820;
        double E106 = gtEBH;
        double pGTEquivalentBoxHours = E109 + (E106 - E107) * (E110 - E109) / (E108 - E107);
        return pGTEquivalentBoxHours;
    };

    private double hrGTEquivalentBoxHours(double gtEBH) {
        double E150 = 29000;
        double E151 = 30000;
        double E152 = 1.013;
        double E153 = 1.013;
        double E149 = gtEBH;
        double hrGTEquivalentBoxHours = E152 + (E149 - E150) * (E153 - E152) / (E151 - E150);
        return hrGTEquivalentBoxHours;
    };

    private double pAdditiveCorrection(double gtGrossPowerTag, double stGrossPower, double gtPowerFactor) {
        double pAdditiveCorrection = -(2071.25714 + 1.32386288 * (gtGrossPowerTag + stGrossPower) + 0.000778400374 * Math.pow((gtGrossPowerTag + stGrossPower), 2)
                + 0.0000065121077 * Math.pow((gtGrossPowerTag + stGrossPower), 3))
                + (2071.24286 + 1.3193055 * (gtGrossPowerTag + stGrossPower) + 0.000224179308 * Math.pow((gtGrossPowerTag + stGrossPower), 2)
                + 0.00000644427324 * Math.pow((gtGrossPowerTag + stGrossPower), 3))
                - (1 - gtPowerFactor) / (1 - 0.95)
                * ((2071.24286 + 1.3193055 * (gtGrossPowerTag + stGrossPower) + 0.000224179308 * Math.pow((gtGrossPowerTag + stGrossPower), 2)
                + 0.00000644427324 * Math.pow((gtGrossPowerTag + stGrossPower), 3))
                - (2071.25714 + 1.32386288 * (gtGrossPowerTag + stGrossPower) + 0.000778400374 * Math.pow((gtGrossPowerTag + stGrossPower), 2)
                + 0.0000065121077 * Math.pow((gtGrossPowerTag + stGrossPower), 3)));
        return pAdditiveCorrection;
    };

    private double pPowerCorrectionProduct(double ambientT, double ambientP, double ambientRH, double compTin, double compPin, double stCondenserP, double gasT, double stFrequency, double methane, double ethane, double propane, double butane, double isobutane, double pentane, double isopentane, double lhv) {
        List<Double> list = new ArrayList<>();
        double gtFilterDP = ambientP - compPin;
        double pAmbT;
        if (ambientT > -5) {
            pAmbT = 0.0000000000227947 * Math.pow(ambientT, 6) - 0.000000000904288 * Math.pow(ambientT, 5)
                    + 0.0000000116046 * Math.pow(ambientT, 4) + 0.00000153038 * Math.pow(ambientT, 3)
                    + 0.0000313905 * Math.pow(ambientT, 2) + 0.00173846 * (ambientT) + 0.962479;
        } else {
            pAmbT = 0.00006077479 * Math.pow(ambientT, 2) + 0.0005937187 * (ambientT) + 0.9617201;
        }
        double E161 = ambientRH - 60;
        double E162 = compTin;
        double E165 = lhv - 49307.9;
        double E166 = chRatio(methane, ethane, propane, butane, isobutane, pentane, isopentane);
        double E168 = stFrequency / 60;
        double E169 = compTin;
        double pAmbP = 0.000001208792 * Math.pow(ambientP - 1013, 2) - 0.0009982435 * (ambientP - 1013) + 1;
        double pAmbRH = 1 - 0.00003899067 * E161 + 0.000000399928 * Math.pow(E161, 2) - 1.734723E-17 * E162
                - 1.084202E-18 * Math.pow(E162, 2) - 0.000000734811 * E161 * E162 + 0.00000006844623 * E161 * (2 * E162)
                + 0.0000003040975 * E161 * Math.pow(E162, 2)
                - 0.000000002054733 * Math.pow(E161, 2) * Math.pow(E162, 2);
        double PFuelT = -0.000000007423235 * (Math.pow(gasT - 15, 2)) - 0.000007852198 * (gasT - 15) + 1;
        double pFuelAnalysis = 0.9125875 + 0.00000101875 * E165 - 0.000000000209375 * Math.pow(E165, 2) + 0.0435 * E166
                - 0.005 * Math.pow(E166, 2) - 0.000000125 * E165 * E166 + 0.0000000000625 * Math.pow(E165, 2) * E166
                + 4.336809E-19 * E165 * Math.pow(E166, 2);
        double pGridFrequency = 1 + 0.004432362 * E168 + 0.00118746 * Math.pow(E168, 2) + 3.469447E-18 * E169
                + 2.168404E-19 * Math.pow(E169, 2) - 0.00008495811 * E168 * E169
                + 0.00005173638 * Math.pow(E168, 2) * E169 - 0.0000289971 * E168 * Math.pow(E169, 2)
                + 0.000007918523 * Math.pow(E168, 2) * Math.pow(E169, 2);
        double pGtInletPdrop = 0.001460719 * (gtFilterDP - 8) + 1;
        double pCondenserP = 0.000000000000352771 * Math.pow(stCondenserP * 1000 - 41.9, 6)
                - 0.0000000000645594 * Math.pow(stCondenserP * 1000 - 41.9, 5)
                + 0.00000000417418 * Math.pow(stCondenserP * 1000 - 41.9, 4) - 0.000000178082 * Math.pow(stCondenserP * 1000 - 41.9, 3)
                + 0.00000874248 * Math.pow(stCondenserP * 1000 - 41.9, 2) + 0.000369709 * (stCondenserP * 1000 - 41.9) + 1;
        list.add(pAmbT);
        list.add(pAmbP);
        list.add(pAmbRH);
        list.add(PFuelT);
        list.add(pFuelAnalysis);
        list.add(pGridFrequency);
        list.add(pGtInletPdrop);
        list.add(pCondenserP);
        double pPowerCorrectionProduct = getProduct(list);
        return pPowerCorrectionProduct;
    };

    private double hrCorrectionProduct(double ambientT, double ambientP, double ambientRH, double compTin, double compPin, double stCondenserP, double gasT, double stFrequency) {
        List<Double> list = new ArrayList<>();
        double hrAmbT;

        if (ambientT < -2.5) {
            hrAmbT = 0.0000247122 * Math.pow(ambientT, 2) - 0.0004919713 * ambientT + 1.005837;
        } else {
            hrAmbT = -0.00000000000637832 * Math.pow(ambientT, 6) + 0.0000000000894723 * Math.pow(ambientT, 5)
                    + 0.0000000158761 * Math.pow(ambientT, 4) + 0.00000014839 * Math.pow(ambientT, 3)
                    + 0.0000220328 * Math.pow(ambientT, 2) - 0.000776154 * ambientT + 1.00564;
        }
        double hrAmbP = 0.0000002306463 * Math.pow((ambientP - 1013), 2) - 0.00001619771 * (ambientP - 1013) + 1;
        double E176 = ambientRH - 60;
        double E177 = compTin;
        double hrAmbRH = 1 + 0.000007228621 * E176 + 0.0000004123121 * Math.pow(E176, 2) - 1.734723E-17 * E177
                - 1.084202E-18 * Math.pow(E177, 2) + 0.000002907698 * E176 * E177
                + 0.00000006920143 * Math.pow(E176, 2) * E177 + 0.0000002463781 * E176 * Math.pow(E177, 2)
                - 0.000000002323444 * Math.pow(E176, 2) * Math.pow(E177, 2);
        double hrFuelT = 0.00000001846533 * Math.pow((gasT - 15), 2) + 0.00003493607 * gasT + 1;
        double hrFuelAnalysis = 1;
        double E181 = stFrequency / 60;
        double E182 = compTin;
        double hrGridFrequency = 1 + 0.001947536 * E181 + 0.0008529767 * Math.pow(E181, 2) + 3.469447E-18 * E182
                + 2.168404E-19 * Math.pow(E182, 2) - 0.000124597 * E181 * E182
                + 0.00001966455 * Math.pow(E181, 2) * E182 - 0.000001528704 * E181 * Math.pow(E182, 2)
                + 0.00000006724679 * Math.pow(E181, 2) * Math.pow(E182, 2);
        double gtFilterDP = ambientP - compPin;
        double hrGtInletPdrop = 0.0001600026 * (gtFilterDP - 8) + 1;
        double hrCondensorP = 0.000000000000356177 * Math.pow((stCondenserP * 1000 - 41.9), 6)
                - 0.0000000000650473 * Math.pow((stCondenserP * 1000 - 41.9), 5)
                + 0.00000000418965 * Math.pow((stCondenserP * 1000 - 41.9), 4) - 0.00000017802 * Math.pow((stCondenserP * 1000 - 41.9), 3)
                + 0.00000924954 * Math.pow((stCondenserP * 1000 - 41.9), 2) + 0.000369423 * (stCondenserP * 1000 - 41.9) + 1;

        list.add(hrAmbT);
        list.add(hrAmbP);
        list.add(hrAmbRH);
        list.add(hrFuelT);
        list.add(hrFuelAnalysis);
        list.add(hrGridFrequency);
        list.add(hrGtInletPdrop);
        list.add(hrCondensorP);
        double hrCorrectionProduct = getProduct(list);
        return hrCorrectionProduct;
    };

    private double stEnergyInSTEnergyOut(double steamFromHPBoiler1F, double steamFromHRHBoiler1F, double steamFromLPBoiler1F, double stGrossPower, double steamFromHPBoiler1H, double steamToCRHBoiler1H, double steamFromHRHBoiler1H, double steamFromLPBoiler1H, double condensateWaterToCondensorH, double condensateWaterF) {
        double G32 = steamFromHPBoiler1F;
        double energyInFromHPBoiler = (steamFromHPBoiler1H * G32) / 1000;
        double G35 = steamFromHPBoiler1F;
        double energyOutToCRHBoiler = -steamToCRHBoiler1H / 1000 * (G35);
        double G38 = steamFromHRHBoiler1F;
        double energyInFromHRHBoiler = (steamFromHRHBoiler1H * G38) / 1000;
        double G41 = steamFromLPBoiler1F;
        double energyInFromLPBoiler = steamFromLPBoiler1H / 1000 * (G41);
        double energyOutToCondensorPreHeater = -condensateWaterToCondensorH * condensateWaterF / 1000;
        double stEnergyInSTEnergyOut = (energyInFromHPBoiler + energyInFromHRHBoiler + energyInFromLPBoiler) + (energyOutToCRHBoiler + energyOutToCondensorPreHeater) - stGrossPower;
        return stEnergyInSTEnergyOut;
    };

//    private double getG28(double steamFromHPBoiler1F, double steamFromHRHBoiler1F, double steamFromLPBoiler1F, double afterCEPWaterF, double stGrossPower, double steamFromHPBoiler1H, double steamToCRHBoiler1H, double steamFromHRHBoiler1H, double steamFromLPBoiler1H, double condensateWaterToCondensorH, double condensateWaterF) {
//        double G28 = stEnergyInSTEnergyOut(steamFromHPBoiler1F, steamFromHRHBoiler1F, steamFromLPBoiler1F, stGrossPower, steamFromHPBoiler1H, steamToCRHBoiler1H, steamFromHRHBoiler1H, steamFromLPBoiler1H, condensateWaterToCondensorH, condensateWaterF) / afterCEPWaterF * 1000;
//        return G28;
//    };

    // product(arr) arr의 각 값들을 전부 곱함
    private double getProduct(List<Double> list) {
        double temp = 1;
        for (int i = 0; i < list.size(); i++) {
            temp *= Double.parseDouble(list.get(i).toString());
        }
        return temp;
    };

    // {sum(arr_1 : arr_2)} 두 배열에서 각 인덱스에 해당하는 값을 곱한 뒤 전부 더함
    private double getSumArr(List arr_1, List arr_2) {
        double temp = 0;
        for (int i = 0; i < arr_1.size(); i++) {
            temp += Double.parseDouble(arr_1.get(i).toString()) * Double.parseDouble(arr_2.get(i).toString());
        }
        return temp;
    };

    // index(arr, row_num) arr에서 해당 index(row_num)의 값을 찾음
    private double getIndex(List<Number> arr, int rowNum) {
        return Double.parseDouble(arr.get(rowNum - 1).toString());
    };

    // match(lookup_value, lookup_arr, match_type(-1, 0, 1)) 찾을 값(lookup_value)이 lookup_arr의 몇 번째 index인지 찾음
    private int getMatch(double lookUpValue, List<Number> arr, int matchType) {
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
    };

    // match(lookup_value, lookup_arr) match_type를 입력하지 않으면 기본값은 1임
    private int getMatch(double lookUpValue, List<Number> arr) {
        return getMatch(lookUpValue, arr, 1);
    };
    // 효율 계산 end
}
