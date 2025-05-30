package demo.threading;

/**
 * Calculate the performance reports of all trainees:
 * 1. Calculate the attendance of each trainee
 * 2. Calculate the assignment completion of each trainee
 * 3. Calculate the assessment grades of each trainee
 * 4. Calculate the capstone project marks
 * <p>
 * Multithreading allows us to execute multiple Threads at the same time. Thread is the part of a process which can be
 * executed independently.
 * Creating Threads: Thread class Runnable interface
 * <p>
 * Thread Lifecycle
 * 1. New:          Thread is created
 * 2. Runnable:     Thread is ready tot execute, happens after start()
 * 3. Running:      Thread is executing
 * 4. Blocked:      Thread is interrupted, waiting for a resource, thread goes into sleep
 * 5. Terminated:   Thread execution in complete
 */
public class ThreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        virtualThreads();

        Thread.sleep(2000);
    }

    /**
     * VirtualThreads:
     */
    static void virtualThreads() {
        SimpleRunnable simpleRunnable = new SimpleRunnable();
        Thread.startVirtualThread(simpleRunnable);
        Thread.startVirtualThread(simpleRunnable);
        Thread.startVirtualThread(simpleRunnable);
    }

    static void lambdaThread(){
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello from Lambda Thread " + Thread.currentThread().getName());
            }
        };
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello from Lambda Thread " + Thread.currentThread().getName());
            }
        });
        thread.start();
    }
    static void customThreadClass() {

        Thread thread1 = new CustomThread("Thread 1");
        Thread thread2 = new CustomThread("Thread 2");
        Thread thread3 = new CustomThread("Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

    static void threadUsingRunnable() {
        SimpleRunnable simpleRunnable = new SimpleRunnable();

        Thread thread1 = new Thread(simpleRunnable);
        thread1.setName("Thread:1");
        Thread thread2 = new Thread(simpleRunnable);
        thread2.setName("Thread:2");
        Thread thread3 = new Thread(simpleRunnable);
        thread3.setName("Thread:3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

// 1. Creating Thread using Runnable
class SimpleRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from Thread " + Thread.currentThread().getName());
        }
    }
}

// 2. Extend the Thread class
class CustomThread extends Thread {
    public CustomThread(String name) {
        setName(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from CustomThread " + Thread.currentThread().getName());
        }
    }
}
