package Arrays;

public class Max {
    public static void main(String[] args) {
        int []arr={3,2,5,9,20};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,3));
    }

    //Just max
    static int max(int []arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }
    //Max for given Range
    static int maxRange(int []arr,int start,int end){
        int maxVal=arr[start];
        for (int i = start; i <=end ; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
