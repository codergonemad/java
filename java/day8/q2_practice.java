package day8;
class cellphone{
    public void ringing()
    {
       System.out.println("THe phone is ringing");
    }
    public void vibrating()
    {
        System.out.println("THe phone is vibrating");
    }
}
public class q2_practice {
    public static void main(String[] args)
    {
      cellphone nokia=new cellphone();
      nokia.ringing();
      nokia.vibrating();
      cellphone samsung=new cellphone();
      samsung.ringing();
      samsung.vibrating();
    }
    
}
