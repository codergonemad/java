package day8;
import java.util.*;
class Square{
    int side;
    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}
public class q3_practice {
    public static void main(String[] args)
    {
        Square s=new Square();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the square");
        s.side=sc.nextInt();
        System.out.println("The area of the square is "+s.area());
        System.out.println("The perimeter of the square is "+s.perimeter());
    }
    
}
