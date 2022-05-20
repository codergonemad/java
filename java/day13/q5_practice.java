package day13;
class get extends Thread{
    public void run()
    {
        int i=0;
        while(i<50)
        {
            System.out.println("Printing bhai....");
            i++;
        }
    }
}
class getting extends Thread{
    public void run()
    {
        int i=0;
        while(i<50)
        {
            System.out.println("Printing something....");
            i++;
        }
    }
}
public class q5_practice {
    public static void main(String[] args)
    {
        get g=new get();
        getting get =new getting();
        g.start();
        get.start();
        System.out.println(g.getState()) ;
        System.out.println(get.getState());
        System.out.println(g.currentThread());
        System.out.println(get.currentThread());   
    }
}
