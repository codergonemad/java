package day11;
import java.util.Scanner;
interface basicanimal{
    void eat();
    void sleep();
}
class monkey{
    public void jump(String s)
    {
        System.out.println("This jumps "+s);
    }
    public void bite(String se)
    {
        System.out.println("This bites "+se);
    }
}
class human extends monkey implements basicanimal{
    public human()
    {
        System.out.println("This is a human");
    }
    public void eat()
    {
        System.out.println("This just eats the food");
    }
    public void sleep()
    {
        System.out.println("This just sleeps");
    }

}
public class q3_practice {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        monkey m=new monkey();
        System.out.println("Enter the text");
        String s=sc.nextLine();
        //m.jump(s);
        //m.bite(s);
        human h=new human();
        h.eat();
        h.bite(s);
        h.sleep();
        h.jump(s);
    }
}
