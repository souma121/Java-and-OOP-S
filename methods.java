public class methods {
    // static int logic(int x, int y){
    //     int z;
    //     if(x>y){
    //         z=x+y;
    //     }
    //     else{
    //         z=x*y;
    //     }
    //     return z;
    // }
    // static void change2(int [] arr)
    // {
    //     arr[0]=98;
    // }
    // static void foo()
    // {
    //     System.out.println("hey...");
    // }
    // static void foo(int a)
    // {
    //     System.out.println("Good morning " + a);
    // }
    // static void foo(int a, int b)
    // {
    //     System.out.println("Good morning " + a + " and " + b);
    // }
    //var args
    static int sum(int x, int ...arr)
    {
        int result=x;
        for(int a: arr)
        {

            result=result+a;
        }
        return result;
    }

    //Recursion
    static int fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static void main(String [] args){
        //call without creating a object because of a static method
        // int a=logic(5,6);

        //call by using a object
        // methods obj=new methods();
        // int a=obj.logic(5, 6);
        // System.out.println(a);
        // int [] marks={30,40,50};
        // change2(marks);
        // System.out.println(marks[0]);


        /***********Method Overloading*********** */
        // foo();
        // foo(3000);
        // foo(3000, 4000);
        //Arguments are actual

        /***************Variable Arguments*******************/
        // System.out.println(sum(5, 10, 20, 30, 40));


        /***********Recursion**********/
        // System.out.println("Factorial: "+ fact(5));
    }
}
