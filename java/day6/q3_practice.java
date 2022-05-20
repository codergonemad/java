package day6;
import java.util.*;
public class q3_practice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("ENter the marks of the student");
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum=sum+arr[j];
        }
        System.out.println("Average marks of the student is "+sum/arr.length);
    }
}
