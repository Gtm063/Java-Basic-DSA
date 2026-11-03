package Binary_search;

public class PivotForDup {
    public static void main(String[] args) {
        int []arr={2,9,2,2,2};//ex,array with duplicates
        System.out.println("the pivot point is: " + pivot(arr));
        //what's the number of rotation in array->just pivot's position+1
        System.out.println("the number of rotations is :"+(pivot(arr)+1));
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 cases from before:
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // If elements at middle, start, and end are equal -> skip duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // Check if start is the pivot before moving it
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++; // skip start

                // Check if end is the pivot before moving it
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--; // skip end
            }
            // Left side is sorted, so pivot must be in the right half
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
     return -1;
    }
}