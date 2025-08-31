package org.example.multitreading.synchroziation;

public class Test {
    public static void main(String[] args) throws InterruptedException {
		Counter cnt= new Counter();
		Thread t=new Thread(cnt);
		Thread t1=new Thread(cnt);
		
		//Thread t1=new Thread(cnt);
		
		t.start();
		t1.start();

		t.join();
		t1.join();

		System.out.println(cnt.getCount());
		
		// when we are doing join() that time 2nd tread is wating to complete 1st tread.
		//after completing 1st then 2nd will start
		// if we comment join() then directly main tread print 0
	}
}
