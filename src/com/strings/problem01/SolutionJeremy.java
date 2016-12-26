package com.strings.problem01;

public class SolutionJeremy {
	
	public static boolean isUnique(String input) {
		if (input.length() > 256) {
			return false; 
		}
		
		boolean[] associationArray = new boolean[256]; 
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i); 
			
			if (associationArray[c]) {
				return false; 
			}
			associationArray[c] = true;  
		}
		
		return true; 
	}
}
