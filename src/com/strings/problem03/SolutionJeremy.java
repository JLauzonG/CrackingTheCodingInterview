package com.strings.problem03;

public class SolutionJeremy {	
	
	public static String URLify(String input, char needle, String substitution) {
		
		char[] output = new char[getOutputSize(input, needle, substitution)]; 
		
		for (int i = 0, outputPosition = 0; i < input.length(); i++) {
			if (input.charAt(i) == needle) {
				for (int j = 0; j < substitution.length(); j++) {
					output[outputPosition + j] = substitution.charAt(j); 
				}
				outputPosition += substitution.length(); 
			}
			else {
				output[outputPosition] = input.charAt(i); 
				outputPosition++;
				
			}
		} 
		
		return new String(output); 
	}
	
	private static int getOutputSize(String input, char needle, String substitution) {
		int count = 0; 
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == needle) {
				count += substitution.length(); 
			}
			else {
				count++; 
			}
		}
		
		return count; 
	}
}
