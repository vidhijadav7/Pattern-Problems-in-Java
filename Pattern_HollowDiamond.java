package Lec_8;

import java.util.Scanner;

public class Pattern_HollowDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int nst= (n+1)/2;
		int nsp= -1;
		while(row<=n) {
			//print the left star
			int i = 1;
			while(i<=nst) {
				System.out.print("*"+"\t");
				i = i+1;
			}
			//print the space
			int j = 1;
			while(j<=nsp) {
				System.out.print(" "+"\t");
				j = j+1;
			}
			//print the right star
			int k = 1;
			if(row==1 || row==n) {
				k=2;
			}
			while(k<=nst) {
				System.out.print("*"+"\t");
				k = k+1;
			}
			//preparation for next row
			if(row<(n+1)/2) {
				nst = nst-1;
				nsp = nsp+2;
			}else {
				nst = nst+1;
				nsp = nsp-2;
			}
			System.out.println();
			row = row+1;
		}
	}

}
