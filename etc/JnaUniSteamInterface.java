package com.doosan.test;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface JnaUniSteamInterface extends Library {
	JnaUniSteamInterface INSTANCE = (JnaUniSteamInterface) Native.load(("UniSteam97"), JnaUniSteamInterface.class);

	double STEAMPTH(double a, double b, int c); // 엔탈피
    double STEAMPTV(double a, double b, int c); // specific volume
    double STEAMPTW(double a, double b, int c); // speed of sound
    double STEAMPTCP(double a, double b, int c); // isobaric heat capacity
    double STEAMPTS(double a, double b, int c); // 엔트로피
    double STEAMPST(double a, double b, int c);
    double STEAMPQH(double a, double b, int c);
    double STEAMPQS(double a, double b, int c);
    double STEAMPT(double a, int c);
    double STEAMTP(double a, int c);
    double STEAMPTM(double a, double b, int c); // dynamic viscosity
    double STEAMPTK(double a, double b, int c); // thermal conductivity
    double STEAMPHT(double a, double b, int c);
}
