package day8;
class Employee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setName(String n){
        name =n;
    }

}

public class q1_practice {
    public static void main(String[] args)
    {
        Employee saket=new Employee();
        saket.salary=34;
        saket.name="saket";
        System.out.println(saket.getsalary());
        System.out.println(saket.getname());
        saket.setName("SaketSingh");
        System.out.println(saket.getname());
        //New object
        Employee singh=new Employee();
        singh.salary=24;
        singh.name="Singh";
        System.out.println(singh.getsalary());
        System.out.println(singh.getname());
        singh.setName("SaketSingh");
        System.out.println(singh.getname());
        

    }
    
}
