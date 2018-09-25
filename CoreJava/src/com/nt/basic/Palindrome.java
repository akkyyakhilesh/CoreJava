package com.nt.basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s1=null;
		System.out.println("Enter any String: ");
		s1=sc.nextLine();
		StringBuffer sb= new StringBuffer(s1);
		StringBuffer sb2=sb.reverse();
		if(s1.equals(sb2.toString()))
			System.out.println("Given String is a Palindrome!!");
		else
			System.out.println("Given String is not a Palindrome!!");
		
		if(sc!=null)
			sc.close();

	}

}
