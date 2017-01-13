package com.strings.problem06;

public class SolutionArnaud {
	public static String compressString(String str) {
		if (str == null) {
			return null;
		}
		
		StringBuffer strBuf = new StringBuffer();
		
		int originalLength = str.length();
		char current = 0;
		int cpt = 0;
		for (int i = 0; i < originalLength; i++ ) {
			char newChar = str.charAt(i);
			if (newChar != current) {
				if (cpt > 0) {
					strBuf.append(current);
					strBuf.append(cpt);
				}
				current = newChar;
				cpt = 1;
			}
			else {
				cpt++;
			}
		}
		strBuf.append(current);
		strBuf.append(cpt);

		return strBuf.length() < originalLength ? strBuf.toString() : str;
	}
}
