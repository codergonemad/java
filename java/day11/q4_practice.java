package day11;
abstract class telephone{
    abstract void lift();
    abstract void disconnected();
    public telephone()
    {
        System.out.println("I am from telephonne");
    }
    public void print()
    {
        System.out.println("I am a method in telephone");
    }
}
class smartphone extends telephone{
    public void lift()
    {
        System.out.println("Lifting...");
    }
    public void disconnected()
    {
        System.out.println("Trying to connect");
    }
    public smartphone()
    {
        System.out.println("I am the constructor of smartphone");
    }
}
public class q4_practice {
    public static void main(String[] args)
    {
        /*telephone t=new smartphone();
        t.print();
        t.disconnected();
        t.lift();*/
        smartphone s=new smartphone();
        s.print();
        s.disconnected();
        s.lift();
    }
}
