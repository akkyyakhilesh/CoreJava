package com.nt.pattern;

import java.util.Scanner;

public class Pattern10{

	public static void main(String[] args) {
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
			System.out.print(k);
			}
			System.out.println();
		}
		
		if(sc!=null)
			sc.close();
	}

}
