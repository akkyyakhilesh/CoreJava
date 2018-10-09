package com.nt.string;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str="	My name is Akhilesh Kumar	";
		System.out.println("String containing white space: "+str);
		System.out.println("length of string with white space: "+str.length());
		String str2=str.trim();
		System.out.println("String atfer removal of start and ending blank spaces: "+str2);
		System.out.println("Length of the string after removing start and ending spaces: "+str2.length());
		String str3= str.replaceAll("\\s","");
		System.out.println("String after removing all spaces: "+str3);
		System.out.println("Length of the string after removing all spaces: "+str3.length());
		
	}

}
