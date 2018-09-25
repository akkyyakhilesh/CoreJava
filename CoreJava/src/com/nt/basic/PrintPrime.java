package com.nt.basic;

import java.util.Scanner;

public class PrintPrime {

	public static void main(String[] args) {
		int n=0,i=1,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		n=sc.nextInt();
		for(i=1;i<=n;i++) 
		{
			int count=0;
			for(j=1;j<=n;j++) 
			{
				if(i%j==0) {
					count++;
					}
				}
				if(count==2) {
					System.out.println(i);
				}
		}
		
		if (sc!=null)
			sc.close();
	}

}
