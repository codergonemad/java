package day9;
import java.util.Scanner;
class sphere{
    private int radius;
    public sphere(int r)
    {
        this.radius=r;
    }
    public float volume(){
        return (4f/3)*radius*radius*radius*3.14f;
    }
    public float area()
    {
        return 3.14f*4*radius*radius;
    }

}
public class q6_practice {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the sphere");
       sphere s=new sphere(sc.nextInt());
       System.out.println("The volume of the sphere is "+s.volume());
       System.out.println("The area of the sphere is "+s.area());
    }
}
