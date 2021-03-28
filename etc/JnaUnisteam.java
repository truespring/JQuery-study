package com.doosan.test;

import com.sun.jna.Library;
import com.sun.jna.Native;

public class JnaUnisteam {
	public interface UniSteamCal extends Library { // jna 라이브러리 다운 필요
		UniSteamCal INSTANCE = (UniSteamCal) Native.load(("UniSteam97"), UniSteamCal.class);

		/*
		 * jna 깃허브에서 jna 다운로드 후 libs 폴더를 만들어 옮김
		 * 우클릭 후 Build Path에서 add to Build Path를 눌러 압축해제
		 * Referenced Libraries가 생성되고 jna.jar 생성
		 * jna.jar 우클릭 후 Build Path -> Configure Build Path 클릭
		 * Source탭 Native library location 클릭
		 * Edit -> Workspace -> libs(압축파일 옮긴 폴더) -> Ok -> Ok
		 * extends Library, Native 정상적으로 import 완료
		 */

		double STEAMPTH(double a, double b, int c);
        double STEAMPTV(double a, double b, int c);
        double STEAMPTW(double a, double b, int c);
        double STEAMPTCP(double a, double b, int c);
        double STEAMPTS(double a, double b, int c);
        double STEAMPST(double a, double b, int c);
        double STEAMPQH(double a, double b, int c);
        double STEAMPQS(double a, double b, int c);
        double STEAMPT(double a, int c);
        double STEAMTP(double a, int c);
        double STEAMPTM(double a, double b, int c);
        double STEAMPTK(double a, double b, int c);
        double STEAMPHT(double a, double b, int c);
	}
}
