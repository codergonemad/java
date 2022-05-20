package day10;
import java.util.Scanner;
class animal{
    public String s;
    public animal()
    {
       System.out.println("Mai ek constructor hu");
    }
    public void set(String set)
    {
        this.s=set;
    }
    public String get()
    {
        return s;
    }
}
class dog extends animal{
     public void print(){
         
        System.out.println("The dog speak "+s);
    }
}
public class q1_practice {
 public static void main(String[] args)
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter what the dog speaks");
     animal a=new animal();
     a.set(sc.next());
     System.out.println("YOu entered "+a.get());
     dog g=new dog();
     g.print();
 }   
}
