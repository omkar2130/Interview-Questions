package org.example.multitreading.threadMethos;

public class MyThreadMe extends Thread {
	

	@Override
	public void run() {
		for(int i=1;i<=4;i++) {
			
		System.out.println(Thread.currentThread().getName()+" "+i);
		// yield give chance to another to execute 
		Thread.yield();
		}
	}

	public static void main(String[] args) {
		
		MyThreadMe t=new MyThreadMe();
		MyThreadMe t1=new MyThreadMe();
		t.setName("Thread1");
		t1.setName("Thread2");
		//daemon threads run at background it execute until main thread is live.
		//when main tread get terminated it will also stop execution
		t.setDaemon(true);
	
		t.start();
		t1.start();
		
		


	}

}
