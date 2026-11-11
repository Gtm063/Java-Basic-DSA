package Binary_search;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedBin_search {
    public static void main(String[] args) {
     int []arr={4,5,6,7,0,1,2};
     int target=6;
        System.out.println(search(arr,target));
    }
    static int search(int[]nums,int target){
        int pivot=findPivot(nums);
        if(pivot==-1){
            //do normal binary search as it should be in normal ascending order if there is no pivot
            return binarysearch(nums,target,0,nums.length-1);
        }
        //if pivot is found we have two ascending sorted arrays
        if(nums[pivot]==target){
            return pivot;
        }
        //if num[start]<target,then it should be in first half till pivot as after pivot numbers are smaller than pivot
        if(nums[0]<=target){
            return binarysearch(nums,target,0,pivot-1);
        }
        //else as num[start]>target it should be in second half!!
        return binarysearch(nums,target,pivot+1, nums.length-1);
    }
    static int binarysearch(int[]arr,int target,int start,int end){
        while(start<=end){

            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;

            }else {

                return mid;
            }
        }
       return -1;
    }

    static int findPivot(int[] arr) {
        //NOTE:: this will not work if there are duplicate numbers!!
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases:
            if(mid<end && arr[mid]> arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[start]>arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            //if it was mid ,it must got in first 2 cases! so mid+1
            }

        }
        return -1;
    }
}