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
		
		System.out.println(reynoldsNumber(40.4, 31.3, 1829.1
, 0.001208,
0.934041,
0.044754,
0.013459,
0.003334,
0.003009,
0.000042,
0.000152));

		System.out.println(fuelCp(0.001208,
						0.934041,
						0.044754,
						0.013459,
						0.003334,
						0.003009,
						0.000042,
						0.000152));
		
//		System.out.println(
//				CaloricValue.gtOfGas(0.001033, 0.927128, 0.055314, 0.011029, 0.002694, 0.002635, 0.000039, 0.000129));

	}

	// E37
	private static double hhv(double nitrogen, double methane, double ethane, double propane, double butane, double isobutane, double pentane,
			double isopentane) {
		// TODO 엑셀대로 나오나 원래값과 차이남
		double E61 = -890.7;
		double E62 = -1560.7;
		double E63 = -2219.2;
		double E64 = -2877.5;
		double E65 = -2869;
		double E66 = -3535.4;
		double E67 = -3528.4;
		double E11 = methane * E61 + ethane * E62 + propane * E63 + butane * E64 + isobutane * E65 + pentane * E66 + isopentane * E67;
		double mwOfGas = molacularWeightFuel(nitrogen, methane, ethane, propane, butane, isobutane, pentane, isopentane);
		double hhv = E11 * (-1000) / mwOfGas;
		return hhv;
	}

	// E36
	private static double lhv(double nitrogen, double methane, double ethane, double propane, double butane, double isobutane, double pentane,
			double isopentane) {
		// TODO 엑셀대로 나오나 원래값과 차이남
		double mwOfGas = molacularWeightFuel(nitrogen, methane, ethane, propane, butane, isobutane, pentane, isopentane);
		double lhv = hhv(nitrogen, methane, ethane, propane, butane, isobutane, pentane, isopentane) - 18.01468 * 2 / mwOfGas * 2465.37990433311;
		return lhv;
	}

	// E41
	private static double reynoldsNumber(double gasP, double gasT, double gasFlowRate, double nitrogen, double methane,
			double ethane, double propane, double butane, double isobutane, double pentane, double isopentane) {
		// TODO 확인필요
		double mwOfGas = CaloricValue.molacularWeightFuel(nitrogen, methane, ethane, propane, butane, isobutane, pentane, isopentane);
		double density = density(gasP, gasT, nitrogen, methane, ethane, propane, butane, isobutane, pentane, isopentane);
		System.out.println("density : " + density);
		double fuelVelocity = gasFlowRate/(Math.PI/4*Math.pow(0.2,2))/3600;
		System.out.println("fuelVelocity : " + fuelVelocity);
		double X = 3.5 + 986 / (gasT * 1.8 + 32 + 491.67) + 0.01 * mwOfGas;
		double Y = 2.4 - 0.2 * (3.5 + 986 / (gasT * 1.8 + 32 + 491.67) + 0.01 * mwOfGas);
		double K = ((9.4 - 0.02 * mwOfGas) * Math.pow((gasT * 1.8 + 32 + 491.67), 1.5)) / (209 + 19 * mwOfGas + (gasT * 1.8 + 32 + 491.67));
		double dynamicViscosity = K * Math.exp(X * Math.pow((density / 1000), Y)); // 여기서 한번의 과정이 더 있어야할듯
		System.out.println("X : " + X);
		System.out.println("Y : " + Y);
		System.out.println("K : " + K);
		System.out.println("dynamicViscosity : " + dynamicViscosity);
		double reynoldsNumber = density * fuelVelocity * 0.2 / dynamicViscosity;
		return reynoldsNumber;
	}
	
	// E48
	private static double density(double gasP, double gasT, double nitrogen, double methane,
			double ethane, double propane, double butane, double isobutane, double pentane, double isopentane) {
		double mwOfGas = molacularWeightFuel(nitrogen, methane, ethane, propane, butane, isobutane, pentane, isopentane);
		double density = 100 * mwOfGas * gasP / (8.314462 * (gasT + 273.15));
		return density;
	}

	// E50 - 이식완료
	private static double fuelCp(double nitrogen, double methane, double ethane, double propane, double butane, double isobutane, double pentane,
			double isopentane) {
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
		double calc2 = calc / molacularWeightFuel(nitrogen, methane, ethane, propane, butane, isobutane, pentane, isopentane);
		double fuelCp = calc2 * 1.0306;
		return fuelCp;
	}
	
	// E38 - 이식완료
	private static double molacularWeightFuel(double nitrogen, double methane, double ethane, double propane, double butane, double isobutane, double pentane,
			double isopentane) {
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
