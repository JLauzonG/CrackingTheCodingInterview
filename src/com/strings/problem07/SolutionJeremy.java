package com.strings.problem07;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SolutionJeremy {

	private String imagePath; 
	private int length; 
	private int[][] imageMatrix; 
	
	public SolutionJeremy(String imagePath) {
		this.imagePath = imagePath; 
		readImage();
	}
	
	public void rotate90Degrees() {
		for (int i = 0; i < length / 2; i++) {
			for (int j = i; j < length-i-1; j++) {
				int pixel = substitutePixel(j, length-i-1, imageMatrix[i][j]);
				pixel = substitutePixel(length-i-1, length-j-1, pixel); 
				pixel = substitutePixel(length-j-1, i, pixel); 
				pixel = substitutePixel(i, j, pixel); 
			}
		}
		
		writeImage();
	}
	
	
	private int substitutePixel(int x, int y, int newPixel) {
		int tmp = imageMatrix[x][y];
		imageMatrix[x][y] = newPixel; 
		
		return tmp; 
	}
	
	private void writeImage() {
		BufferedImage stream = new BufferedImage(length, length, BufferedImage.TYPE_INT_RGB); 	
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				stream.setRGB(i, j, imageMatrix[i][j]);
			}
		}
		
		try {
			ImageIO.write(stream, "png", new File(imagePath));
			stream.flush();
		}
		catch (IOException e) {
			System.out.println("Error writing image!");
		} 
	}
	
	private void readImage() {
		BufferedImage stream = null; 
		try {
			stream = ImageIO.read(new File(imagePath)); 
			length = stream.getWidth();
			imageMatrix = new int[length][length];
			for (int i = 0; i < length; i++) {
				for (int j = 0; j < length; j++) {
					imageMatrix[i][j] = stream.getRGB(i, j); 
				}
			}
			
			stream.flush(); 
		}
		catch (IOException ex) {
			System.out.println("Error reading image!");
		}
	}
}
