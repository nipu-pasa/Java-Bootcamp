package com.company;

public class  Main {

    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        int target=50;
        int ans=linearsearch(arr,target);
        System.out.println(ans);

    }
    // search in the array : return the index if found
    //otherwise if item not found return -1
    static int linearsearch(int[] arr,int target){
        if (arr.length==0)
        {
            return-1;
        }
        // run a loop
        for(int index=0;index<arr.length;index++)
        {
            int element=arr[index];
            if (element==target)
            {
                return index;
            }
        }
        return -1;

    }


}
