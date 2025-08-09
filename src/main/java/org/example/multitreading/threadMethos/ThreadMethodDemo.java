package org.example.multitreading.threadMethos;

public class ThreadMethodDemo implements Runnable {
	


	@Override
	public void run() {
		for(int i=1;i<=4;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			
			}
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority()+" "+i);
		}
	}

	public static void main(String[] args) {
		
		ThreadMethodDemo run=new ThreadMethodDemo();
		Thread low=new Thread(run);
		Thread medium=new Thread(run);
		Thread high=new Thread(run);

		low.setName("low"); 
		medium.setName("medium");
		high.setName("high");
		
		low.setPriority(1); 
		high.setPriority(Thread.MAX_PRIORITY);
		medium.setPriority(Thread.NORM_PRIORITY);
		
		low.start();
		medium.start();
		high.start();
		
		


	}

}
