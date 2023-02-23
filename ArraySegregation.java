package com.nagarro.interview.practice;

public class ArraySegregation {

	static void seperateThisArray(int selected_array[], int length_of_array) {
		int count = 0;
		for(int i = 0; i<length_of_array; i++) {
			if(selected_array[i] == 8) {
				count++;
			}
		}
		for(int i = 0; i<length_of_array; i++) {
			selected_array[i] = 8;
		}
		for(int i = count; i<length_of_array;i++) {
			selected_array[i] = 9;
		}
	}
	
	static void printThisArray(int selected_array[],int length_of_array) {
		for(int i = 0 ; i<length_of_array;i++) {
			System.out.print(selected_array[i]+ " ");
		}
		int count_eight = 0 ,count_nine = 0;
		for(int i = 0;i<length_of_array; i++) {
			if(selected_array[i] == 8) {
				count_eight++;
			}
			else {
				count_nine++;
			}
		}
		System.out.println("Count of eight is" + count_eight);
		System.out.println("Count of nine is" + count_nine);
	}
	
	public static void main(String[] string) {
		int selected_array[] = new int[] {9,9,9,8,8,8,8,9,8,9,8,9,8,9,8,8,8,9,8,8,8,9};
		int length_of_array = selected_array.length;
		seperateThisArray(selected_array,length_of_array);
		printThisArray(selected_array,length_of_array);
	}
}