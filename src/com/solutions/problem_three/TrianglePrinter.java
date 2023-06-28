package com.solutions.problem_three;

public class TrianglePrinter {

	public static void printTrianglePattern(int oddLines) {
		
		if (oddLines % 2 == 0) {
			System.out.println("Please enter an odd number of rows for symmetry purposes!!!");
		} else {
			int top = (oddLines / 2) + 1;
			printTopHalf(top);
			printBottomHalf(top + 1, oddLines);
		}
	}
	
	private static void printTopHalf(int top) {
		
		for (int i = 1; i <= top; i++) {
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	private static void printBottomHalf(int a, int b) {
		
		int numRows = b - a + 1;
		while (numRows > 0) {
			
			int numStars = 2 * (numRows - 1) + 1;
			
			while (numStars > 0) {
				System.out.print("*");
				numStars--;
			}
			
			System.out.println("");
			numRows--;
		}
	}
}
