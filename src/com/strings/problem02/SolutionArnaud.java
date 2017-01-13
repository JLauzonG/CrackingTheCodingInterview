package com.strings.problem02;

public class SolutionArnaud {
	public static boolean areAnagrams(String str1, String str2) {
		boolean areAnagrams = true;

		if ((str1 == null) && (str2 == null)) {
			return true;
		}
		if ((str1 == null && str2 != null) || (str1 != null && str2 == null)) {
			return false;
		}

		if (str1.length() != str2.length()) {
			return false;
		}

		int[] nbOccurrences = new int[256];
		for (int i = 0; i < 256; i++) {
			nbOccurrences[i] = 0;
		}

		for (int i = 0; i < str1.length(); i++) {
			nbOccurrences[((int) str1.charAt(i))]++;
		}
		for (int i = 0; i < str2.length(); i++) {
			int pos = ((int) str2.charAt(i));
			if (nbOccurrences[pos] == 0) {
				areAnagrams = false;
				break;
			}
			nbOccurrences[pos]--;
		}

		return areAnagrams;
	}
}
