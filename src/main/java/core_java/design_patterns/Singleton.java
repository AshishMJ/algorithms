package core_java.design_patterns;

import java.io.Serializable;

/**
 * Created by ashishm on 19/5/18.
 */
public class Singleton implements Serializable {
    private static Singleton instance;
    private static int count;

    private Singleton() {
        count++;
    }

    //Lazy initialization. Thread unsafe.
    public static Singleton getInstanceThreadUnSafe() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    //Lazy initialization. Thread safe. Using method locking.
    public static synchronized Singleton getInstanceThreadSafeUsingMethodSync() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    //Lazy initialization. Thread safe. Using method locking.
    public static Singleton getInstanceThreadSafeUsingSynchronizedBlock() {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    //Lazy initialization. Thread safe. Using method locking.
    public static Singleton getInstanceThreadSafeUsingSynchronizedBlockDoubleCheck() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    public static synchronized int getCount() {
        return count;
    }

    public Object readResolve() {
        return getInstanceThreadSafeUsingSynchronizedBlockDoubleCheck();
    }
}
