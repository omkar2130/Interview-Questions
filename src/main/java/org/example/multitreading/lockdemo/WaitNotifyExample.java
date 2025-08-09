package org.example.multitreading.lockdemo;

class SharedResource {
    private boolean available = false;

    public synchronized void produce() throws InterruptedException {
        while (available) {
            wait(); // Wait until the resource is consumed
        }
        System.out.println("Produced an item");
        available = true;
        notify(); // Notify the consumer
    }

    public synchronized void consume() throws InterruptedException {
        while (!available) {
            wait(); // Wait until the resource is produced
        }
        System.out.println("Consumed an item");
        available = false;
        notify(); // Notify the producer
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    resource.produce();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    resource.consume();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}

