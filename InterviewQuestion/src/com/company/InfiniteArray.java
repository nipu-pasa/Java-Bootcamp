package com.company;


public class InfiniteArray {
    public static void main(String[] args) {


        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr,target));
    }

        static int ans ( int[] arr, int target){
            // first find the range
            // start with boxes of 2 size
            int start = 0;
            int end = 1;
            // condition for the target to lie in the range
            while (target > arr[end]) {
                int temp = end + 1; // this is my new start
                // double the box
                // end =index of previous end + size of box * 2

                end = end + (end - start + 1) * 2;
                start = temp;
            }
            return binarysearch(arr,target,start,end);
        }
        // return -1 if it doesnot exists
        static int binarysearch(int[] arr, int target,int start,int end) {

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





