package com.doosan.test.prac;

import java.util.ArrayList;
import java.util.List;

public class Contains {
	public static void main(String[] args) {
		
		Long a = 4L;
		try {
			boolean chkA = isAdministrator(a);
			System.out.println(chkA);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static boolean isAdministrator(Long userRole) throws Exception {
		List<Long> adminRoles = new ArrayList<>();
		adminRoles.add(1L);
		adminRoles.add(2L);
		adminRoles.add(3L);
		adminRoles.add(4L);
		adminRoles.add(5L);
		adminRoles.add(6L);
		
		boolean isAdmin = false;
//		for (Long adminRole : adminRoles) {
//			if (userRole == adminRole) {
//				isAdmin = true;
//				break;
//			}
//		}
		
		if(adminRoles.contains(userRole)) isAdmin = true; // 위의 주석과 같은 기능
		
		return isAdmin;
	}
}
