package day7;

public class q6_practice {
    static int lula(int [] a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        return sum/a.length;
    }
    public static void main(String[] args)
    {
        int [] arr={23,24,25,26,21};
        System.out.println(lula(arr));
    }
}
