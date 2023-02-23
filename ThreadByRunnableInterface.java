package com.nagarro.interview.practice;

public class ThreadByRunnableInterface{

	public static void main(String[] args) {
		int n = 8;
		for(int i=0; i<=n; i++) {
			Thread Object = new Thread(new MultiThread());
			Object.start();
		}

	}

}
class MultiThread implements Runnable{
	@Override
	public void run() {
		try {
			System.out.println("Thread" +" "+ Thread.currentThread().getId());
		}
		catch(Exception exception) {
			System.out.println("Expression is caught");
		}
		
	}

}