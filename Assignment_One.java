import java.util.Scanner;
public class Assignment_One{
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n<0){
            System.out.println("Factorial is not possible");
        }
        else{
            System.out.println("Factorial is: " + factorial(n));
        }
    }
}