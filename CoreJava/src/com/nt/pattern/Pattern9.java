package com.nt.pattern;

import java.util.Scanner;

public class Pattern9{

	public static void main(String[] args) {
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++) {
			System.out.print(k);
			}
			System.out.println();
		}
		
		if(sc!=null)
			sc.close();
	}

}
