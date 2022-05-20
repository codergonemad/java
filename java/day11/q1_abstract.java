package day11;
abstract class phone{
    public phone()
    {
        System.out.println("Mai phone ka constructor hoon");
    }
    abstract public void features();
}
class micromax extends phone{
    @Override
    public void features()
    {
        System.out.println("Kuch nhi bss made in India");
    }
}
abstract class lava extends phone{
    public void dhamaka()
    {
        System.out.println("Check krr rha tha");
    }
}
public class q1_abstract {
    public static void main(String[] args)
    {
        //phone p=new phone();  Abstract class so cant make object
        micromax m1=new micromax();
        //lava l=new lava();  Abstract class so cant make object
        m1.features();
        
    }
}
