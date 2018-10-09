package com.nt.string;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
	void removeDuplicates(String str) {
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		for(int i=0;i<str.length();i++) 
			lhs.add(str.charAt(i));
			for(Character ch:lhs) {
				System.out.print(ch);
			}
		
	}
	public static void main(String[] args) {
		String str=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to remove duplicates: ");
		str=sc.next();
	RemoveDuplicates rd = new RemoveDuplicates();
	rd.removeDuplicates(str);
	if(sc!=null)
		sc.close();

	}

}
