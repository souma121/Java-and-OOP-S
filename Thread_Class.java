class MyThread extends Thread {
    public void run() {
        for (int i = 0; i <= 50; i++) {
            System.out.println("I am Thread 1...");
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i <= 50; i++) {
            System.out.println("I am Thread 2...");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e.getCause());
            }
        }
    }
}

public class Thread_Class {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        // t1.setPriority(Thread.MAX_PRIORITY);
        // t2.setPriority(Thread.MIN_PRIORITY);
        // t1.start();
        // try {
        //     t1.join();
        // } catch (Exception e) {
        //     System.out.println("Exception caught: " + e.getCause());
        // }

        t1.run();
        t2.run();//fine, but not create separate call stack
        System.out.println("Call Stack is: " + Thread.getAllStackTraces());

        // t2.start();
        // System.out.println("Priority of thread 2 is : " + t2.getPriority());
    }
}
