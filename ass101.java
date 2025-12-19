class Thread1 implements Runnable{
    public void run()
    {
        for(int i=0;i<5;i++){
            System.out.println("Java is Hot, Java is Simple");
        }
    }
}
class Thread2 implements Runnable{
    public void run()
    {
        for(int i=0;i<6;i++)

        {
            System.out.println("Java is Multithreaded");
        }
    }
}

public class ass101 {
    public static void main(String[] args) {
        Thread1 obj1=new Thread1();
        Thread2 obj2=new Thread2();
        Thread t1= new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }
}
