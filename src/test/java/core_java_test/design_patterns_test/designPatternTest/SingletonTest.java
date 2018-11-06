package core_java_test.design_patterns_test.designPatternTest;

import core_java.design_patterns.Singleton;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ashishm on 19/5/18.
 */
public class SingletonTest implements Runnable {

    private Runnable runnableTask;

    @Before
    public void initRunnable() {
        runnableTask = new SingletonTest();
    }

    @Test
    public void testSingletonThreadUnsafe() {
        Thread t1 = new Thread(runnableTask, "t1");
        Thread t2 = new Thread(runnableTask, "t2");
        t1.start();
        t2.start();

        //Sample output. Need to tun multiple times. Singleton.getInstanceThreadUnSafe()

        /*Running thread : t1
        Running thread : t2
        Invoking count on Thread : t1. Count is :2
        Invoking count on Thread : t2. Count is :2*/
    }

    public void run() {
        System.out.println("Running thread : " + Thread.currentThread().getName());
        Singleton.getInstanceThreadUnSafe();
        System.out.println("Invoking count on Thread : " + Thread.currentThread().getName() + ". Count is :" + Singleton.getCount());
    }
}
