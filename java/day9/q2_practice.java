package day9;
import java.util.Scanner;
class cylinder{
    private int radius;
    private int height;
    public void setradius(int r)
    {
        this.radius=r;
    }
    public void setheight(int h)
    {
        this.height=h;
    }
    public int getradius()
    {
        return radius;
    }
    public int getheight()
    {
        return height;
    }
}
public class q2_practice {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        cylinder c=new cylinder();
        System.out.println("Enter the radius of the cylinder ");
        c.setradius(sc.nextInt());
        System.out.println("Enter the height of the cylinder ");
        c.setheight(sc.nextInt());
        float vol=3.14f*c.getradius()*c.getheight()*c.getradius();
        System.out.println("The volume of the cylinder is "+vol);
        float area=3.14f*c.getradius()*c.getradius()*(c.getradius()+c.getheight());
        System.out.println("The area of the cylinder is "+area);
    }
}
