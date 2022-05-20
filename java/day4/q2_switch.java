package day4;
import java.util.*;
public class q2_switch {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter you choice");
       String a=sc.next();
       switch(a){
           case "a"->{
               System.out.println("This is case1");
           }
           case "b" ->{
               System.out.println("This is case2");
           }
           default->{
               System.out.println("This is the defualt case");
           }
       }
       
    }
    
}
