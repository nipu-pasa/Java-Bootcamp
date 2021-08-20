package com.company;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
//        sum();
//        sum();
//        sum();
//
//	// write your code here
//    }
//    static void sum(){
//        Scanner in =new Scanner(System.in);
//        System.out.print("enter number 1:");
//
//        int num1= in.nextInt();
//        System.out.print("enter number 2:");
//        int num2= in.nextInt();
//        int sum= num1 + num2;
//        System.out.println("The sum=" + sum);
        int ans = sum3(20,30);
        System.out.println(ans);

    }

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
