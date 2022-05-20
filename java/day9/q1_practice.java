package day9;
import java.util.*;
class circle{
    private int radius;
    public void setradius(int r)
    {
        if(r==0)
        System.out.println("Radius is not possible");
        else
        this.radius=r;
    }
    public float area()
    {
        return 3.14f*radius*radius;
    }
    public float perimeter()
    {
        return 3.14f*2*radius;
    }
    public int getradius()
    {
        return radius;
    }
}
public class q1_practice {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        circle c=new circle();
        System.out.println("Enter the radius of the circle");
        c.setradius(sc.nextInt());
        System.out.println("The radius you entered is "+c.getradius());
        System.out.println(c.area());
        System.out.println(c.perimeter());

    }
    
}
