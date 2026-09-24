package Binary_search;

import java.util.Arrays;

public class FirstNLastPosition {
    public static void main(String[] args) {

        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] result = position(arr, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] position(int[] arr, int target) {
        int[] ans = {-1, -1};
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                //possible ans found
                ans[0] = mid;
                end = mid - 1;
            }
        }
        if (ans[0] != -1) {
            start = 0;
            end = arr.length - 1;
            while (start <= end) {

                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;

                } else {
                    //possible ans found
                    ans[1] = mid;
                    start= mid +1;
                }
            }

        }

        return ans;
    }
}






