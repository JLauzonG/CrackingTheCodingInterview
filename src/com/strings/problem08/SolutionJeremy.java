package com.strings.problem08;

public class SolutionJeremy {
	
	public static void createZeroMatrix(int[][] matrix) {
		boolean[] flagColumn = new boolean[matrix[0].length]; 
			
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (flagColumn[j]) {
					continue; 
				}
				if (matrix[i][j] == 0) {
					setRowToZero(i, matrix);
					setColumnToZero(j, matrix);
					flagColumn[j] = true; 
					break;
				}
			}
		}
	}
	
	private static void setColumnToZero(int column, int[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			matrix[i][column] = 0; 
		}
	}
	
	private static void setRowToZero(int row, int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[row][i] = 0; 
		}
	}
}
