package org.example.multitreading.threadLifeCycle;

public class ThreadLifeCycle implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadLifeCycle runnable =new ThreadLifeCycle();
		Thread t= new Thread(runnable);
  	  
  	  System.out.println(t.getState());
  	  t.start();
  	  
  	  // Thread Life Cycle    1. NEW   2. RUNNABLE   3.RUNNING  4.WAIT/BLOCKED   5. TERMINATED
  	 
  	  System.out.println(t.getState());
  	  
  	  Thread.sleep(1000);
  	  
  	  System.out.println(t.getState());
         // wating upto terminate thread 
  	  t.join();
  	  
  	  System.out.println(t.getState());
	}
	

}
