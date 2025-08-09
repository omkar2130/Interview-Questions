package org.example.multitreading.synchroziation;

public class Counter implements Runnable{
	
	private int count=0;
	
	// synchronized at method level
	public synchronized void increment() {
		
		//Synchronized Block
		/*
		 * synchronized (this) { count++;
		 * 
		 * }
		 */
		count++;
	}
	
	public int getCount() {
		return count;
	}

	@Override
	public void run() {
		System.out.println("cnt started at run");
		for(int i=0;i<3000;i++) {
		     increment();
		}
	}
	
	
	

}
