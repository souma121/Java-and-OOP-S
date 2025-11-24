class Mythr implements Runnable{
    public void run()
    {
        int i=0;
        while(i<=20000){
            System.out.println("I am thread 1...");
        }
    }
}

class Mythr1 implements Runnable{
    public void run()
    {
        int i=0;
        while(i<=20000){
            System.out.println("I am thread 2...");
        }
    }
}

public class Thread_RUnnable {
    public static void main(String[] args) {
        Mythr t1=new Mythr();
        Thread th1=new Thread(t1);
        Mythr1 t2=new Mythr1();
        Thread th2=new Thread(t2);
        th1.start();
        th2.start();
    }
}
