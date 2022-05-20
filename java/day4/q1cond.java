package day4;
import java.util.*;
public class q1cond {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Just enter anything you want");
        String st=sc.nextLine();
        boolean a=true,b=false;
        /*int age=sc.nextInt();
        if(age>18){
            System.out.println("Yes you can drive");
        }
        else{
            System.out.println("No you cannot drive");
        }*/
        if(a||b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.println(st);
        System.out.println(!b);



    }
    
}
