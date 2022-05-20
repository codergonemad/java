package day13;
class Mythr implements Runnable{
    int i=0;
    public Mythr(String m){
        System.out.println("CONSTRUCTOR..."+m);
    }
    public void run()
    {
        System.out.println("Thankyou ");
    }
    
}
public class q1_practice {
    public static void main(String[] args)
    {
        Mythr m=new Mythr("saket");
        Thread t=new Thread(m,"singh");
        t.start();
    }
}
