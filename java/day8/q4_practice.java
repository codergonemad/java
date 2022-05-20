package day8;
import java.util.*;
class Rectangle{
    int l;
    int b;
    public int area()
    {
        return l*b;
    }
    public int perimeter()
    {
        return 2*(l+b);
    }
}
public class q4_practice {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Rectangle r=new Rectangle();
    System.out.println("Enter the l of the rectangle");
    r.l=sc.nextInt();
    System.out.println("Enter the b of the rectangle");
    r.b=sc.nextInt();
    System.out.println("THe area of the rectangle is "+r.area());
    System.out.println("The perimeter of the rectangle is "+r.perimeter());
    
}
}