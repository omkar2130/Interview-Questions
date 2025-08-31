package org.example.multitreading.atomicAndVolatile;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicAndVolatileDemo {
	private static volatile boolean running = true;

	public static void main(String args[]) throws Exception {
	AtomicInteger counter = new AtomicInteger(0);
	for(int i=0;i<1000;i++) {
	counter.incrementAndGet(); // atomic increment
	}
	System.out.println(counter);



		//does NOT guarantee atomicity (e.g., count++ is still unsafe).
		Thread t = new Thread(() -> {
			while (running) {
				// do something
			}
			System.out.println("Stopped");
		});

		t.start();

		Thread.sleep(1000);  // Let the thread run for a while
		running = false;
	}
}
