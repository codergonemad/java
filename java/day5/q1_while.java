package day5;
import java.util.*;
public class q1_while {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /*while(a<200){
            System.out.print(a);
            a++;
        }*/
        /*do{
            System.out.println(a);
            a++;

        }while(a<45);*/
        int a=sc.nextInt();
        for(;a>0;a--){
            System.out.print(a+"\t");
        }
        System.out.println();
    }
    
}
