package org.example.multitreading.synchroziation;

public class Test {
    public static void main(String[] args) throws InterruptedException {
		Counter cnt= new Counter();
		Thread t=new Thread(cnt);
		Thread t1=new Thread(cnt);
		
		//Thread t1=new Thread(cnt);
		
		t.start();
		t1.start();

		t1.join();
		t.join();

		System.out.println(cnt.getCount());
		
		
	}
}
