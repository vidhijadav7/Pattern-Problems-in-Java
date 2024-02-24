package Assignment_1;

import java.util.Scanner;

public class Pattern_DoubleSidedArrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n-1;
		int nhsp = -1;
		int row_val1 = 1;
		int row_val2 = 1;
		while(row<=n) {		
			//Print the space
			int i = 1;
			while(i<=nsp) {
				System.out.print(" "+" ");
				i = i+1;
			}
			//Print the left star
			int j = 1;
			int col_val1 = row_val1;
			while(j<=nst) {
				System.out.print(col_val1+" ");
				col_val1--;
				j = j+1;
			}
			//print hollow space
			int a = 1;
			while(a<=nhsp) {
				System.out.print(" "+" ");
				a = a+1;
			}
			//print the right star
			int k = 1;
			int col_val2 = row_val2;
			if(row==1 || row==n) {
				k=2;
			}
			while(k<=nst) {
				System.out.print(col_val2+" ");
				col_val2++;
				k = k+1;
			}
			// Preparation for Next row
			if(row< (n+1)/2) {
				nst = nst + 1;
				nsp = nsp - 2;
				nhsp = nhsp + 2;
				row_val1++;
			}else {
				nst = nst - 1;
				nsp = nsp + 2;
				nhsp = nhsp - 2;
				row_val1--;
			}
			//Go for next row
			System.out.println("");
			row = row +1;
		}
	}
}