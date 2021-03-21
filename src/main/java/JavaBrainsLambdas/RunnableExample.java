package JavaBrainsLambdas;

public class RunnableExample {


    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Print inside Runnable");
            }
        });

        myThread.run();

        Thread myThreadRunnable = new Thread(() -> System.out.println("Print inside Runnable"));
        myThreadRunnable.run();
    }

}
