package day10;
import java.util.Scanner;
class shape{
    int l;
    int b;
    public shape(int len,int brea)
    {
        this.l=len;
        this.b=brea;
    }
}
class cuboid1 extends shape{
    int h;
    public cuboid1(int l,int b,int h)
    {
        super(l,b);
        this.h=h;

    }
    public void area1()
    {
        System.out.println("The area of the cuboid is "+4*(l+b+h));
    }
}
public class q4_practice {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght breadth and height of the cuboid");
        cuboid1 obj=new cuboid1(sc.nextInt(),sc.nextInt(),sc.nextInt());
        obj.area1();

    }
}
