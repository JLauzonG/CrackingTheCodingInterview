package com.strings.problem08;

public class SolutionArnaud {
	public static class Matrix {
		private int m;

		private int n;

		private int[][] tab;

		public Matrix(int m, int n) {
			this.m = m;
			this.n = n;
			this.tab = new int[m][n];
		}

		public Matrix(int m, int n, int[][] matrix) {
			this.m = m;
			this.n = n;
			this.tab = new int[m][n];

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					tab[i][j] = matrix[i][j];
				}
			}
		}

		public int[][] getTab() {
			return tab;
		}

		public void reset0() {
			int[] coefI = new int[m];
			int[] coefJ = new int[n];

			for (int i = 0; i < m; i++) {
				coefI[i] = 1;
			}
			for (int j = 0; j < n; j++) {
				coefJ[j] = 1;
			}

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					if (tab[i][j] == 0) {
						coefI[i] = 0;
						coefJ[j] = 0;
					}
				}
			}

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					tab[i][j] = tab[i][j] * coefI[i] * coefJ[j];
				}
			}
		}
	}

	public static void createZeroMatrix(int width, int height, int[][] matrix) {
		Matrix mat = new Matrix(width, height, matrix);
		mat.reset0();
		int[][] tab = mat.getTab();

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				matrix[i][j] = tab[i][j];
			}
		}
	}
}
