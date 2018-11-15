package core_java.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerProblem {

    public static void main(String[] args) {
        Queue<Message> queue = new LinkedList<>();
        int maxCapacity = 8;

        Producer producer = new Producer(queue, maxCapacity);
        Consumer consumer = new Consumer(queue, maxCapacity);

        Thread t1 = new Thread(producer, "Producer");
        Thread t2 = new Thread(consumer, "Consumer");

        t2.start();
        t1.start();
    }
}
