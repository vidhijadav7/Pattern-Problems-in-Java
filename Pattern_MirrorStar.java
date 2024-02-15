package Assignment_1;

import java.util.Scanner;

public class Pattern_MirrorStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = (n-1)/2;

		while (row < (2*n)-1) {
			// Print the space
			int i = 1;
			while (i <= nsp) {
				System.out.print(" "+"\t");
				i++;
			}
			// Print the star
			int j = 1;
			while (j <= nst) {
				System.out.print("*"+"\t");
				j++;
			}
			
			// Preparation for the next row
			if (row < (n+1)/2) {
				nst=nst+2;
				nsp=nsp-1;
			} else {
				nst=nst-2;
				nsp=nsp+1;
			}
			System.out.println();
			row = row + 1;
		}
	}
}
