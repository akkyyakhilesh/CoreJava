package com.nt.basic;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int n=0,count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of n:");
		n=sc.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0)
			System.out.println(n+" is a prime no.");
		else
			System.out.println(n+" is not a prime no.");
	
		if (sc!=null)
			sc.close();
	}
}
