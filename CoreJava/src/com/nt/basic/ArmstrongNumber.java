package com.nt.basic;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int number=0,n=0,sum=0,num=0,i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n: ");
		number=sc.nextInt();
		num=number;
		while(i<num) {
			n=num%10;
			num=num/10;
			sum=sum+(n*n*n);
		}
		if(sum==number)
			System.out.println(number+" is an Armstrong number");
		else
			System.out.println(number+" is not an Armstrong number");
	if (sc!=null)
		sc.close();
	}

}
