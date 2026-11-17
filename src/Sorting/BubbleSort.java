package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr={2,5,1,3,4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[]arr){
        for (int i = 0; i <arr.length; i++) {
            boolean swap=false;

            //for each step, max item will come at last index
            //as last element is already in place so no need to check so runs till <arr.len-1!
            for (int j = 1 ; j < arr.length-i ; j++) {

                //swap if the item is smaller than the previous item
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                    //to check if it swaps or not . if it doesn't swap even once then it is already sorted
                    swap=true;

                }
            }
            if (!swap){
                break;
            }
        }
    }
}
