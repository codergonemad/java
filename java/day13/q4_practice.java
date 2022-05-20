package day13;
class priority extends Thread{
    public void run()
    {
        int i=0;
        while(i<=50)
        {
            System.out.println("Printing kuch bhi chutiyapa");
            i++;
        }
    }
}
class notsoimp extends Thread{
    public void run()
    {
        int i=0;
        while(i<50)
        {
            System.out.println("Printing not so imp thing");
            i++;
        }
    }
}
public class q4_practice {
    public static void main(String[] args)
    {
        priority p=new priority();
        notsoimp i=new notsoimp();
        p.start();
        i.start();
        p.setPriority(1);
        i.setPriority(5);
        System.out.println("Getting priority "+p.getPriority());
        System.out.println("Not so important "+i.getPriority());
    }
}
