//https://teaching.csse.uwa.edu.au/units/CITS1200/Laboratories/Practice-Exercises/2d-arrays-practice.html

//try recursion: https://www.geeksforgeeks.org/traverse-a-given-matrix-using-recursion/

package dev.practice.java;

public class TwoDArrays {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] b = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
		
		System.out.println(max(b));
		
	}
	
	public static int max(int[][] a) {
		
		
		for(int row = 0; row < a.length; row++) {
			for(int col = 0; col < a.length; col++) {
				
				Math.max(Math.max(a[row]), Math.max(a[col]));
					
			}
			
		}
		
		
//		Math.max(a);
		
		
		
		return 0;
		
		
		
	}

	
	
}
