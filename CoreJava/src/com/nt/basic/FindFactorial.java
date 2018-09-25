package com.nt.basic;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		int n=0,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n: ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of "+n+" is "+fact);
		
		if (sc!=null)
			sc.close();
	}

}
