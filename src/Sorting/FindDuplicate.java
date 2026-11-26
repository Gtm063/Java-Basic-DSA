package Sorting;

public class FindDuplicate {
    public static void main(String[] args) {
       int[] nums = {1,3,4,2,2};

        System.out.println(sort(nums));
    }
    static int sort(int[] arr){
        int i=0;
        while(i< arr.length){
            //as element is from 1 to n so its position=element-1
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            } else if (i!=correct) {
                return arr[i];
            } else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
