package day7;

public class q4_practice {
    static void pattern(char c)
    {
        for (int i=0;i<4;i++)
        {
            for(int j=3;j>=i;j--)
            {
                System.out.print(c);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args)
    {
        pattern('*');
    }
    
}
