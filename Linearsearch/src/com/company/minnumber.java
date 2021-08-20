package com.company;

public class minnumber {
    public static void main(String[] args) {


        int[] arr = {18, 12, 3, 56, 74};
        int ans = min(arr);
        System.out.println(ans);

    }
    static int min(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min) {

                min = arr[i];
            }
        }

        return min;
    }

}


