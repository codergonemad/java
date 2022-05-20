package day4.practice;
import java.util.*;
public class q2_practice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of the student out of 100");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=(a+b+c)/3;
        if(d>=40 && a>=33 && b>=33 && c>=33 )
        System.out.println("The student is pass");
        else
        System.out.println("The student is fail");



    }
    
}
