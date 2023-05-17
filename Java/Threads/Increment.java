package Threads;

public class Increment extends Thread {

    private static volatile int counter;
    public static void printCounter() {
        System.out.println(counter);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            counter++;
            i++;
            try {
                sleep(10);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        printCounter();
        Increment i1 = new Increment();
        Increment i2 = new Increment();
        i1.start();
        i2.start();


        try {
            i1.join();
            i2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        printCounter();

    }
}
