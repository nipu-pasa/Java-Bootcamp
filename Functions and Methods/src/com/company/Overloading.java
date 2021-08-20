package com.company;

public class Overloading {
    public static void main(String[] args) {
        fun(67);
    //    fun("Iron Man");

    }
    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }
}
