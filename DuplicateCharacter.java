package com.nagarro.interview.practice;

public class DuplicateCharacter {
	static String string ;
	static int count,i,j;
	static void countDuplicate(String string , int count){
//		char[] input = string.toCharArray();
		for(i = 0; i<string.length();i++){
		for(j=i+1;j<string.length();j++){
//		  if(input[i] == input[j]){
//		     System.out.println(input[i]);
			if(string.charAt(i) == string.charAt(j)) {
				System.out.print(string.charAt(i));
		   count ++;
		break;
		}
		}
		}
	}
		public static void main(String[]  args){
		string = "ABCDABCDABCD";
		count = 0;
		countDuplicate(string,count);
		}
}
//static String string;
//static int count;
//	static void countCharacter(String string, int count){
//		char[] input = string.toCharArray();
//		System.out.println("Duplicate characters are:");
//		for(int i =0;i<string.length();i++) {
//			for(int j=i+1; j<string.length();j++) {
//				if(input[i]==input[j]) {
//					System.out.print(input[j]);
//					count++;
//				break;
//	}}}}
//	public static void main(String[] args) {
//	   	string = "AABBBCDEEFFFEF";
//		  count = 0;
//		  countCharacter(string,count);
//	}}	  
//		  char[] input = string.toCharArray();
//		  System.out.println("Duplicate Characters are:");
//		  for (int i = 0; i < string.length(); i++) {
//		   for (int j = i + 1; j < string.length(); j++) {
//		    if (input[i] == input[j]) {
//		     System.out.print(input[j]);
////		     count++;
//		    break;
		