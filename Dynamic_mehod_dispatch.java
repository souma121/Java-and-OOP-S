class Phone{
    public void greet()
    {
        System.out.println("Good Morning..");
    }
    public void name()
    {
        System.out.println("My name is java in class one");
    }
}
class SmartPhone extends Phone
{
    public void swagat()
    {
        System.out.println("Swagat hain...");
    }
    public void name1()
    {
        System.out.println("My name is javain class two");
    }
}

public class Dynamic_mehod_dispatch {
    public static void main(String[] args) {
        // Phone o=new Phone();
        // o.name();
        // SmartPhone s=new SmartPhone();
        // s.name();
        Phone p=new SmartPhone();
        p.greet();
        // p.swagat();//not allowd
        p.name();
    }
}