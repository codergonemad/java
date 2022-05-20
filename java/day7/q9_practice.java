package day7;
import java.util.*;
public class q9_practice {
    static int temp(int a)
    {
        return 5*(a-32)/9;
    }
    public static void main(String[] args)
    {
      System.out.println("Enter the temp in fahrenheit");
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      System.out.println("The temp in celcius is "+temp(a));
    }
    
}
