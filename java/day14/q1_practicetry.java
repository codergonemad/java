package day14;
import java.util.Scanner;
public class q1_practicetry {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i=1000;
        int input;
        System.out.println("ENter the number you want to divide with");
        input=sc.nextInt();
        try{
            System.out.println("The output is "+1000/input);
        }
        catch(Exception e)
        {
            System.out.println("The program couldnt be run because");
            System.out.println(e);
        }
        System.out.println("This is the end of the program");
    }
    
}
