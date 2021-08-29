//  Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

            // DEMO

  // Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
  //       Output: 8
   //     Explanation: There are 8 negatives number in the matrix.



package com.company;

import java.util.Scanner;

public class CountNegetiveNumbers {

//    public static void main(String[] args) {
//
//        int[][] arr1={{}};
//        int[][] arr2={{3,2,1,-1},{2,1,-1,-2,-2},{4,3,2,-1,-2,-3,-4}};
//        System.out.println("negetive numbers ib arr 1 = "+countNegatives(arr1));
//        System.out.println("negetive numbers ib arr 1 = "+countNegatives(arr2));
//
//
//    }
//    public static int countNegatives(int[][] arr) {
//        if(arr == null || arr.length == 0)
//            return 0;
//
//        int negativeNumberCount = 0;
//        for(int i = 0; i < arr.length; i++){
//            int j = findFirstNegativeElementInTheRow(arr, i, 0, arr[i].length-1);
//            if(j != -1){
//                negativeNumberCount = negativeNumberCount + (arr[i].length-j);
//            }
//        }
//        return negativeNumberCount;
//    }
//
//    /**
//     * This method contains the standard binary search code.
//     */
//    public static int findFirstNegativeElementInTheRow(int[][] arr, int j, int start, int end) {
//        if(start == end){
//            if(arr[j][start] < 0){
//                return start;
//            }
//            else{
//                return -1;
//            }
//        }
//
//        if(end < start){
//            return -1;
//        }
//
//        int mid = (start + end)/2;
//
//        if(mid == 0 && arr[j][mid] < 0){
//            return 0;
//        }
//
//        if(arr[j][mid] < 0 && arr[j][mid-1] >= 0){
//            return mid;
//        }
//
//        if(arr[j][mid] < 0){
//            return findFirstNegativeElementInTheRow(arr, j, start, mid-1);
//        }
//        else{
//            return findFirstNegativeElementInTheRow(arr, j, mid+1, end);
//        }
//    }
//}




                      //Next Method


public static void main(String[] args) {
    int[][] grid={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
    int ans = countNegatives(grid);
    System.out.println(ans);
}
    static int countNegatives(int[][] grid) {
        int result = 0;
        //will keep track on the start of -ve index in each row
        int columnPointer = grid[0].length-1;
        for(int row = 0 ; row < grid.length; row++) {
            //for each sub array of grid navigating from right to left
            for(int col = columnPointer; col >=0; col-- ) {
                if(grid[row][col] < 0) {
                    result += grid.length - row;
                    columnPointer--;
                }
                else {
                    //once we find non negative value that means towards left we will not find -ve value any more, so break
                    break;
                }
            }
        }

        return result;
    }


}

