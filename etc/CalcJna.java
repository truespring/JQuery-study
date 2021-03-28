package com.doosan.test;

import com.doosan.test.JnaUnisteam.UniSteamCal;

public class CalcJna {

	public static void main(String[] args) {


		double cald3 = UniSteamCal.INSTANCE.STEAMPTM(20.6, 32.6, 4); //7.55

		System.out.println("cald3 : " + cald3);
	}

}
