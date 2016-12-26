package com.strings.problem08;

public class TestProblem08 {
	
	public static int[][] generateMatrix(int width, int height) {
		int[][] matrix = new int[width][height]; 
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				matrix[i][j] = 1;
			}
		}
		
		matrix[1][1] = 0; 
		matrix[8][10] = 0; 
		
		return matrix; 
	}
	
	public static void displayMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print("[" + matrix[i][j] + "]");
			}
			System.out.println();
		}
	}
	
	public static void testJeremy() {
		int[][] matrixJeremy = generateMatrix(20, 20);
		displayMatrix(matrixJeremy);
		System.out.println();
		SolutionJeremy.createZeroMatrix(matrixJeremy); 
		displayMatrix(matrixJeremy);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// Jeremy
		testJeremy(); 
		
		// Ivelina 
		// Insert code here. 
		
		// Arnaud 
		// Insert code here. 
	}
}
