import java.util.Scanner;
import java.util.Random;

public class NumberGame
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
         // ma - maximum attempts , a - attempts , ng - number to be guess , g - player's guess
        int ma=3;
        System.out.println("----------------------------------------Number Guessing Game----------------------------------------\n");
        System.out.println("Welcome player!\nIn this game, you have to guess a number between 1 to 100. You get maximum of "+ma+"attempts.");
        System.out.println("Based on the your guesses and rounds, you will get your final score. Points for \nHigh and Low guesses - 1\nCorrect guess - 2 x rounds you played");
        int score=0;
        int rounds=1;
        while(true)
        {
        System.out.println("\nROUND "+rounds);    
        int ng=random.nextInt(100)+1;
        for(int a=1;a<=ma;a++)
        {
            System.out.print(" ATTEMPT "+a+":\n Give your guess: ");
            int g=scanner.nextInt();
            if(g>=1 && g<=100)
            {
            if(g==ng)
            {
                System.out.println("Correct Guess !!!");
                score+=2;
                break;
            }
                System.out.println( (g<ng)? "Too low, guess higger":"Too high, guess lesser");
                score+=1;
            }
            else
            {
                System.out.println("Invalid input, enter number between 1 and 100. You lost your attempt "+a);
            }
        }
        System.out.println("Do you want to play one more round? (Enter 1 if yes)");
        int yes=scanner.nextInt();
        if(yes!=1){ break;}
        rounds+=1;
        }
        System.out.println("Your Score is "+score*rounds);
        scanner.close();
    }
}