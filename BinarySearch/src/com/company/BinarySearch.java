package com.company;

public class BinarySearch {

    public static void main(String[] args) {
        int [] arr={10,23,43,54,56,75,77,94};
        int target =77;
        int ans = binarysearch(arr,target);
        System.out.println(ans);

    }

    // return index
    // return -1 if it doesnot exists
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // find the middle element
            //  int mid=(start+end)/2; //if the value of end exeeds the range of int it happens if the array contains large number
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
