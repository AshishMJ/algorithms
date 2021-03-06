package core_java.multithreading;

import java.util.Queue;

public class Producer implements Runnable {

    private Queue<Message> queue;
    private int MAX_SIZE;

    public Producer(Queue<Message> queue, int maxCapacity) {
        this.queue = queue;
        this.MAX_SIZE = maxCapacity;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started.");

        synchronized (queue) {
            if (queue.size() == MAX_SIZE){
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            Message message = produceMessage("First Message");
            System.out.println("Sending Message -> " + message);
            queue.add(message);
            System.out.println("Sent Message.");
            queue.notify();
        }
    }

    private Message produceMessage(String message){
        return new Message(message);
    }
}
