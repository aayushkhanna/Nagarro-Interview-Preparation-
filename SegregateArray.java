package com.nagarro.interview.practice;
public class SegregateArray {
	static int count = 0;
	static int i,number;
	static void ArraySegregation(int array[], int number) {
		//int count = 0;
		for(i =0; i<number;i++) {
			if(array[i] == 0) {
				count++;
			}
		}
		for(i = 0 ; i<count; i++) {
			array[i] = 0;
		}
		for (i = count; i <number; i++) {
            array[i] = 1;
	     }
	}
		 static void print(int array[], int number)
		    {
		        System.out.print("Array after segregation is ");
		        for (i = 0; i < number; i++)
		            System.out.print(array[i] + " ");    
		    }
		public static void main(String[] args) {
				int array[] = new int[]{0,1,1,0,0,1,1,1};
				int number = array.length;			
				ArraySegregation(array,number);
				print(array,number);
			}
	}


