class Table{
     void printable(int n){
       synchronized(this){ 
            for(int i=1;i<5;i++){
                
                System.out.println(n*i);
            }
        }
    }
}
class Thread1 extends Thread{
    Table t;
    Thread1(Table t){
        this.t=t;
    }
    public void run()
    {
        t.printable(4);
    }
}
class Thread2 extends Thread{
    Table t;
    Thread2(Table t){
        this.t=t;
    }
    public void run()
    {
        t.printable(5);
    }
}

public class ass105 {
    public static void main(String[] args) {
        Table t=new Table();
        Thread1 t1=new Thread1(t);
        Thread2 t2=new Thread2(t);
        t1.start();
        t2.start();
    }
}
