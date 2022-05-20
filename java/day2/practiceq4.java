package day2;
import java.util.*;
public class practiceq4 {
    public static void main(String[] args){
        int v,u,a,s,q;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find the solution");
        v=sc.nextInt();
        u=sc.nextInt();
        a=sc.nextInt();
        s=sc.nextInt();
        q=(v*v-u*u)/(2*a*s);
        System.out.println("The solution is "+q);
    }
}
