class ProducerConsumer {
    int item;
    boolean available = false;

    synchronized void Produce(int x) {
        if (available) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        item = x;
        System.out.println("Produce Item " + item);
        available = true;
        notify();
    }

    synchronized void Consume() {
        if (!available) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Consume item: " + item);
        available = false;
        notify();
    }
}

class Producer extends Thread {
    ProducerConsumer pc;

    Producer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        int j = 1;
        for (int i = 0; i < 5; i++) {
            pc.Produce(j++);
        }
    }
}

class Consumer extends Thread {
    ProducerConsumer pc;

    Consumer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            pc.Consume();
        }
    }
}

public class ass106 {
    public static void main(String[] args) {
        ProducerConsumer obj = new ProducerConsumer();

        Producer p = new Producer(obj);
        Consumer c = new Consumer(obj);
        p.start();
        c.start();
    }
}
