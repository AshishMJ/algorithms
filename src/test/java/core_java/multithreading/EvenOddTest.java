package core_java.multithreading;

import org.junit.Test;

public class EvenOddTest {

    @Test
    public void test() {

        Printer p = new Printer();

        Runnable even = new EvenOdd(10, true, p);
        Runnable odd = new EvenOdd(10, false, p);


        Thread t1 = new Thread(even);
        Thread t2 = new Thread(odd);

        t1.start();
        t2.start();
    }
}
