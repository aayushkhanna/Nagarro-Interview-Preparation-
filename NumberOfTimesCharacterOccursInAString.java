package com.nagarro.interview.practice;

public class NumberOfTimesCharacterOccursInAString {
	
	static char character,character2;
	static String string;
	static int count;
	
	public static int count(String string, char character) {
		count = 0;
		for(int i=0; i<string.length();i++) {
			if(string.charAt(i)== character) {
				count++;
		}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		string = "YoutubeMusic Album";
		character = 'u';
		character2 = 'Y';
		System.out.println(count(string,character));
		System.out.println(count(string,character2));
	}

}
