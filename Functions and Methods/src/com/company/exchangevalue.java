package com.company;

import java.util.Arrays;

public class exchangevalue {
    public static void main(String[] args) {
        // create an array
            int[] arr ={1, 3, 4, 5, 24};
            change(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void change (int[] nums){
        nums[0] = 99;
    }

}
