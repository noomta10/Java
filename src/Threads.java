public class Threads {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.activeCount());

        Thread.currentThread().setName("MAIN");
        System.out.println(Thread.currentThread().getName());


        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());

        System.out.println(Thread.currentThread().isAlive());

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Done!");

        ThreadsPractice myThread = new ThreadsPractice();
        myThread.setDaemon(true);
        myThread.start();
        System.out.println(myThread.isDaemon());
    }
}

