package com.company;

public class searchinrange {
    // create a array and search a number in the range of index[1,4]
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;
        int ans = linearsearch(arr, target, 1, 4);
        System.out.println(ans);
    }


    static int linearsearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        // run a loop
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;

    }
}

