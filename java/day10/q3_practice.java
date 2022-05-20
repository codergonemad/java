package day10;
import java.util.Scanner;
class rectangle{
    int l;
    int b;
    public rectangle(int len,int brea)
    {
        this.l=len;
        this.b=brea;
    }
    public void area()
    {
        System.out.println("The area of the rectangle is "+l*b);
    }
}
class cuboid extends rectangle{
    int h;
    public cuboid(int l,int b,int h)
    {
        super(l,b);
        this.h=h;
    }
    public void volcub()
    {
       System.out.println("The volume of the cuboid is "+l*b*h);
    }
}
public class q3_practice {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle and height of the cublid");
        cuboid obj=new cuboid(sc.nextInt(),sc.nextInt(),sc.nextInt());
        obj.area();
        obj.volcub();
    }
}
