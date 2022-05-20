package day12;
import java.util.Scanner;
class input{
    public void print(String s)
    {
        System.out.println("Printing input... "+s);

    }
}
public class q2_practice {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        input i=new input();
        System.out.println("Enter the input");
        i.print(sc.nextLine());
    }
}
