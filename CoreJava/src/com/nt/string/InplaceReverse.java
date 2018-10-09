package com.nt.string;

import java.util.Scanner;

public class InplaceReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to reverse: ");
		String str=sc.next();
		StringBuilder sb=new StringBuilder(str);
		
		int length=sb.length();
		for(int i=0;i<length/2;i++) {
		char startEnd=sb.charAt(i);
		int otherEnd=length-i-1;
		sb.setCharAt(i,sb.charAt(otherEnd));
		sb.setCharAt(otherEnd,startEnd);
		}
		str=sb.toString();
		System.out.println("Reversed string : "+str);
	}

}
