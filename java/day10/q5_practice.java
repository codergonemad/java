package day10;
class base{
    public base()
    {
        System.out.println("This is base constructor");
    }
}
class derived1 extends base{
    public derived1()
    {
        System.out.println("This is derived1 constructor");
    }
}
class derived2 extends derived1{
    public derived2()
    {
        System.out.println("This is derived2 constructor");
    }
}
public class q5_practice {
    public static void main(String[] args)
    {
        derived1 obj=new derived2();
    }
}
