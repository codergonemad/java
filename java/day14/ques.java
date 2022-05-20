package day14;
import java.util.Scanner;
public class ques {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        long sum=1;
        System.out.println("Enter the number");
        long num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            sum+=sum*i;
        
        }
        System.out.println(sum);
         }
     }

    
    
