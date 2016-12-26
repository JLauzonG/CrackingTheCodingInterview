package com.strings.problem06;

public class SolutionJeremy {
	
	public static String compressString(String input) {
		StringBuilder compressedString = null; 
		
		if (input.length() > 1) {
			compressedString = new StringBuilder();
			
			int sameCharCount = 1; 
			compressedString.append(input.charAt(0)); 
			
			for (int i = 1; i < input.length(); i++) {
				if (input.charAt(i) != input.charAt(i-1)) {
					compressedString.append(sameCharCount); 
					compressedString.append(input.charAt(i)); 
					sameCharCount = 1; 
				}
				else {
					sameCharCount++; 
				}			
			}
			compressedString.append(sameCharCount); 
		}
		
		return compressedString != null && compressedString.length() < input.length() ? 
			   compressedString.toString() : input; 
	}
}
