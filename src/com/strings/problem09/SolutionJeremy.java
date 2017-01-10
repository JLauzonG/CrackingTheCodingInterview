package com.strings.problem09;

public class SolutionJeremy {
	public static boolean isStringRotation(String s01, String s02) {
		if (s01.length() != s02.length()) {
			return false; 
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(s01); 
		sb.append(s01); 
		
		return sb.toString().contains(s02); 
	}
}
