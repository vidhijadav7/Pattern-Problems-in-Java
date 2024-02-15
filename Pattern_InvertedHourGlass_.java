package Assignment_1;

import java.util.Scanner;

public class Pattern_InvertedHourGlass_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = 2*n-1;
		int rowval1 = n;
		int rowval2 = n;
		
		while(row<=2*n+1) {		
			//Print the left star
			int i = 1;
			int colval1 = rowval1;
			while(i<=nst) {
				System.out.print(colval1+" ");
				colval1--;
				i = i+1;
			}
			//Print the space
			int j = 1;
			while(j<=nsp) {
				System.out.print(" "+" ");
				j = j+1;
			}
			//Print the right star
			int colval2 = rowval2;
			int k = 1;
			if(row==n+1) {
				k=2;
				colval2 = 1;
			}
			while(k<=nst) {
				System.out.print(colval2+" ");
				colval2++;
				k = k+1;
			}
			//Preparation for next row
			if(row<n+1) {
				nst = nst + 1;
				nsp = nsp - 2;
				rowval2--;
			}else {
				nst = nst - 1;
				nsp = nsp + 2;
				rowval2++;
			}			
			//Go for next row
			System.out.println("");
			row = row +1;
		}
	}
}
