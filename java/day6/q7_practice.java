package day6;

public class q7_practice {
    public static void main(String[] args){
        int arr[] ={11,12,14,16,17};
        boolean art=false;
        for (int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<=arr[i+1])
            art=true;
            else
            art=false;
        }
        System.out.println(art);
    }
    
}
