package Assignment_1;

import java.util.Scanner;

public class Pattern_PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int row = 0;
		int nst = 1; //No of star in row
		while(row< n) {
			// work
			// print the star		
			int i = 0;
			int ncr = 1;
			while(i<nst) {
				System.out.print(ncr+"\t");
				// Preparation for Next ncr
				ncr = ((row-i)*(ncr))/(i+1);
				i = i+1;
			}		
			// Preparation for Next row
			nst = nst + 1;			
			System.out.println();
			row = row+1;
		}
	}
}
