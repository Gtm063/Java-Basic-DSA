package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[]nums={23,45,1,2,3,19,-3,324,28};
        int target=198;
        int ans=LinearSearch(nums,target);
        System.out.println(ans);
    }
    //Search in the array :return the index if item is found
    //otherwise if item not found return -1
    static int LinearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
//            int element=arr[i];
            if(arr[i]==target){
                return i;
            }

        }
        return -1;
    }
}
