package demo.threading.order_processor;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Logger;

public class AsyncOrderProcessor {
    static final Logger logger = Logger.getLogger(AsyncOrderProcessor.class.getName());

    public static void processOrder(String orderId) {
        System.out.println("Starting order processing for order: " + orderId + " on thread: " + Thread.currentThread().getName());
        CompletableFuture
                .supplyAsync(() -> {
                    // simulate long processing
                    try {
                        Thread.sleep(500 + (int) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return "Order: " + orderId + " processed.";
                })
                .thenAccept(result -> System.out.println(result + " on thread: " + Thread.currentThread().getName()));
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting order processing..");
        List<String> orders = List.of("O-010", "O-223", "O-345", "O-121");
        orders.forEach(order -> Thread.startVirtualThread(() -> processOrder(order)));
        Thread.sleep(3000);
        System.out.println("Order processing completed...");
    }


}

