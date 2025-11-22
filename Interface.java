interface Bycycle
{
    final int a=45;
    public void applyBreak(int decreament);
    void speedUp(int increament);
}
interface hornBycycle
{
    public void blowHorn1();
    void blowHorn2();
}
class oneCylce implements Bycycle,hornBycycle
{
    public void blowHorn1()
    {
        System.out.println("Pip...");
    }
    public void blowHorn2()
    {
        System.out.println("pop....");
    }
    public void applyBreak(int decreament)
    {
        System.out.println("Apllyig Breka");
    }
    public void speedUp(int increament)
    {
        System.out.println("Applying speedup");
    }
}
public class Interface {
    public static void main(String[] args) {
        oneCylce c=new oneCylce();
        // c.applyBreak(5);
        // System.out.println(c.a);
        // c.a=45;---> not allow
        // System.out.println(c.a);
        c.blowHorn1();
        c.blowHorn2();
    }
}
