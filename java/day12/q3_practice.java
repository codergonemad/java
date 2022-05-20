package day12;
class property{
    String trump="comedian";
    protected int a=4;
}
class property2 extends property{
    public void print()
    {
        System.out.println("Printing... "+trump);
        System.out.println("Printing... "+a);
    }
}
public class q3_practice {
    public static void main(String [] args)
    {
      property2 p=new property2();
      p.print();
    }
}
