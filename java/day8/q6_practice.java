package day8;
import java.util.Scanner;
class circle{
    int radius;
    public float area(){
        return 3.14f*radius*radius;
    }
    public float perimeter(){
        return 3.14f*2*radius; 
    }
}
public class q6_practice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        circle c=new circle();
        System.out.println("Enter the radius of the circle");
        c.radius=sc.nextInt();
        System.out.println("The area of the circle is "+c.area());
        System.out.println("The perimeter of the circle is "+c.perimeter());
    }
    
}
