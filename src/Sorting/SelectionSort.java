package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr={2,5,1,3,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr){
        for (int i=0;i<arr.length;i++){
            //find the maximum element in remaining array and swap with correct item
            int maxIndex=getMaxIndex(arr,0,arr.length-i);
            swap(arr,maxIndex, arr.length-i-1);
        }
    }
    static int getMaxIndex(int[]arr,int start,int end){
        int max=start;
        for (int i = 0; i<end; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
