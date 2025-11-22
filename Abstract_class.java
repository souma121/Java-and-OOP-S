abstract class Parent2
{
    public Parent2()
    {
        System.out.println("|I am a constructor...");
    }
    public void sayhelo()
    {
        System.out.println("Hello...");
    }
    abstract public void greeet();
    
}

class Child2 extends Parent2
{
    @Override
    public void greeet()
    {
        System.out.println("Good Morning");
    }
}

abstract class Child3 extends Parent2
{
    public void th()
    {
        System.out.println("I a good...");
    }
}

public class Abstract_class {
    public static void main(String[] args) {
        Child2 c2=new Child2();
        // Parent2 p2=new Parent2();---->throws an error
        // Child3 c3=new Child3();----->throws an error
    }
}
