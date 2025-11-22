class Cylinder
{
    private double radius;
    private double height;
    Cylinder(double radius, double height)
    {
        this.radius=radius;
        this.height=height;
    } 

    public void setRadius(int r)
    {
        radius=r;
    }
    public double getradius()
    {
        return radius;
    }
    public void setHeight(int h)
    {
        height=h;
    }
    public double getHeight()
    {
        return height;
    }
    public double getArea()
    {
        return 2*3.14*radius*height;
    }
    public double getPerimetere()
    {
        return 2*3.14*radius;
    }
}
class Rectangle
{
    private double length;
    private double breadth;
    Rectangle()
    {
        this.length=4;
        this.breadth=5;
    }
    Rectangle(double length, double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public double getArea()
    {
        return length*breadth;
    }
}
public class oops_Practice_Set_9 {
    public static void main(String[] args) {
        Cylinder c=new Cylinder(6,2);
        Rectangle r=new Rectangle(2,2);
        System.out.println("Area is: " + r.getArea());
        // c.setHeight(6);
        // c.setRadius(2);
        System.out.println("Area is: " + c.getArea());
        System.out.println("Perimetere is: " +c.getPerimetere());
    }
}
