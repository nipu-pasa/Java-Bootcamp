package com.company;
// richest customer wealth
public class maxwealth {
    public static void main(String[] args) {


    }
    static int maximumwealth(int[][] accounts){
        //person = row
        //account=col
        int ans=Integer.MIN_VALUE;
        for(int person=0;person< accounts.length;person++){
            int sum=0;
            for (int account=0;account<accounts[person].length;account++){
             sum+=accounts[person][account];

            }
            // we have sum of accounts of person
            //check for the maximmum sum(wealth)
            if(sum>ans) {
                ans = sum;            }
            }
        return ans;
    }

}
