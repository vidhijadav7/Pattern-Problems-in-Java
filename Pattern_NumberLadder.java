package Assignment_1;

import java.util.Scanner;

public class Pattern_NumberLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int nst = 1; // No of stars in row
		int row_val = 1;
		while (row <= n) {
			// work
			// print the value
			int i = 1;
			while (i <= nst) {
				System.out.print(row_val + "\t");
				row_val++;
				i = i + 1;
			}
			// Preparation for Next row
			nst = nst + 1;
			System.out.println();
			row = row + 1;
		}
	}
}
