package Assignment_1;

import java.util.Scanner;

public class Pattern_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int a = 0;
		int b = 1;
		while (row <= n) {
			// work
			// print the value
			int i = 1;
			while (i <= row) {
				System.out.print(a + "\t");
				int c = a + b;
				a = b;
				b = c;
				i = i + 1;
			}
			// Preparation for Next row
			row = row + 1;
			System.out.println();
		}
	}
}