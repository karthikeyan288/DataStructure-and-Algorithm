package com.algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string :");
		String string1 = sc.next();
		System.out.println("Enter the second string :");
		String string2 = sc.next();
		
		string1=string1.replaceAll("\\s", "").toLowerCase();
		string2=string2.replaceAll("\\s", "").toLowerCase();
		
		if (checkAnagram(string1,string2)) {
			System.out.println("The string1 "+string1+" and string2 "+string2+" are Anagram ");
		} else {
			System.out.println("The string "+string1+" and string2 "+string2+" are  not Anagram ");
		}
		
	}
	public static boolean checkAnagram(String string1,String string2) {
		if (string1.length() != string2.length()) {
			return false;
		} else {
			char[]string1array= string1.toCharArray();
			char[]string2array= string2.toCharArray();
			
			Arrays.sort(string1array);
			Arrays.sort(string2array);
			
			return Arrays.equals(string1array, string2array);

		}	
	}
}
