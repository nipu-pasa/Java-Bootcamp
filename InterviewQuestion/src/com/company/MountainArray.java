package com.company;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr={10,20,40,50,44,33,22,11};
        int ans = peakIndexMountainArray(arr);
        System.out.println(ans);


    }
    public static int peakIndexMountainArray(int[] arr)
    {
        int start=0;
        int end =arr.length-1;
        while(start<end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid]>arr[mid+1]){
                // you are in decreasing part of array
                // this may be the ans but look at left
                // this is why end !=mid -1
                end =mid;
            }
            else
            {
                // you are in asc part of array
                start = mid+1; // because we know mid+1 ele > mid ele
            }
        }
        // int the end , start ==end and pointing to the largest number because of the 2 checks above 3
        // start and end are always trying to find max elements in above 2 check
        // hence when they are pointing to just one element,that is max one because that is what check says
        // more elaboration: at every point of time for start and end , they have the best possible answer till that time
        // and if we are saying that only one element is present , that is best posiible ans
        return start; // or return end;
    }
}
