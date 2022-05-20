package day7;
import java.util.*;
public class q1_practicemulti {
    static void multi(int a){
        for(int i=1;i<=10;i++)
        {
           System.out.println(a+" * "+i+" = "+ a*i);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        multi(n);
    }
    
}
