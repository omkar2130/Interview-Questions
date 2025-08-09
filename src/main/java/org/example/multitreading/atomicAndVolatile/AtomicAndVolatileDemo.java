package org.example.multitreading.atomicAndVolatile;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicAndVolatileDemo {
	public static void main(String args[]) {
	AtomicInteger counter = new AtomicInteger(0);
	for(int i=0;i<1000;i++) {
	counter.incrementAndGet(); // atomic increment
	}
	System.out.println(counter);
}
}
