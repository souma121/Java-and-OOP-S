class employee
{
    // int id;
    String name;
    int salary;
    /*public void printDerails()
    {
        System.out.println("My name is:" +name+ " Id is: "+ id);
    }*/
    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
}

class cellphone
{
    public void method1()
    {
        System.out.println("Ringing...");
    }
    public void method2()
    {
        System.out.println("Vibrating...");
    }
}

class square
{
    int side;
    public int getArea()
    {
        return side*side;
    }
    public int perimetere()
    {
        return 4*side;
    }
}
public class custom_class {
    public static void main(String[] args) {
        /* 
        employee souma=new employee();
        employee shruti=new employee();
         //setting attributes or properties
        souma.id=01;
        souma.name="Soumajit Pal";
        souma.salary=50000;;
        shruti.id=02;
        shruti.name="Shruti Paul";
        shruti.salary=60000;
        //Printing the attributes
        // System.out.println(obj1.id);
        // System.out.println(obj1.name);
        souma.printDerails();
        shruti.printDerails();
        int salary=shruti.getSalary();
        System.out.println(salary);;
        
        souma.setName("Soumajit Pal");
        System.out.println("Name: " + souma.getName());
        souma.salary=50000;
        int salary=souma.getSalary();
        System.out.println(" Salary: " + salary);
        

        cellphone souma=new cellphone();
        souma.method1();
        souma.method2();
        */

        square souma=new square();
        souma.side=5;
        System.out.println("Srea: "+souma.getArea());
        System.out.println("Perimetere: "+souma.perimetere());
    }
    
}
