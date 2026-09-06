package com.daily.multithreading;

public class MultiThread {

	public static void main(String[] args)
	{
		// create 12 threads system-lavel/plateform-lavel

		Thread[] threads = new Thread[4];

		for(int i =0;i < 4;i++)
		{
			int threadNumber = i+1;

			threads[i] = Thread.ofPlatform().name("Worker-" + threadNumber).start(()->{

				System.out.println("Thread " + threadNumber + " started");


				while(true) {
					// CPU-intensive work
				}

				//System.out.println("Thread " + threadNumber + " stopped");
			});

		}
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Stopping all threads...");
//
//		for(Thread thread:threads)
//		{
//			thread.interrupt();
//
//		}
//		for(Thread thread:threads)
//		{
//			try {
//				thread.join();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println("All threads stopped.");
	}
}
