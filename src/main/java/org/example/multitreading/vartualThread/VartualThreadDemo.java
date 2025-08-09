package org.example.multitreading.vartualThread;

public class VartualThreadDemo {
	//You can create a virtual thread using the Thread.ofVirtual() method:
	//Reduced Memory Usage
	//Lightweight
	  static int cnt=0;
	    public static void main(String[] args) throws InterruptedException {
	    	
	        Thread virtualThread = Thread.ofVirtual().start(() -> {
	        	for(int i=0;i<2000;i++) {
	              cnt++;
	              }
	        });
      
	        // Wait for the thread to finish
	        virtualThread.join();
	        System.out.println(cnt);

	    }
	}

