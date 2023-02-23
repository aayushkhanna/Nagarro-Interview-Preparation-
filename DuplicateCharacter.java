package com.nagarro.interview.practice;

public class DuplicateCharacter {

	public static void main(String[] args) {
		String string = "AABBBCDEEFFFEF";
		  int count = 0;
		  char[] input = string.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < string.length(); i++) {
		   for (int j = i + 1; j < string.length(); j++) {
		    if (input[i] == input[j]) {
		     System.out.print(input[j]);
//		     count++;
		    break;
		    }
		   }
		  }
	}

}
