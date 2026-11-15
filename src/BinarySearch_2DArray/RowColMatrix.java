package BinarySearch_2DArray;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
int [][] arr={{10,20,30,40},
        {15,25,35,45},
        {28,29,37,49},
        {33,34,38,50}};
//Array is sorted in row and column wise order!!
int target=34;
        System.out.println(Arrays.toString(search(arr,target)));
    }


    static int[] search(int[][] matrix, int target){
        int r=0;
        int c=matrix.length-1;
        //we have to reduce the number of searches by reducing rows or column

        while(r<matrix.length && c>=0){
            //search from the upper bound
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            //if upper bound is less mean whole row is smaller than target so skip
            if(matrix[r][c]<target){
                r++;
            }else{
             //it is sorted in column wise so if the element is bigger than target mean whole column will greater
             //as all the number below this element is bigger on that particular column so skip it
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}