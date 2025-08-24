class MyEmployee
{
    // we cannot access directly
    private int id;
    private String name;

    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int i)
    {
        id=i;
    }
}
public class Access_Modifiers {
    public static void main(String[] args) {
        MyEmployee souma=new MyEmployee();
        // souma.id=01;--->throws error due to prvate access modifier
        // souma.name="Soumajit Pal";--->same
        souma.setName("Souamjit Pal");
        System.out.println(souma.getName());
    }
}
