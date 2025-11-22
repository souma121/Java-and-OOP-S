class one
{
    int a;
    one(int a)
    {
        this.a=a;
    }
    public int returnOne()
    {
        return 1;
    }
    public int getA()
    {
        return a;
    }
}

class too extends one
{
    too(int c)
    {
        super(c);
        System.out.println("I am a cojnsructor");
    }
}
public class this_super_Keyword {
    public static void main(String[] args) {
        one o=new one(5);
        // System.out.println(o.getA());
        too t=new too(65);
        
    }
}
