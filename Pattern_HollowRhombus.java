package Assignment_1;

import java.util.Scanner;

public class Pattern_HollowRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int nst = n;
		int nsp = n-1;
		while(row<=n) {		
			//Print the space
			int i = 1;
			while(i<=nsp) {
				System.out.print(" ");
				i = i+1;
			}
			//Print the star
			if(row == 1 || row == n) {
				int j = 1;
				while(j<=nst) {
					System.out.print("*");
					j = j+1;
				}
			}else {
				System.out.print("*");
				int k =1;
				while(k <= n-2) {
					System.out.print(" ");
					k++;
				}
				System.out.print("*");
			}
			//Preparation for next row
			nsp = nsp - 1;
			//Go for next row
			System.out.println("");
			row = row +1;
		}
	}
}