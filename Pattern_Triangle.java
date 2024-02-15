package Lec_8;

import java.util.Scanner;

public class Pattern_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int row_val = 1;
		while (row <= n) {
			// Print the space
			int i = 1;
			while (i <= nsp) {
				System.out.print(" " + "\t");
				i = i + 1;
			}
			// Print the value
			int j = 1;
			int col_val = row_val;
			while (j <= nst) {
				System.out.print(col_val + "\t");
				// Vertical Mirror Concept
				if (j < (nst + 1) / 2) {
					col_val = col_val + 1;
				} else {
					col_val = col_val - 1;
				}
				j = j + 1;
			}
			// Preparation for next row
			nsp = nsp - 1;
			nst = nst + 2;
			row_val = row_val + 1;
			// Go for next row
			System.out.println("");
			row = row + 1;
		}
	}
}
