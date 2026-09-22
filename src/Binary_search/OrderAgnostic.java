package Binary_search;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -10, -8, -3, 0, 4, 15, 22, 45, 80};
        int target = -12;
        int ans = orderagn(arr, target);
        System.out.println(ans);
    }

    static int orderagn(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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

