import basic.BasicSingleton;
import billpush.BillPughSingleton;
import multi.MultiThreadedSingleton;

public class Main {

    public static void main(String[] args) {

        // Basic Singleton
        Runnable task1 = () -> {
            BasicSingleton instance = BasicSingleton.getInstance();
            System.out.println("Instance: " + instance);
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task1);
        Thread thread3 = new Thread(task1);

        thread1.start();
        thread2.start();
        thread3.start();

        // Multi-Threaded Singleton
        System.out.println("Multi-threaded Singleton:");
        Runnable task2 = () -> {
            MultiThreadedSingleton ms = MultiThreadedSingleton.getInstance();
            System.out.println("Instance: " + ms);
        };

        Thread t1 = new Thread(task2);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Bill Pugh Singleton
        System.out.println("Bill Pugh Singleton:");
        BillPughSingleton bp1 = BillPughSingleton.getInstance();
        BillPughSingleton bp2 = BillPughSingleton.getInstance();
        System.out.println("Instance: " + bp1);
        System.out.println("Instance: " + bp2);
    }

}