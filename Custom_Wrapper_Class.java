class Demo{
    private int i;
    Demo(){}
    Demo(int i){
        this.i=i;
    }

    public int getValue()
    {
        return i;
    }
    public void setValue(int i){
        this.i=i;
    }

    @Override
    public String toString()
    {
        return Integer.toString(i);
    }
}

public class Custom_Wrapper_Class {
    public static void main(String[] args) {
        Demo dem=new Demo(19);
        System.out.println("The Value of it's: " + dem);
    }
}
