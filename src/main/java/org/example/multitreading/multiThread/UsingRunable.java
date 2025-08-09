package org.example.multitreading.multiThread;

public class UsingRunable implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("Multi Thread Demo: implements Runnable Interface");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
