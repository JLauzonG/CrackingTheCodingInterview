package com.strings.problem05;

public class SolutionArnaud {
	public static boolean isOneEditAway(String x, String y) {
		if ((x == null) && (y == null))
			return true;
		if ((x != null) && (y == null))
			return false;
		if ((x == null) && (y != null))
			return false;

		int lX = x.length();
		int lY = y.length();

		// On inverse les deux chaines (dans l'algorithme, x sera toujours plus courte que y)
		if (lX > lY) {
			String tmp = x;
			x = y;
			y = tmp;

			int val = lX;
			lX = lY;
			lY = val;
		}
		if ((lY - lX) >= 2)
			return false;

		int indCarX = 0;
		int indCarY = 0;
		int nbDiff = 0;
		boolean firstTimeCompareCarX = true;

		while ((indCarX < lX) && (indCarY < lY) && (nbDiff < 2)) {
			char carX = x.charAt(indCarX);
			char carY = y.charAt(indCarY);
			if (carX == carY) {
				indCarX++;
				indCarY++;
				firstTimeCompareCarX = true;
			} else {
				if (firstTimeCompareCarX) {
					// C'est la premi�re fois que je compare ce caract�re de X, il y a donc une diff�rence
					nbDiff++;

					// J'avance pour comparer avec le prochain caract�re de Y
					indCarY++;
					firstTimeCompareCarX = false;
				} else {
					// C'est la seconde fois que je compare ce caract�re de X, il n'est pas bon
					// il faut que je passe au prochain caract�re de X, avec le caract�re courant
					indCarX++;
					firstTimeCompareCarX = true;
				}
			}
		}

		// On est arriv� � la fin d'une des cha�nes mais pas de l'autre sans avoir le nombre de diff�rences sup�rieur �
		// 2
		if (((indCarX < lX) || (indCarY < lY)) && nbDiff < 2) {
			nbDiff++;
		}

		return (nbDiff < 2);

	}
}
