package com.company;

public class evendigits {
    public static void main(String[] args) {
        //find numbers with even numbers of digits
        int[]nums={10,2283,6,897,8976,889878};
        System.out.println(findnumbers(nums));

    }
    static int findnumbers(int[] nums)
    {
        int count=0;
        for(int num:nums){
            if(even(num))
            {
                count++;
            }

        }
        return count;

    }
    // function to check wheather the number contains even digits or not
    static boolean even(int num) {
        int digitnumber = digits(num);
        if (digitnumber % 2 == 0) {
            return true;
        }
        return false;
    }
    //count number of digits in a number
    static int digits(int num)
    {
        int count=0;
        while (num>0)
        {
            count++;
            num=num/10;
        }return count;

    }

}







            // same type question
//package com.company;
//// https://leetcode.com/problems/find-numbers-of-digits/
//public class evendigits {
//    public static void main(String[] args) {
//        int[] nums = {12, 345, 2, 6, 7896};
////        System.out.println(findNumbers(nums));
//
//        System.out.println(digits2(-345678));
//    }
//
//    static int findNumbers(int[] nums) {
//        int count = 0;
//        for (int num : nums) {
//            if (even(num)) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    // function to check whether a number contains even digits or not
//    static boolean even(int num) {
//        int numberOfDigits = digits(num);
//        /*
//        if (numberOfDigits % 2 == 0) {
//            return true;
//        }
//        return false;
//         */
//        return numberOfDigits % 2 == 0;
//    }
//
//    static int digits2(int num) {
//        if (num < 0) {
//            num = num * -1;
//        }
//        return (int) (Math.log10(num)) + 1;
//    }
//
//    // count number of digits in a number
//    static int digits(int num) {
//
//        if (num < 0) {
//            num = num * -1;
//        }
//
//        if (num == 0) {
//            return 1;
//        }
//
//        int count = 0;
//        while (num > 0) {
//            count++;
//            num = num / 10; // num /= 10
//        }
//
//        return count;
//    }
//}
//
