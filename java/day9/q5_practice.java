package day9;
class rectangle{
    private int length;
    private int breadth;
    public rectangle(int l,int b)
    {
        this.length=l;
        this.breadth=b;
    }
    public void print()
    {
        System.out.println("The length of the rectangle is "+length);
        System.out.println("The breadth of the rectangle is "+breadth);
    }
}
public class q5_practice {
    public static void main(String[] args)
    {
        rectangle r=new rectangle(6,7);
        r.print();
    }
    
}
