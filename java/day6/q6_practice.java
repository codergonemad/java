package day6;
public class q6_practice {
    public static void main(String[] args){
        int [] arr={32,22,24,25,42};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        
        }
        System.out.println(max);
    }
    
}
