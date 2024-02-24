package Assignment_1;

import java.util.Scanner;

public class Pattern_HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int nst = 2*n+1; 
		int nsp = 0;
		int row_val = n;
		while(row<=(2*n)+1) {		
			//Print the space
			int i = 1;
			while(i<=nsp) {
				System.out.print(" "+" ");
				i = i+1;
			}
			//Print the star
			int j = 1;
			int col_val = row_val;
			while(j<=nst) {
				System.out.print(col_val+" ");
				if(j < (nst+1)/2) { 
					col_val--;
				}else {
					col_val++;
				}
				j = j+1;
			}
			//Preparation for next row
			if(row < n+1) {
				row_val--;
				nsp = nsp + 1;
				nst = nst - 2;
			}else {
				row_val++;
				nsp = nsp - 1;
				nst = nst + 2;
			}
			//Go for next row
			System.out.println("");
			row = row +1;
		}
	}
}
