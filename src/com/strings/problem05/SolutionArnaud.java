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
					// C'est la première fois que je compare ce caractère de X, il y a donc une différence
					nbDiff++;

					// J'avance pour comparer avec le prochain caractère de Y
					indCarY++;
					firstTimeCompareCarX = false;
				} else {
					// C'est la seconde fois que je compare ce caractère de X, il n'est pas bon
					// il faut que je passe au prochain caractère de X, avec le caractère courant
					indCarX++;
					firstTimeCompareCarX = true;
				}
			}
		}

		// On est arrivé à la fin d'une des chaînes mais pas de l'autre sans avoir le nombre de différences supérieur à
		// 2
		if (((indCarX < lX) || (indCarY < lY)) && nbDiff < 2) {
			nbDiff++;
		}

		return (nbDiff < 2);

	}
}
