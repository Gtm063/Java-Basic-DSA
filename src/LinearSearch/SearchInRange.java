package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[]nums={18,12,-7,4,3,20};
        int target=40;
        int ans=LinearSearch(nums,target,1,4);
        System.out.println(ans);
    }

    static int LinearSearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i <=end; i++) {

            if(arr[i]==target){
                return i;
            }

        }
        return -1;
    }
}
