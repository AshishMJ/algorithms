package core_java.multithreading;

public class EvenOdd implements Runnable {
    private int N;
    private boolean isEven;
    private Printer p;

    public EvenOdd(int N, boolean isEven, Printer p) {
        this.N = N;
        this.isEven = isEven;
        this.p = p;
    }

    @Override
    public void run() {
        int i = isEven ? 0 : 1;

        while (i <= N) {
            if (isEven) {
                p.printEven(i);
            } else {
                p.printOdd(i);
            }
            i = i + 2;
        }
    }
}
