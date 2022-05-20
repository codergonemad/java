package day13;
class gm1 extends Thread{
    public void run()
    {
        try{
            Thread.sleep(200);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        int i=0;
        while(i<=500){
        System.out.println("Good morning");
        i++;
        }
    }
}
class welcome1 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<=500){
        System.out.println("Welcome");
        i++;
        }
    }
}
public class q3_practice {
    public static void main(String[] args)
    {
        gm1 g=new gm1();
        welcome1 w=new welcome1();
        g.start();
        w.start();
    }
}


