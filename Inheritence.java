class Base
{
    int x;
    Base()
    {
        System.out.println("i am a Constructor...");
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
//the things of Base class is extends in Derived class
class Derived extends Base
{
    int y;
    public void sety(int r)
    {
        this.y=r;
    }
    public double gety()
    {
        return y;
    }
}
public class Inheritence {
    public static void main(String[] args) {
        Base b=new Base();
        b.setx(4);
        System.out.println(b.getx());
        Derived d=new Derived();
        d.sety(6);
        System.out.println(d.gety());
    }
}
