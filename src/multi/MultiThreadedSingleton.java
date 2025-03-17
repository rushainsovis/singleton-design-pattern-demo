package multi;

public class MultiThreadedSingleton {

    private static MultiThreadedSingleton instance;
    private static final Object lock = new Object();

    private MultiThreadedSingleton() {}

    public static MultiThreadedSingleton getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new MultiThreadedSingleton();
                }
            }
        }
        return instance;
    }

}
