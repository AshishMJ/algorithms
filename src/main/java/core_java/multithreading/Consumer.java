package core_java.multithreading;

import java.util.Queue;

public class Consumer implements Runnable {

    private Queue<Message> queue;
    private int MAX_SIZE;

    public Consumer(Queue<Message> queue, int maxCapacity) {
        this.queue = queue;
        this.MAX_SIZE = maxCapacity;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started.");

        synchronized (queue) {
            if (queue.isEmpty()) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            queue.notify();
            System.out.println("Consumer Thread consumed the message : " + queue.remove());
        }
    }
}
