package com.doosan.test;

public class JniUnisteam {
	
	/*
	 * Java Native Interface
	 * System.load("jni파일 경로"); 를 통해 import(절대경로)
	 * System.loadLibrary("src/libs/jni파일"); 를 통해 import(상대경로)
	 */
	
	static {
		System.load("C:\\Windows\\System32\\UniSteam97.dll"); // jna 파일이라 호출해도 사용 못함
		//System.loadLibrary("UniSteam97_JNI");
		//System.load("D:\\UniSteam97_JNI.dll"); // 실제 dll 파일
	}

	public native double IF97STEAMPTH(double a, double b, int c);
	public native double IF97STEAMPTV(double a, double b, int c);
	public native double IF97STEAMPTW(double a, double b, int c);
	public native double IF97STEAMPTCp(double a, double b, int c);
	public native double IF97STEAMPTS(double a, double b, int c);
	public native double IF97STEAMPST(double a, double b, int c);
	public native double IF97STEAMPQH(double a, double b, int c);
	public native double IF97STEAMPQS(double a, double b, int c);
	public native double IF97STEAMPT(double a, int b);
	public native double IF97STEAMTP(double a, int b);
	public native double IF97STEAMPTM(double a, double b, int c);
	public native double IF97STEAMPTK(double a, double b, int c); // 호출 에러
	public native double IF97STEAMPHT(double a, double b, int c);
}
