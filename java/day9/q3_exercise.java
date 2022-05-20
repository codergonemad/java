package day9;
import java.util.Scanner;
import java.lang.Math;
class Game{
    private double num;
    private double user;
    public void Game()
    {
        this.num=Math.random();

    }
    public void takeUserInput(double n)
    {
        this.user=n;
        if(user==num)
        System.out.println("You guessed the correct number");
        else
        System.out.println("Your guess is wrong");
    }
    public double isCorrectNumber()
    {
        return num;
    }


}
public class q3_exercise {
    public static void main(String[] args)
    {
        Game g=new Game();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        g.takeUserInput(sc.nextDouble());
        System.out.println("The correct number is "+g.isCorrectNumber());
    }
    
}
