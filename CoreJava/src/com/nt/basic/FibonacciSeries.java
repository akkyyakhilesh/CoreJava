package com.nt.basic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=0;
		System.out.println("Enter the range to print fibonacci series..");
		no=sc.nextInt();
		if(no>=1) {
		System.out.println("Fibinacci series upto "+no+"numbers are: ");
		for(int i=1;i<=no;i++) {
			System.out.print(fibonacci(i)+", ");
			}
		}
		else
			System.out.println("Enter valid range (greater than zero!!)");
		if(sc!=null)
			sc.close();
	}
	public static int fibonacci(int no) {
		if(no==1 || no==2)
		return 1;
		else
			return fibonacci(no-1)+fibonacci(no-2);
		
	}

}
