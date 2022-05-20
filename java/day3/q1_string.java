package day3;
import java.util.*;
public class q1_string{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String name= sc.next();
        // going to check objects of the string
        int l=name.length();
        System.out.println(l); 
        String lString=name.toLowerCase();
        System.out.println(lString);
        String ustring=name.toUpperCase();
        System.out.println(ustring);
        //System.out.println("Enter the next line to trim");
        //String a=sc.nextLine();
        //System.out.println(a.trim());
        String exp=sc.nextLine();
        System.out.println(exp.replace(" " , "_"));

    }
}