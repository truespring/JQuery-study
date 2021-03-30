package com.doosan.test;

public class JniUnisteam {
	
	/*
	 * Java Native Interface
	 * System.load("jni���� ���"); �� ���� import(������)
	 * System.loadLibrary("src/libs/jni����"); �� ���� import(�����)
	 */
	
	static {
		System.load("C:\\Windows\\System32\\UniSteam97.dll"); // jna �����̶� ȣ���ص� ��� ����
		//System.loadLibrary("UniSteam97_JNI");
		//System.load("D:\\UniSteam97_JNI.dll"); // ���� dll ����
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
	public native double IF97STEAMPTK(double a, double b, int c); // ȣ�� ����
	public native double IF97STEAMPHT(double a, double b, int c);
}
