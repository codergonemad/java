package day9;
import java.util.Scanner;
class cylinder1{
    private int radius;
    private int height;
    public cylinder1(int r,int h)
    {
        this.radius=r;
        this.height=h;
    }
    public void calc()
    {
        System.out.println("The volume of the cylinder is "+ 3.14f*height*radius*radius);
        System.out.println("The area of the cylinder is "+ 3.14f*radius*radius*(radius+height));
    }
}
public class q3_practice {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius and height of cylinder");
        cylinder1 s= new cylinder1(5,7);
        s.calc();
    }
}
