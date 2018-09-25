package com.nt.sorting;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {20,34,23,67,12,67,55};
		int no=0,count=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. you want to search: ");
		no=sc.nextInt();
		
		for(i=0;i<a.length-1;i++) {
			if(no==a[i])
				count++;
		}
			if(count>0) {
			System.out.println("The element "+no+" is present at "+count+" time in the list");
			}
		else
			System.out.println("The entered element"+no+" is not present in the list..");
		
		if(sc!=null)
			sc.close();

	}
	
}
