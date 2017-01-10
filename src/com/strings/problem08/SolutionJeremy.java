package com.strings.problem08;

public class SolutionJeremy {
	
	public static void createZeroMatrix(int[][] matrix) {
		boolean[] flagRowArray = new boolean[matrix.length]; 
		boolean[] flagColumnArray = new boolean[matrix[0].length]; 
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					flagRowArray[i] = true; 
					flagColumnArray[j] = true;
				}
			}
		}
		
		nullifyRows(matrix, flagRowArray);
		nullifyColumns(matrix, flagColumnArray);
	}
	
	private static void nullifyRows(int[][] matrix, boolean[] flagRowArray) {
		for (int i = 0; i < matrix.length; i++) {
			if (flagRowArray[i]) {
				setRowToZero(i, matrix);
			}
		}		
	}
	
	private static void nullifyColumns(int[][] matrix, boolean[] flagColumnArray) {
		for (int i = 0; i < matrix[0].length; i++) {
			if (flagColumnArray[i]) {
				setColumnToZero(i, matrix);
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
