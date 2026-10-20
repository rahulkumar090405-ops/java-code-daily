package com.daily.thread;

public class ThreadTest implements Runnable {

	@Override
	public void run() {
		System.out.print("Running");
		
	}
	
	public static void main(String[] args)
	{
//		Thread t1 = new Thread(new ThreadTest());
//		t1.start();
		
		Thread thread = new Thread(() -> {
			System.out.print("Processing Order");
		});
		thread.start();
	}
	
}


