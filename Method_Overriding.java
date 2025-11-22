class a
{
    public int a;
    public int harry()
    {
        return 4;
    }
    public void method2()
    {
        System.out.println("Method 2");
    }
}
class b extends a
{
    public void meth3()
    {
        System.out.println("Method 3 of class B");
    }
    @Override
    public void method2()
    {
        System.out.println("Method 2 of class B");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        a a1=new a();
        a1.method2();
        b b1=new b();
        b1.method2();
    }
}
