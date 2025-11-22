// class OuterClass{
//     private int data=10;
//     class InnerClass{
//         void msg()
//         {
//             System.out.println("The value: " + data);
//         }
//     }

// }

// public class Inner_Class {
//     public static void main(String[] args) {
//         OuterClass outer=new OuterClass();
//         OuterClass.InnerClass in=outer.new InnerClass();
//         in.msg();
//     }
    
// }

// Java Anonymous Inner Class...


// abstract class Demo{
//     abstract void msg();
// }

// public class Inner_Class{
//     public static void main(String[] args) {
//         Demo dem=new Demo() {
//             void msg()
//             {
//                 System.out.println("Nice Pochu...");
//             }
//         };
//         dem.msg();
//     }
// }

// interface Eatable{
//     void Eat();
// }
// public class Inner_Class {
//     public static void main(String[] args) {
//         Eatable e=new Eatable() {
//             public void Eat()
//             {
//                 System.out.println("Eat Panir...");
//             }
//         };

//         e.Eat();
//     }
    
// }

//Java Local Inner Class...




// public class Inner_Class {
//     private int data =10; // instance variable
//     void display()
//     {
//         class Local{
//             void msg()
//             {
//                 System.out.println("The Value" + data);
//             }
//         }
//         Local l=new Local();
//         l.msg();
//     }
//     public static void main(String[] args) {
//         Inner_Class in=new Inner_Class();
//         in.display();
//     }
    
// }


// Java Local class with local variable...


// public class Inner_Class {
//     private int data =10; // instance variable
//     void display()
//     {
//         int value=20;
//         class Local{
//             void msg()
//             {
//                 System.out.println("The Value" + data);
//             }
//         }
//         Local l=new Local();
//         l.msg();
//     }
//     public static void main(String[] args) {
//         Inner_Class in=new Inner_Class();
//         in.display();
//     }
    
// }


//Java static class example with instance method...

// class Inner_Class{
//     static int data=10;
//     static class Inner{
//         void msg()
//         {
//             System.out.println("The value: "+ data);
//         }
//     }
//     public static void main(String[] args) {
//         Inner_Class.Inner in=new Inner_Class.Inner();
//         in.msg();
//     }
// }


//Java static nested class with static method...

// class Inner_Class{
//     static int data=30;
//     static class Inner{
//         static void msg()
//         {
//             System.out.println("The Value: "+ data);
//         }
//     }
//     public static void main(String[] args) {
//         Inner_Class.Inner.msg();
//     }
// }


//Java nested interface which is declared within the interface...

// interface Demo{
//     void show();
//     interface Demo1{
//         void msg();
//     }
// }

// class Inter implements Demo.Demo1{
//     public void msg(){
//         System.out.println("Second interface..");
//     }
// }
// public class Inner_Class {

//     public static void main(String[] args) {
//         Inter in=new Inter();
//         in.msg();
//     }
// }


//nested interface within the class....


class Demo{
    interface Demo1{
        void msg();
    }
}

class Inner_Class implements Demo.Demo1{
    public void msg()
    {
        System.out.println("Hiii...");
    }
    public static void main(String[] args) {
        Demo.Demo1 dem=new Inner_Class();
        dem.msg();
    }
}