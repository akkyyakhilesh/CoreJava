package com.nt.sorting;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {20,34,23,67,12,89,55};
		int no=0,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. you want to search: ");
		no=sc.nextInt();
		for(int i=0;i<a.length-1;i++) {
		if(no==a[i]) {
			System.out.println("The element "+no+" is present at "+i+"th indexin the list");
			}
		}
		if(sc!=null)
			sc.close();

	}
	
}
