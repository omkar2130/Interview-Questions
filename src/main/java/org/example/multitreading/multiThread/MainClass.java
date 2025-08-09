package org.example.multitreading.multiThread;

public class MainClass {
      public static void main(String args[]) throws InterruptedException {
    	  //extends Thread Class
			/*
			 * MyThread myThread=new MyThread(); myThread.start();
			 */
    	 
    	  // implements Runnable Interface
    	  
    	  UsingRunable runnable = new UsingRunable();
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
