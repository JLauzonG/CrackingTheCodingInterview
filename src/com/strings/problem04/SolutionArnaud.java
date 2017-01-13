package com.strings.problem04;

public class SolutionArnaud {
	public static boolean isPalindromAnagram(String str1) {
		boolean isPalindrom = true;

		final int posUpperA = (int) 'A';
		final int posLowerA = (int) 'a';
		final int posUpperZ = (int) 'Z';
		final int posLowerZ = (int) 'z';

		if (str1 == null) {
			return false;
		}

		int[] nbOccurrences = new int[256];
		for (int i = 0; i < 256; i++) {
			nbOccurrences[i] = 0;
		}

		for (int i = 0; i < str1.length(); i++) {
			int pos = ((int) str1.charAt(i));

			if (pos >= posUpperA && pos <= posUpperZ) {
				pos = pos - posUpperA + posLowerA;
			}

			if (pos >= posLowerA && pos <= posLowerZ) {
				nbOccurrences[pos]++;
			}
		}

		int nbOfLettersWithOddOccurences = 0;
		for (int i = 0; i < 256; i++) {
			if (nbOccurrences[i] % 2 == 1) {
				nbOfLettersWithOddOccurences++;
			}
			if (nbOfLettersWithOddOccurences > 1) {
				isPalindrom = false;
				break;
			}
		}

		return isPalindrom;
	}
}
