package Binary_search;

public class CeilingOfNum {
    public static void main(String[] args) {
        int []arr={-18,-12,-10,-8,-3,0,4,15,22,45,80};
        int target=5;
        int ans=ceiling(arr,target);
        System.out.println(ans);
    }
    static int ceiling(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){

            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;

            }else {
                //ans found
                return mid;
            }
        }
        return arr[start];
    }

}


