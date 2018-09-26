package com.nt.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String::");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(Character c : ch) {
			if(charMap.containsKey(c)) 
				charMap.put(c, charMap.get(c)+1);
			else
				charMap.put(c,1);
		}

	}

}
