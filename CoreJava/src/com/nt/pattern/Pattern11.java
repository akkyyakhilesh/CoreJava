package com.nt.pattern;

import java.util.Scanner;

public class Pattern11{

	public static void main(String[] args) {
		int n=0,count=0,temp=0,temp2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				count++;
				if(j==1)
					temp2=count;
			}
			temp=count;
			for(int k=temp;k>=temp2;k--) {
				if(k<=n)
					System.out.print(k+" ");
			}
			System.out.println();
		}
		
		if(sc!=null)
			sc.close();
	}

}
