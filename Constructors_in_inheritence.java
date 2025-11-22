class Base1
{
    public int x;
    Base1()
    {
        System.out.println("i am a constructor...");
    }
    Base1(int x)
    {
        System.out.println("i am a overloaded constructor... with x= " + x);
    }
    public void setx(int r)
    {
        this.x=r;
    }
    public int getx()
    {
        return x;
    }
}
class Derived1 extends Base1
{
    Derived1()
    {
        //if we don't use super then by default it runs the without argument constructor
        // super(0);
        System.out.println("I am a Derived class constructor...");
    }
    Derived1(int x, int y)
    {
        super(x);
        System.out.println("i am a overloaded constructor... with x,y are " + x+" "+y);
    }
    public int y;
    public void setx(int r)
    {
        this.y=r;
    }
    public int getx()
    {
        return y;
    }
}
class ChildOfDerived extends Derived1
{
    ChildOfDerived()
    {
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z)
    {
        super(x,y);
        System.out.println("i am a overloaded constructor... with z= " + z);
    }
}
public class Constructors_in_inheritence {
    public static void main(String[] args) {
        //at first runs the base class constructor then derived class constructor
        // Base1 b1=new Base1();
        // Derived1 d1=new Derived1(14,9);
        ChildOfDerived c1=new ChildOfDerived(2,3,4);
    }
}
