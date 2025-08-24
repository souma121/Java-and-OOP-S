import java.util.Random;
import java.util.Scanner;
class Game{
    private int noOfGuess=0;
    private int randomInt;
    private int userInput;
    public Game()
    {
        Random rand=new Random();
        randomInt=rand.nextInt(100);
    }
    public void takeUserInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Guess betwen 0 to 100...");
        userInput=sc.nextInt();
    }
    public int getNoOfGuess()
    {
        return noOfGuess;
    }
    public void setnoOfGuess(int a)
    {
        noOfGuess=a;
    }
    public boolean isCorrectNumber()
    {
        
        
            if(userInput==randomInt)
            {
                System.out.println("Your Guess is correct... and guessat atempt "+ noOfGuess);
                
                return true;
            }
            else if(userInput<randomInt)
            {
                System.out.println("Your chooose so small..");
                noOfGuess++;
                
            }
            else if(userInput>randomInt)
            {
                System.out.println("You choose so big....");
                noOfGuess++;
                
            }
            else
            {
                System.out.println("Tum kisi kam ke nahi hoo...");
                noOfGuess++;
            }
        
        return false;
    }
}
public class Exercise3 {
    public static void main(String[] args) {
        Game souma=new Game();
        
        while(true)
        {
            souma.takeUserInput();
            // souma.isCorrectNumber();
            if(souma.isCorrectNumber())
            {
                break;
            }
        }
    }
}
