package app;

public class DataHandler {

    private final DataRepository repository;

    public DataHandler(DataRepository repository) {
        this.repository = repository;
    }

    public void getOutput() {
        String[] fruits = repository.getData();

        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            int count = 1;

            for (String fruit : fruits) {
                sb.append("(")
                        .append(count++)
                        .append(") ")
                        .append(fruit)
                        .append(" ");
            }
            System.out.println(Thread.currentThread().getName() + ": " + sb.toString().trim());
        }
    }
}