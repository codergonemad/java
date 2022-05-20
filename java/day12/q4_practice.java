package day12;
class my extends Thread{
    @Override
    public void run()
    {
        int i=0;
        while(i<1000)
        {
            System.out.println("Checking threading...");
            i++;
        }
    }
}
class my2 extends Thread{
    @Override
    public void run()
    {
        int i=0;
        while(i<1000)
        {
            System.out.println("Htt be laude...");
            i++;
        }
    }
}
public class q4_practice {
    public static void main(String[] args)
    {
        my m=new my();
        m.start();
        my2 m2=new my2();
        m2.start();
    }
}
