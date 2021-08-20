package com.company;

// Floor number of the given target number =find the greatest number in array that is smaller than or equal (> or==) to target number

public class Floor {

        public static void main(String[] args) {
            int [] arr={2,3,5,9,14,16,18};
            int target =15;
            int ans = ceiling(arr,target);
            System.out.println(ans);

        }

        // return the  index of smalled no >=target

        static int ceiling(int[] arr, int target) {
            // but what if target is greater than the  greatest number in array
            if(target>arr[arr.length-1])
            {
                return  -1;

            }
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
            return end;
        }
    }






