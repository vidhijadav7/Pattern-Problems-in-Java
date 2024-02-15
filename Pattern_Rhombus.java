package Assignment_1;

import java.util.Scanner;

public class Pattern_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int row_val = 1;
		if (n > 0 && n < 10) {
			while (row <= 2*n-1) {
				// Print the space
				int i = 1;
				while (i <= nsp) {
					System.out.print(" " + "\t");
					i++;
				}
				// Print the star
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
					j++;
				}
				// Preparation for the next row
				if (row < n) {
					nst = nst + 2;
					nsp = nsp - 1;
					row_val++;
				} else {
					nst = nst - 2;
					nsp = nsp + 1;
					row_val--;
				}
				System.out.println();
				row = row + 1;
			}
		} else {
			System.out.println("No Result");
		}
	}
}
