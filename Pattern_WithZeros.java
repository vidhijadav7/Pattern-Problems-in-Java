package Assignment_1;

import java.util.Scanner;

public class Pattern_WithZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int row = 1;
		int nst = 1; // No of star in row
		int row_val = 1;
		while (row <= n) {
			// print the star
			int i = 1;
			int col_val = row_val;
			while (i <= nst) {
				if (i == 1 || i == nst) {
					System.out.print(col_val + "\t");
				} else {
					System.out.print(0 + "\t");
				}
				i = i + 1;
			}
			// Preparation for Next row
			row_val++;
			nst = nst + 1;
			System.out.println();
			row = row + 1;
		}
	}
}
