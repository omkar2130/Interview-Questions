package org.example.exapmles;

import java.util.concurrent.*;

public class ExecutorServicesDemo {
    public static void main(String args[]) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> System.out.println("Task executed"));
        executor.shutdown();
        Callable<String> task = () -> "Result";
        Future<String> future = executor.submit(task);
        String result = future.get(); // blocks until result is available
        System.out.println(result);

    }
}
