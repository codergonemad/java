package day14;

public class run1 {
    public static void main(String[] args){
        int [] arr={3,2,1,6,7,5,4};
        int temp;
        for (int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            }
            System.out.println(arr[i]);
        }
    }
    
}
