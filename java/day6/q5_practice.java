package day6;

public class q5_practice {
    public static void main(String[] args){
        int [] arr={33,32,31,35,36};
        int j=arr.length-1;
        for(int i=0;i<=j;i++)
        {
           int swap;
           swap=arr[i];
           arr[i]=arr[j];
           arr[j]=swap;
           j--;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
