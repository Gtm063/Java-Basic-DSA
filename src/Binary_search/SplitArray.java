package Binary_search;
//https://leetcode.com/problems/split-array-largest-sum/description/
public class SplitArray {
    public static void main(String[] args) {
       int[]nums={7,2,5,10,8};
       int m=2;
        System.out.println(splitArray(nums,m));
    }
    public static int splitArray(int [] nums,int m){
        int start=0;
        int end=0;

        for(int i=0;i< nums.length;i++){
            //this shows the limit minimum to maximum possible answer
            //min ans=max element in the array (if no. of element=m)

            start=Math.max(start,nums[i]);

            //max ans=sum of all element of array (if m=1)
         //at the end it will contain the max item in the array
            end=end+nums[i];
        }

        //binary search
        while(start<end){
            //try middle as a potential answer
            int mid=start+(end-start)/2;

            //calculate how many parts of array we can divide with max sum

            int sum=0;
            int parts=1;
            for (int j = 0; j < nums.length; j++) {
                int num=nums[j];

                if ((sum+num)>mid) {
                    //you cannot add this in this subarray,make another array

                    //so we have to make sum from the num so start from num
                    sum=num;
                    //array is divided so
                    parts++;
                }else{
                    sum+=num;
                }
            }
            if(parts>m){
                //if we divide more than question asked for
                //mean we have to allow more elem to sum so we have to exceed the limitation to sum

                start=mid+1;
                //limit is extended
            }else{
                //if we divide less or equal to targeted
                end=mid;
            }
        }
        return end;
    }
}
