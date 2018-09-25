package com.nt.basic;

import java.util.Scanner;

public class CountPrime {

	public static void main(String[] args) {
		int n=0,pno=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int count=0;
			for(int j=1;j<=n;j++) {
				if(i%j==0)
					count++;
			}
			if(count==2)
				pno++;
		}
		System.out.println("Total prime upto "+n+" = "+pno);
		
		if (sc!=null)
			sc.close();
	}

}
