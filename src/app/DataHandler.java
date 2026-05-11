package app;

import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

    String[] fruits = new DataRepository().getData();

    public void getOutput() {
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            AtomicInteger count = new AtomicInteger(1);

            for (String fruit : fruits) {
                sb.append("(")
                        .append(count.getAndIncrement())
                        .append(") ")
                        .append(fruit)
                        .append(" ");
            }
            System.out.println(Thread.currentThread().getName() + ": " + sb.toString().trim());
        }
    }
}