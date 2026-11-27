package Sorting;
//Google Question!!
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args){
        int []arr={2,1,3,7,4,3,2};
        System.out.println(sort(arr));
    }
     static List<Integer> sort(int[] arr){
        int i=0;
        while(i< arr.length){
            //as element is from 1 to n so its position=element-1
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        //just find missing number
        List<Integer> ans=new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
