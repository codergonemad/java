package day7;

public class q3_practice {
    static int boop(int a)
    {
        if(a==1){
        return 1;}
        return a+boop(a-1);
        
    }
    public static void main(String[] args)
    {
       int sum=boop(10);
       System.out.println(sum);

    }
    
}
