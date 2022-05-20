package day6;
import java.util.*;
public class q1_practice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float [] arr=new float[5];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextFloat();
        }
        int j=0;
        while(j<arr.length){
           System.out.println(arr[j]);
           j++;
        }
        float sum=0;
        for(int k=0;k<arr.length;k++)
        {
           sum=sum+arr[k];
        }
        System.out.println(sum);

    }
}
