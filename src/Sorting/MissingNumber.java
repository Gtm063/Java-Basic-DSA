package Sorting;
//https://leetcode.com/problems/missing-number/
//Amazon Question!!
public class MissingNumber {
    public static void main(String[] args) {
      int []arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }
     static int missingNumber(int[] arr){
        int i=0;
        while(i< arr.length){
            //as element is from 0 to n so its position=element
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        //search for missing element
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j){
                return j;
            }
        }
        //otherwise
        return arr.length;
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
