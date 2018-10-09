package com.nt.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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
		Set<Map.Entry<Character,Integer>> entrySet =  charMap.entrySet();
		System.out.println("List of duplicate entries in "+s+ " is: ");
		for(Map.Entry<Character,Integer> entry : entrySet) {
			if(entry.getValue()>1)
				System.out.println(entry.getKey()+" = "+entry.getValue());
		}
	if(sc!=null)
		sc.close();
	}

}
