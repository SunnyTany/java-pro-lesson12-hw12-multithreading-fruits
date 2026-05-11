package app;

public class Main {

    public static void main(String[] args) {
        // 1. Create a repository
        DataRepository repository = new DataRepository();

        // 2. Pass it to the DataHandler constructor
        DataHandler dataHandler = new DataHandler(repository);

        // 3. Initializing and starting threads
        MyThread myThread1 = new MyThread("Thread 1", dataHandler);
        MyThread myThread2 = new MyThread("Thread 2", dataHandler);

        myThread1.start();
        myThread2.start();
    }
}