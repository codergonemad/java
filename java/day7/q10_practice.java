package day7;

import java.util.Scanner;

public class q10_practice {
    static int sol(int n)
    {
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the natural number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The sum of n natural number is "+sol(n));
    }
}
