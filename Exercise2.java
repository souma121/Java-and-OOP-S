import java.util.Random;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        int userCount=0;
        int computerCount=0;
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(i<=5){
            int randomInt=rand.nextInt(3);
            System.out.println("Enter 0 for Rock, 1 for Paper and 2 for Secissors");
            int userinput=sc.nextInt();
            if(userinput==0 && randomInt==0)
            {
                System.out.println("uups...😒😒 it is a draw...");
                System.out.println("You and me both chooses Rock😍😍👌");
                userCount--;
                computerCount--;
            }
            else if(userinput==1 && randomInt==1)
            {
                System.out.println("uups...😒😒 it is a draw...");
                System.out.println("You and me both chooses Paper😍😍👌");
                userCount--;
                computerCount--;
            }
            else if(userinput==2 && randomInt==2)
            {
                System.out.println("uups...😒😒 it is a draw...");
                System.out.println("You and me both chooses Secissors😍😍👌");
                userCount--;
                computerCount--;
            }
            else if(userinput==2 && randomInt==0)
            {
                System.out.println("You choose Scissors, I choose Rock...😂😂😂");
                System.out.println("You are a Losser... 😂😂😂");
                System.out.println("Try again...😒😒😒");
                computerCount++;
            }
            else if(userinput==1 && randomInt==2)
            {
                System.out.println("You choose Paper, I choose Scissors...😂😂😂");
                System.out.println("You are a Losser... 😂😂😂");
                System.out.println("Try again...😒😒😒");
                computerCount++;
            }
            else if(userinput==0 && randomInt==1)
            {
                System.out.println("You choose Rock, I choose Paper...😂😂😂");
                System.out.println("You are a Losser... 😂😂😂");
                System.out.println("Try again...😒😒😒");
                computerCount++;
            }
            else
            {
                if(userinput==0 && randomInt==2)
                {
                    System.out.println("You choose Rock, I choose Scissors...😍😍😍");
                    System.out.println("You are a Winner... 😍😍😍");
                    System.out.println("Congratulations...🥳🥳🥳");
                    userCount++;
                }
                else if(userinput==1 && randomInt==0)
                {
                    System.out.println("You choose Paper, I choose Rock...😍😍😍");
                    System.out.println("You are a Winner... 😍😍😍");
                    System.out.println("Congratulations...🥳🥳🥳");
                    userCount++;
                }
                else if(userinput==2 && randomInt==1)
                {
                    System.out.println("You choose Scissors, I choose Paper...😍😍😍");
                    System.out.println("You are a Winner... 😍😍😍");
                    System.out.println("Congratulations...🥳🥳🥳");
                    userCount++;
                }
                else
                {
                    System.out.println("Invalid Input...😒😒😒");
                    System.out.println("Please enter a valid input...😒😒😒");
                }
            }
            System.out.println("Number of games played: "+ (5-i));
            i++;
        }
        if(userCount>computerCount)
        {
            System.out.println("Your score: " + userCount);
            System.out.println("My score is: " + computerCount);
            System.out.println("You are the overall winner...😍😍😍");
            System.out.println("Congratulations...🥳🥳🥳");
        }
        else if(userCount<computerCount)
        {
            System.out.println("Your score: " + userCount);
            System.out.println("My score is: " + computerCount);
            System.out.println("I am the overall winner...😂😂😂");
            System.out.println("Better luck next time...😒😒😒");
        }
        else
        {
            System.out.println("It is a draw...😒😒😒");
            System.out.println("We both are equal...😍😍😍");
        }
    }
}
