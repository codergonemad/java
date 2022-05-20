package day13;
class gm extends Thread{
    public void run()
    {
        while(true)
        System.out.println("Good morning");
    }
}
class welcome extends Thread
{
    public void run()
    {
        while(true)
        System.out.println("Welcome");
    }
}
public class q2_practice {
    public static void main(String[] args)
    {
        gm g=new gm();
        welcome w=new welcome();
        g.start();
    }
}
