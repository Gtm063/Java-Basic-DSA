package Binary_search;
//https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {
    /*simply -find peak element
    * -search in ascending part
    * -if not found search to other part
    * just like order agnostic*/
    public static void main(String[] args) {
      int[] arr={1,2,3,4,5,3,1};
      int target=3;
        System.out.println(search(arr,target));
    }
    static int peakIndex(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }

        return start; //return the gteatest value's index
    }
  static   int search(int[] arr,int target) {
        int peak = peakIndex(arr);
        int firsthalf = orderagn(arr, target, 0, peak);
        if (firsthalf != -1) {
            return firsthalf;

        }
        return orderagn(arr,target,peak+1,arr.length-1);
    }

    static int orderagn(int[] arr, int target,int start,int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            //find the middle element
            //int mid=(start+end)/2;    might be possible start+end exceed the int range
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }
        return -1;
    }

}
