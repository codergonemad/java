package day6;
import java.util.*;
public class q2_practice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("ENter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("ENter the element you want to look for");
        int ele=sc.nextInt();
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==ele)
            {
            System.out.println("Element is present in the array at " +j);
            break;
            }
            
        }
    }
}
