// Multithreading- thread #1 and #2 run in parallel, both countdown from 10 to 0.
// Thread #2 starts 3 seconds after thread #1

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        MultithreadingRunnable1 runnable1 = new MultithreadingRunnable1();
        Thread thread1 = new Thread(runnable1);

        MultithreadingRunnable2 runnable2 = new MultithreadingRunnable2();
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread1.join(3000); //calling thread (ex.main) waits until the specified thread dies or for x milliseconds
        thread2.start();
    }
}
