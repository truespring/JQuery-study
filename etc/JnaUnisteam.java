package com.doosan.test;

import com.sun.jna.Library;
import com.sun.jna.Native;

public class JnaUnisteam {
	public interface UniSteamCal extends Library { // jna ���̺귯�� �ٿ� �ʿ�
		UniSteamCal INSTANCE = (UniSteamCal) Native.load(("UniSteam97"), UniSteamCal.class);

		/*
		 * Java Native Access
		 * jna ����꿡�� jna �ٿ�ε� �� libs ������ ����� �ű�
		 * ��Ŭ�� �� Build Path���� add to Build Path�� ���� ��������
		 * Referenced Libraries�� �����ǰ� jna.jar ����
		 * jna.jar ��Ŭ�� �� Build Path -> Configure Build Path Ŭ��
		 * Source�� Native library location Ŭ��
		 * Edit -> Workspace -> libs(�������� �ű� ����) -> Ok -> Ok
		 * extends Library, Native ���������� import �Ϸ�
		 * 
		 * JNI, JNA ���� ���� ��α�
		 * https://yaraba.tistory.com/665
		 */

		double STEAMPTH(double a, double b, int c); // ��Ż��
        double STEAMPTV(double a, double b, int c); // specific volume
        double STEAMPTW(double a, double b, int c); // speed of sound
        double STEAMPTCP(double a, double b, int c); // isobaric heat capacity
        double STEAMPTS(double a, double b, int c); // ��Ʈ����
        double STEAMPST(double a, double b, int c);
        double STEAMPQH(double a, double b, int c);
        double STEAMPQS(double a, double b, int c);
        double STEAMPT(double a, int c); // �з¸����� �µ����ϴ� ��
        double STEAMTP(double a, int c);
        double STEAMPTM(double a, double b, int c); // dynamic viscosity
        double STEAMPTK(double a, double b, int c); // thermal conductivity
        double STEAMPHT(double a, double b, int c);
	}
}
