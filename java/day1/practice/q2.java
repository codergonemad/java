package practice;
import java.util.*;
public class q2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        double d;
        System.out.println("Enter the marks of the student out of 100");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        d=(a+b+c)/(3*9.5);
        System.out.println("The CGPA of the student is "+d);


    }
    
}
