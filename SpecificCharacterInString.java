package com.nagarro.interview.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SpecificCharacterInString {
	public static char getCharFromString(String str, int index) {
        return str.charAt(index);
    }
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)) ;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter String");
		String string = scanner.nextLine();//bufferedReader.readLine();
		
		
		System.out.println("Enter index value");
		int index = scanner.nextInt();
		
		System.out.println("Character from " + string+" "+  "at index" + " " + index + " "+"is" + " "  +getCharFromString(string,index));
				
	}
}
