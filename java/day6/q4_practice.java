package day6;
import java.util.*;
public class q4_practice {
 public static void main(String[] args)
 {
     int [][] arr={{22,21,20},{44,33,32}};
     int [][] arr1={{11,13,12},{15,14,17}};
     int [][] arr3={{0,0,0},{0,0,0}};
     for(int i=0;i<arr.length;i++)
     {
         for(int j=0;j<arr[i].length;j++)
         {
             arr3[i][j]=arr[i][j]+arr1[i][j];
         }
     }
     for(int i=0;i<arr3.length;i++)
     {
         for(int j=0;j<arr3[i].length;j++)
         {
             System.out.print(arr3[i][j]+" ");
         }
         System.out.println("");
     }
 }   
}
