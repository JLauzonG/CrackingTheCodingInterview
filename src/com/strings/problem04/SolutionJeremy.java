package com.strings.problem04;

public class SolutionJeremy {
	
	public static boolean isPalindromePermutation(String input) {
		int[] characterCountArray = countCharOccurence(input);
		
		boolean oddOccurenceFound = false; 
		for (int i = 0; i < characterCountArray.length; i++) {
			if (characterCountArray[i] % 2 != 0) {
				if (oddOccurenceFound) {
					return false; 
				}
				
				oddOccurenceFound = true;
			}
		}
			
		return true; 
	}
	
	private static int[] countCharOccurence(String input) {
		int[] characterCountArray = new int[256]; 

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ') {
				characterCountArray[Character.toLowerCase(input.charAt(i))]++; 
			}
		}
		
		return characterCountArray; 
	}
}
