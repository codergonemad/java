package day10;
import java.util.Scanner;
class circle{
    int radius;
    public circle(int r)
    {
        this.radius=r;
    }
    public void print()
    {
        System.out.println("Area of the circle is "+3.14f*radius*radius);
    }
}
class Cylinder extends circle{
    int height;
    public Cylinder(int r,int h)
    {
        super(r);
        this.height=h;
    }
    public void printcyl()
    {
        System.out.println("Area of the cylinder is "+3.14f*2*radius*(radius+height));
    }
}
public class q2_practice {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Enter the radius of circle and cylinder");
        circle c=new circle(sc.nextInt());*/
        System.out.println("Enter the height and radius of the cylinder");
        Cylinder obj=new Cylinder(sc.nextInt(),sc.nextInt());
        System.out.println("The area of the circle is ");
        obj.print();
        System.out.println("The area of the cylinder is ");
        obj.printcyl();

    }
}
