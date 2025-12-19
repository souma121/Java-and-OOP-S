class MyThread implements Runnable {
    int n;

    MyThread(int n) {
        this.n = n;
    }

    public void run() {
        for(int j=0;j<6;j++){
            try{
                // System.out.println(Thread.currentThread().getName());
                int fact = 1;
                for (int i = n; i >= 1; i--) {
                    fact *= i;
                }

                System.out.println("thre Factorial is " + fact);
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class MyThread2 implements Runnable{
    int n1;
    MyThread2(int n1){
        this.n1=n1;
    }
    public void run()
    {
        // System.out.println(Thread.currentThread().getName());
        for(int i=0;i<6;i++){
            try{
                int a=n1,b=6,r;
                while (b!=0) {
                    r=a%b;
                    a=b;
                    b=r;
                }
                Thread.sleep(1000);
                System.out.println("Gcd is " + a);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ass102 {
    public static void main(String[] args) {
        MyThread obj1=new MyThread(5);
        MyThread2 obj2=new MyThread2(8);

        Thread t1=new Thread(obj1);// Factorial
        Thread t2=new Thread(obj2);// GCD
        t1.setName("fact");
        t2.setName("GCD");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
