package day11;
import java.util.Scanner;
abstract class pen{
    abstract void write(String s);
    abstract void refill(String se);
}
class fountainpen extends pen{
    @Override
    public void write(String s)
    {
        System.out.println("This does nothing but just prints "+s);
    }
    @Override
    public void refill(String se)
    {
        System.out.println("This does nothing but just refills the pen "+se);
    }
    public void nib()
    {
        System.out.println("This does nothing pata nhi kya krega");
    }
}
public class q2_practice {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the line");
        String s=sc.nextLine();
        fountainpen pencil=new fountainpen();
        pencil.write(s);
        pencil.refill(s);
        pencil.nib();

    }
}
