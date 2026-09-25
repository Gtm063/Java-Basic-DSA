package Binary_search;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//https://leetcode.com/problems/find-peak-element/
public class MountainArray {
    public static void main(String[] args) {
     int []arr={1,2,3,4,3,1};
        System.out.println(search(arr));
    }
    static int search(int[] arr){
        int start=0;
        int end=arr.length-1;
        int max=0;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                max=mid;
                //we are at decreasing part so
                end=mid;//ass arr[mid] is greater so could be ans also
            }
            else{
                max=mid+1;
                start=mid+1;//here arr[mid+1]is greater than arr[mid] so check from arr[mid+1]
            }
        }
       // return max;    is correct and also
        //we know from above steps the start and ending will point to the same element that is greatest element
        return start;
    }
}
