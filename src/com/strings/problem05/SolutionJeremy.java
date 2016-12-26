package com.strings.problem05;

public class SolutionJeremy {

	public static boolean isOneEditAway(String s01, String s02) {
		String longest = getLongest(s01, s02); 
		String shortest = getShortest(s01, s02); 

		int lengthDiff = longest.length() - shortest.length(); 
		
		if (lengthDiff > 1) {
			return false;
		}
		
		boolean oneEditAway = false; 
		for (int i = 0; i < shortest.length(); i++) {
			if (longest.charAt(i) != shortest.charAt(i)) {
				if (lengthDiff == 0 && oneEditAway) {
					return false; 
				}
				else if ((lengthDiff != 0) && oneEditAway && (longest.charAt(i+1) != shortest.charAt(i))) {
					return false; 
				}

				oneEditAway = true; 
			}
		}
		
		return true; 
	}
	
	private static String getLongest(String s01, String s02) {
		return s01.length() >= s02.length() ? s01 : s02; 
	}
	
	private static String getShortest(String s01, String s02) {
		return s01.length() >= s02.length() ? s02 : s01; 
	}
}
