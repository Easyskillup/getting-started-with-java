package demo.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        // Creating a fixed thread pool with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            final int taskId = i;
//            Runnable runnable = () -> {
//                System.out.println("Task: " + taskId + " started by Thread: " + Thread.currentThread().getName());
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println("Task: " + taskId + " completed by Thread: " + Thread.currentThread().getName());
//            };
            executorService.submit(() -> {
                System.out.println("Task: " + taskId + " started by Thread: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task: " + taskId + " completed by Thread: " + Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
    }
}
