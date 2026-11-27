package Sorting;
//https://leetcode.com/problems/set-mismatch
import java.util.Arrays;
public class SetMismash {
    //E.g  nums=[1,2,2,4]  output=[2,3]
    //  in output,2-repeated number and 3-number which is missing in that place
    public static void main(String[] args) {
        int []arr={2,1,3,7,4,5,2};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        int i=0;
        while(i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
               return new int[]{arr[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
