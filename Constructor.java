class MyEmployee
{
    // we cannot access directly
    private int id;
    private String name;

    public MyEmployee()
    {
        id=45;
        name="Souamjit Pal";
    }

    public MyEmployee(String myName, int myId)
    {
        id=myId;
        name=myName;
    }

    public void setName(String n)
    {
        this.name=n;
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
        this.id=i;
    }
}
public class Constructor {
    public static void main(String[] args) {
        MyEmployee souma= new MyEmployee();
        // souma.setName("Souamjit Pal");
        // souma.setId(45);
        System.out.println(souma.getName());
        System.out.println(souma.getId());
    }
}
