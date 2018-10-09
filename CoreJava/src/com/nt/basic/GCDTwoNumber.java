package com.nt.basic;

import java.util.Scanner;

public class GCDTwoNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number to find GCD: ");
		int first=sc.nextInt();
		int second=sc.nextInt();
		System.out.println("GCD of "+first+" and "+second+" is: "+findGCD(first,second));
		if(sc!=null)
			sc.close();
	}
	static int findGCD(int a,int b) {
		if(b==0)
			return a;
		else 
		return findGCD(b,a%b);
	}
	

}
