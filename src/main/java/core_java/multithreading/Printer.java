package core_java.multithreading;

public class Printer {
    private volatile boolean isOdd;

    public synchronized void printEven(int num) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + ":" + num);
        isOdd = true;
        notify();
    }

    public synchronized void printOdd(int num) {
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + ":" + num);
        isOdd = false;
        notify();
    }
}
