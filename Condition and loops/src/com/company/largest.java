package com.company;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c= input.nextInt();
        //Q : Find the largest of 3 numbers
        int max = a;
        if (b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        System.out.println(max);
        }
    }

