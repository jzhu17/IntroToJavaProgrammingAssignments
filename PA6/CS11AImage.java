/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 13 November 2016
 * PA 6 - This program allows users to edit an image of their choice.
 * Bugs: none
 */

import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class CS11AImage {

	public BufferedImage im = null; //don't modify this
	public int[] packedData = null; //don't modify this
	public int[][][] pixelData = null; //use this to modify the image
	public int height = 0; //read but do not set this
	public int width = 0; //read but do not set this

	//Constructor. This allows a program to initialize an instance of
	//this class by using the 'new' keyword.
	public CS11AImage(BufferedImage image) {
		im = image;
		height = im.getHeight();
		width = im.getWidth();
		System.out.println(width);
		System.out.println(height);
		packedData = im.getRGB(0, 0, width, height, null, 0, width);
		unpackPixels();
	}

	public void flipHorizontal() {
    for (int i=0; i<height; i++) { //for loops that go through left half of the values in the array
			for (int j=0; j<width/2; j++) {
				for (int k=0; k<3; k++) {
					int a=pixelData[i][j][k]; //stores the value to a variable temporarily
          pixelData[i][j][k]=pixelData[i][width-1-j][k]; //switches the pixels counting from the left with those from the right
					pixelData[i][width-1-j][k]=a;//sets the temporart value to the pixel counting from the right
				}
			}
		}
		System.out.println("Flipped Horizontally.");
	}

	public void flipVertical() {
		for (int i=0; i<height/2; i++) { //for loops that go through top half of the values in the array
			for (int j=0; j<width; j++) {
				for (int k=0; k<3; k++) {
					int a=pixelData[i][j][k]; //stores the value to a variable temporarily
          pixelData[i][j][k]=pixelData[height-1-i][j][k]; //switches the pixels counting from the top with those from the bottom
					pixelData[height-1-i][j][k]=a; //sets the temporart value to the pixel counting from the bottom
				}
			}
		}
		System.out.println("Flipped Vertically.");
	}

	public void invert() {
		for (int i=0; i<height; i++) { //for loops that go through all the values in the array
			for (int j=0; j<width; j++) {
				for (int k=0; k<3; k++) {
          pixelData[i][j][k]=255-pixelData[i][j][k]; //changes each value in the pixels with the difference between 255 and each value
				}
			}
		}
		System.out.println("Inverted.");
	}

	public void replaceColor(int[] oldColor, int[] newColor, int range) {
		for (int i=0; i<height; i++) { //for loops that go through all the values in the array
			for (int j=0; j<width; j++) {
        if (pixelData[i][j][0]<oldColor[0]+range && pixelData[i][j][0]>oldColor[0]-range &&
				pixelData[i][j][1]<oldColor[1]+range && pixelData[i][j][1]>oldColor[1]-range &&
				pixelData[i][j][2]<oldColor[2]+range && pixelData[i][j][2]>oldColor[2]-range ) {
				//the condition that the pixel is in the range 
          for (int k=0; k<3; k++) {
						pixelData[i][j][k]=newColor[k]; //replaces the old color with the new color
					}
				}
			}
		}
		System.out.println("Replaced color");
	}


	//Writes the current data in pixelData to a .png image by first packing
	//the data into a 1D array of ints, then calling the write() method of
	//the ImageIO class.
	public boolean writeImage(File file) {
		//put pixelData into packedData
		packPixels();

		//Write new packed array back into BufferedImage
		//bi.setRGB(startX, startY, w, h, rgbArray, offset, scansize)
		im.setRGB(0, 0, width, height, packedData, 0, width);

		try{
			ImageIO.write(im, "png", file);
		} catch (IOException e) {
			System.out.println("Writing image failed.");
			return false;
		}
		return true;
	}


	//Uses bitwise operations to convert one integer into four channels,
	//each with a range from 0 to 255.
	public void unpackPixels() {
		System.out.println("Getting pixel values from packed data...");

		//This is a rows x columns array. That is, it is an array of rows.
		pixelData = new int[height][width][3];

		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col ++) {
				pixelData[row][col][0] = (packedData[(row * width) + col] >> 16) & 0xff;
				pixelData[row][col][1] = (packedData[(row * width) + col] >> 8) & 0xff;
				pixelData[row][col][2] = (packedData[(row * width) + col]) & 0xff;
			}
		}
	}

	//Uses bitwise operations to convert four integer (ranging from 0 to 255)
	//into a single integer for use with the BufferedImage class.
	public void packPixels() {
		System.out.println("putting pixel values in packed format...");

		for (int row = 0; row < height; row ++) {
			for (int col = 0; col < width; col ++) {
				packedData[(row * width) + col] = ((255 & 0xFF) << 24) | //alpha
	            ((pixelData[row][col][0] & 0xFF) << 16) | //red
	            ((pixelData[row][col][1] & 0xFF) << 8)  | //green
	            ((pixelData[row][col][2] & 0xFF) << 0); //blue
			}
		}
	}
}
