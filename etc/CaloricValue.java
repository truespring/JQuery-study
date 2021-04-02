package com.doosan.test;

public class CaloricValue {
	public static void main(String[] args) {
//		System.out.println(
//				CaloricValue.hhv(0.001033, 0.927128, 0.055314, 0.011029, 0.002694, 0.002635, 0.000039, 0.000129));
//
//		System.out.println(
//				CaloricValue.lhv(0.001033, 0.927128, 0.055314, 0.011029, 0.002694, 0.002635, 0.000039, 0.000129));
//
//		System.out.println(CaloricValue.reynoldsNumber(40.2213, 34.6670, 1756.8, 0.001033, 0.927128, 0.055314, 0.011029,
//				0.002694, 0.002635, 0.000039, 0.000129));
//
//		System.out.println(
//				CaloricValue.fuelCp(0.001033, 0.927128, 0.055314, 0.011029, 0.002694, 0.002635, 0.000039, 0.000129));
		
		System.out.println(
				CaloricValue.gtOfGas(0.001033, 0.927128, 0.055314, 0.011029, 0.002694, 0.002635, 0.000039, 0.000129));

	}

	private static double hhv(double E13, double E14, double E15, double E16, double E17, double E18, double E19,
			double E20) {
		// TODO 확인필요
		double E61 = -890.7;
		double E62 = -1560.7;
		double E63 = -2219.2;
		double E64 = -2877.5;
		double E65 = -2869;
		double E66 = -3535.4;
		double E67 = -3528.4;
		double E11 = E14 * E61 + E15 * E62 + E16 * E63 + E17 * E64 + E18 * E65 + E19 * E66 + E20 * E67;
		double mwOfGas = CaloricValue.gtOfGas(E13, E14, E15, E16, E17, E18, E19, E20);
		double hhv = E11 * (-1000) / mwOfGas;
		return hhv;
	}

	private static double lhv(double E13, double E14, double E15, double E16, double E17, double E18, double E19,
			double E20) {
		// TODO 확인필요
		double mwOfGas = CaloricValue.gtOfGas(E13, E14, E15, E16, E17, E18, E19, E20);
		double lhv = CaloricValue.hhv(E13, E14, E15, E16, E17, E18, E19, E20) - 18.01468 / mwOfGas * 2465.37990433311;
		lhv = 54875.6995 - 18.01468 / mwOfGas * 2465.37990433311;
		return lhv;
	}

	private static double reynoldsNumber(double gas_p, double gas_t, double gasFlowRate, double E13, double E14,
			double E15, double E16, double E17, double E18, double E19, double E20) {
		// TODO 확인필요
		double gasP = gas_p;
		double gasT = gas_t;
		double mwOfGas = CaloricValue.gtOfGas(E13, E14, E15, E16, E17, E18, E19, E20);
		double density = 100 * mwOfGas * gasP / (8.314462 * (gasT + 273.15));
		System.out.println("mwOfGas : " + mwOfGas);
		System.out.println("gasP : " + gasP);
		System.out.println("gasT : " + gasT);
		double fuelVelocity = gasFlowRate / (Math.PI / 4 * Math.pow(0.2, 2)) / 3600;
		double x = 3.5 + 986 / (gasT * 1.8 + 32 + 491.67) + 0.01 * mwOfGas;
		double y = 2.4 - 0.2 * (3.5 + 986 / (gasT * 1.8 + 32 + 491.67) + 0.01 * mwOfGas);
		double F6 = gasT * 1.8 + 32 + 491.67;
		System.out.println("F6 : " + F6);
		double I6 = mwOfGas;
		double k = (9.4 - 0.02 * I6) * Math.pow(F6, 1.5) / (209 + 19 * I6 + F6);
//		double k = (9.4 - 0.02 * mwOfGas) * ((gasT * 1.8 + 32 + 491.67) ^ 1.5)) / (209 + 19 * mwOfGas + gasT * 1.8 + 32 + 491.67));
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("k : " + k);
		double dynamicViscosity = k * Math.exp(x * Math.pow((density / 1000), y));
		double reynoldsNumber = density * fuelVelocity * 0.2 / dynamicViscosity;
		System.out.println("density : " + density);
		System.out.println("fuelVelocity : " + fuelVelocity);
		System.out.println("dynamicviscosity : " + dynamicViscosity);
		return reynoldsNumber;
	}

	private static double fuelCp(double E13, double E14, double E15, double E16, double E17, double E18, double E19,
			double E20) {
		// TODO 확인필요
		double E79 = 29.52290477;
		double E80 = 45.57590665;
		double E81 = 76.27677252;
		double E82 = 109.2312961;
		double E83 = 143.0678918;
		double E84 = 143.6499273;
		double E85 = 176.2804368;
		double E86 = 209.5530516;
		double fuelCp = E79 * E13 + E80 * E14 + E81 * E15 + E82 * E16 + E83 * E17 + E84 * E18 + E85 * E19 + E86 * E20;
		return fuelCp;
	}
	
	private static double gtOfGas(double E13, double E14, double E15, double E16, double E17, double E18, double E19,
			double E20) {
		// CC, HRSG사용
		double B13 = 28.0134;
		double B14 = 16.04206;
		double B15 = 30.06844;
		double B16 = 44.09482;
		double B17 = 58.1212;
		double B18 = 58.1212;
		double B19 = 72.14758;
		double B20 = 72.14758;
		double mwOfGas = E13 * B13 + E14 * B14 + E15 * B15 + E16 * B16 + E17 * B17 + E18 * B18 + E19 * B19 + E20 * B20;
		return mwOfGas;
	}

}
