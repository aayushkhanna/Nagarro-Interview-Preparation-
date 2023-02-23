package com.nagarro.interview.practice;

class MultiThreadingDemo extends Thread {
	public void run() {
		try {
			System.out.println("Thread" + Thread.currentThread().getId()+ "is running");
		}
		catch(Exception E) {
			System.out.println("Exception is caught");
		}
	}
}
public class MultiThreading{
	
	public static void main(String[] args) {
		int n = 8;
		for (int i =0; i<n; i++) {
			MultiThreadingDemo Object = new MultiThreadingDemo();
			Object.start();
		}
	}
}
