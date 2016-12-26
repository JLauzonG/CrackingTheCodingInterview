package com.strings.problem02;

public class SolutionJeremy {
	
	public static boolean checkPermutation(String s01, String s02) {
		if ((s01.length() == 0) || (s01.length() != s02.length())) {
			return false; 
		}
		
		int[] characterCountArray = new int[256]; 
			
		for (int i = 0; i < s01.length(); i++) {
			characterCountArray[s01.charAt(i)]++;
			characterCountArray[s02.charAt(i)]++;
		}
	
		return checkEvenCharacterCount(characterCountArray);
	}
	
	private static boolean checkEvenCharacterCount(int[] array) {
		for (int i : array) {
			if (i % 2 != 0) {
				return false; 
			}
		}
		
		return true; 
	}
}
