package com.company;

import org.w3c.dom.ls.LSOutput;

public class conditional {

    public static void main(String[] args) {
        /*
        Syntax of if statements:
        if (boolean expression T or f){
        // body
        }
        else{
        //body
        }
         */
	int salary = 10;
	    if (salary > 100) {
            salary = salary + 1000;
        }else
            {


            salary = salary +2000;
            }
        System.out.println(salary);


    }

}
