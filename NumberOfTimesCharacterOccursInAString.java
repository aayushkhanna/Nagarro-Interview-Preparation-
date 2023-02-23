package com.nagarro.interview.practice;

public class NumberOfTimesCharacterOccursInAString {
	
	
	public static int count(String string, char character) {
		int count = 0;
		for(int i=0; i<string.length();i++) {
			if(string.charAt(i)== character) {
				count++;
		}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		String string = "YoutubeMusic Album";
		char character = 'u';
		char character2 = 'Y';
		System.out.println(count(string,character));
		System.out.println(count(string,character2));
	}

}
