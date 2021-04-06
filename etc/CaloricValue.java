package com.doosan.test;

import java.util.ArrayList;
import java.util.List;

public class CaloricValue {
	public static void main(String[] args) {
//		System.out.println(hhv(0.001208,
//						0.934041,
//						0.044754,
//						0.013459,
//						0.003334,
//						0.003009,
//						0.000042,
//						0.000152
//));
//		System.out.println(lhv(0.001208,
//						0.934041,
//						0.044754,
//						0.013459,
//						0.003334,
//						0.003009,
//						0.000042,
//						0.000152
//));
//

		System.out.println(reynoldsNumber(40.4152, 31.3295, 1829.08487, 0.001208, 0.934041, 0.044754, 0.013459,
				0.003334, 0.003009, 0.000042, 0.000152));

//		System.out.println(fuelCp(0.001208,
//						0.934041,
//						0.044754,
//						0.013459,
//						0.003334,
//						0.003009,
//						0.000042,
//						0.000152));

//		System.out.println(
//				CaloricValue.gtOfGas(0.001033, 0.927128, 0.055314, 0.011029, 0.002694, 0.002635, 0.000039, 0.000129));

	}

	// E37
	private static double hhv(double nitrogen, double methane, double ethane, double propane, double butane,
			double isobutane, double pentane, double isopentane) {
		List<Double> inputArr = new ArrayList<>();
		inputArr.add(-890.7);
		inputArr.add(-1560.7);
		inputArr.add(-2219.2);
		inputArr.add(-2877.5);
		inputArr.add(-2869.0);
		inputArr.add(-3535.4);
		inputArr.add(-3535.4);
		List<Double> airArr = new ArrayList<>();
		airArr.add(methane);
		airArr.add(ethane);
		airArr.add(propane);
		airArr.add(butane);
		airArr.add(isobutane);
		airArr.add(pentane);
		airArr.add(isopentane);
		double E11 = Calc.getSumArr(inputArr, airArr);
		double mwOfGas = molacularWeightFuel(nitrogen, methane, ethane, propane, butane, isobutane, pentane,
				isopentane);
		double hhv = E11 * (-1000) / mwOfGas;
		return hhv;
	}

	// E36
	private static double lhv(double nitrogen, double methane, double ethane, double propane, double butane,
			double isobutane, double pentane, double isopentane) {
		double mwOfGas = molacularWeightFuel(nitrogen, methane, ethane, propane, butane, isobutane, pentane,
				isopentane);
		double lhv = hhv(nitrogen, methane, ethane, propane, butane, isobutane, pentane, isopentane)
				- 18.01468 * 2 / mwOfGas * 2465.37990433311;
		return lhv;
	}

	// E41
	private static double reynoldsNumber(double gasP, double gasT, double gasFlowRate, double nitrogen, double methane,
			double ethane, double propane, double butane, double isobutane, double pentane, double isopentane) {
		double mwOfGas = CaloricValue.molacularWeightFuel(nitrogen, methane, ethane, propane, butane, isobutane,
				pentane, isopentane);
		double density = density(gasP, gasT, nitrogen, methane, ethane, propane, butane, isobutane, pentane,
				isopentane);
		double fuelVelocity = gasFlowRate / (Math.PI / 4 * Math.pow(0.2, 2)) / 3600;
		double X = 3.5 + 986 / (gasT * 1.8 + 32 + 491.67) + 0.01 * mwOfGas;
		double Y = 2.4 - 0.2 * (3.5 + 986 / (gasT * 1.8 + 32 + 491.67) + 0.01 * mwOfGas);
		double K = ((9.4 - 0.02 * mwOfGas) * Math.pow((gasT * 1.8 + 32 + 491.67), 1.5))
				/ (209 + 19 * mwOfGas + (gasT * 1.8 + 32 + 491.67));
		double dynamicViscosity = K * Math.exp(X * Math.pow((density / 1000), Y)) / 10;
		double reynoldsNumber = density * fuelVelocity * 0.2 / dynamicViscosity;
		return reynoldsNumber;
	}

	// E48
	private static double density(double gasP, double gasT, double nitrogen, double methane, double ethane,
			double propane, double butane, double isobutane, double pentane, double isopentane) {
		double mwOfGas = molacularWeightFuel(nitrogen, methane, ethane, propane, butane, isobutane, pentane,
				isopentane);
		double D89 = gasT;
		List<Double> airArr = new ArrayList<>();
		airArr.add(methane);
		airArr.add(ethane);
		airArr.add(propane);
		airArr.add(butane);
		airArr.add(isobutane);
		airArr.add(pentane);
		airArr.add(isopentane);
		List<Double> inputKArr = new ArrayList<>();
		inputKArr.add(126.19);
		inputKArr.add(190.6);
		inputKArr.add(305.3);
		inputKArr.add(369.9);
		inputKArr.add(425.0);
		inputKArr.add(407.7);
		inputKArr.add(469.8);
		inputKArr.add(461.5);
		double D139 = Calc.getSumArr(airArr, inputKArr);
		double D136 = (D89 + 273.15) / D139;
		double D160 = -0.101 - 0.36 * D136 + 1.3868 * Math.pow((D136 - 0.919), 0.5);
		double D161 = 0.021 + 0.04275 / (D136 - 0.65);
		double D88 = gasP;
		List<Double> inputBarArr = new ArrayList<>();
		inputKArr.add(33.978);
		inputKArr.add(46.1);
		inputKArr.add(49.0);
		inputKArr.add(42.5);
		inputKArr.add(38.0);
		inputKArr.add(36.5);
		inputKArr.add(33.6);
		inputKArr.add(33.8);
		double D140 = Calc.getSumArr(airArr, inputBarArr);
		double D137 = D88 / D140;
		double D163 = 0.122 * Math.exp(-11.3 * (D136 - 1));
		double D164 = 0.6222 - 0.224 * D136;
		double D165 = 0.0657 / (D136 - 0.85) - 0.037;
		double D166 = 0.32 * Math.exp(-19.53 * (D136 - 1));
		double D162 = D137 * (D164 + D165 * D137 + D166 * Math.pow(D137, 4));
		double Z = D160 + D161 * D137 + (1 - D160) * Math.exp(-D162) - D163 * Math.pow((D137 / 10), 4);
		double density = 100 * mwOfGas * gasP / (8.314462 * (gasT + 273.15) * Z);
		return density;
	}

	// E50 - 이식완료
	private static double fuelCp(double nitrogen, double methane, double ethane, double propane, double butane,
			double isobutane, double pentane, double isopentane) {
		List<Double> airArr = new ArrayList<Double>();
		airArr.add(nitrogen);
		airArr.add(methane);
		airArr.add(ethane);
		airArr.add(propane);
		airArr.add(butane);
		airArr.add(isobutane);
		airArr.add(pentane);
		airArr.add(isopentane);
		List<Double> inputArr = new ArrayList<Double>();
		inputArr.add(29.52290477);
		inputArr.add(45.57590665);
		inputArr.add(76.27677252);
		inputArr.add(109.2312961);
		inputArr.add(143.0678918);
		inputArr.add(143.6499273);
		inputArr.add(176.2804368);
		inputArr.add(209.5530516);
		double calc = Calc.getSumArr(airArr, inputArr);
		double calc2 = calc
				/ molacularWeightFuel(nitrogen, methane, ethane, propane, butane, isobutane, pentane, isopentane);
		double fuelCp = calc2 * 1.0306;
		return fuelCp;
	}

	// E38 - 이식완료
	private static double molacularWeightFuel(double nitrogen, double methane, double ethane, double propane,
			double butane, double isobutane, double pentane, double isopentane) {
		// CC, HRSG사용
		List<Double> airArr = new ArrayList<>();
		airArr.add(nitrogen);
		airArr.add(methane);
		airArr.add(ethane);
		airArr.add(propane);
		airArr.add(butane);
		airArr.add(isobutane);
		airArr.add(pentane);
		airArr.add(isopentane);
		List<Double> inputArr = new ArrayList<>();
		inputArr.add(28.0134);
		inputArr.add(16.04206);
		inputArr.add(30.06844);
		inputArr.add(44.09482);
		inputArr.add(58.1212);
		inputArr.add(58.1212);
		inputArr.add(72.14758);
		inputArr.add(72.14758);
		double molacularWeightFuel = Calc.getSumArr(airArr, inputArr);
		return molacularWeightFuel;
	}

}
