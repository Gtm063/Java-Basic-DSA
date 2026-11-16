package BinarySearch_2DArray;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
      int [][] arr={
              {1,2,3},
              {4,5,6},
              {7,8,9}};
      int target=7;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    //search in the row provided between the columns provided
    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int rStart = 0;
        int rEnd = rows - 1;

        while (rStart <= rEnd) {
            int midRow = rStart + (rEnd - rStart) / 2;

            // Check if the target falls within this row's min and max values
            if (target >= matrix[midRow][0] && target <= matrix[midRow][cols - 1]) {
                // Target is in this row, Search inside it right now.
                return binarySearch(matrix, midRow, 0, cols - 1, target);
            }
            else if (target < matrix[midRow][0]) {
                // Target is smaller than the rows first element -> look UP
                rEnd = midRow - 1;
            }
            else {
                // Target is larger than the row's last element -> look DOWN
                rStart = midRow + 1;
            }
        }

        return new int[]{-1, -1}; // Not found
    }

    // Standard helper binary search for a specific row
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}

