package Assignment_1;

import java.util.Scanner;

public class Pattern_Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = 2*n-3;
		int row_val = 1;
		while(row<=n) {		
			//Print the left star
			int i = 1;
			int col_val = row_val;
			while(i<=nst) {
				System.out.print(col_val+"\t");
				col_val++;
				i = i+1;
			}
			//Print the space
			int j = 1;
			while(j<=nsp) {
				System.out.print(" "+"\t");
				j = j+1;
			}
			//Print the right star
			int k = 1;
			if(row==n) {
				k=2;
				col_val--;
			}
			col_val--;
			while(k<=nst) {
				System.out.print(col_val+"\t");
				col_val--;
				k = k+1;
			}
			//Preparation for next row
			nst = nst + 1;
			nsp = nsp - 2;
			//Go for next row
			System.out.println("");
			row = row +1;
		}
	}
}