package day12;
class gun implements Runnable{
    public void run()
    {
        int i=0;
        while(i<404)
        {
            System.out.println("This is going to shoot");
            i++;
        }
        
    }
}
class gun2 implements Runnable{
    public void run()
    {
        int i=0;
        while(i<404)
        {
            System.out.println("THis is going to shoot from gun2"); 
            i++;
        }
        
    }
}
public class q5_runnable {
    public static void main(String[] args)
    {
        gun g=new gun();
        Thread t=new Thread(g);
        t.start();
        gun2 g2=new gun2();
        Thread t2=new Thread(g2);
        t2.start();
    }
}
