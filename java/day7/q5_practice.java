package day7;
import java.util.*;
public class q5_practice {
    static int fibo(int num)
    {
       if(num==1|| num==2)
       return num-1;
       else
       return fibo(num-1)+fibo(num-2);
    }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the term you wanna find");
      int num=sc.nextInt();
      System.out.println("The nth term is "+fibo(num));
    }
    
}
