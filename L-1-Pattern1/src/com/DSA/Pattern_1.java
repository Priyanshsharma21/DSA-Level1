package com.DSA;

import java.util.Scanner;

public class Pattern_1 {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner((System.in));
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        for (int i=1; i<n; i++){ // this loop says about no of rows to print and change line
            for (int j=1; j<=i; j++){ // this loop print in same line
                System.out.print("* "); // if i<=j // print row(n) no of  *
            }
            System.out.println("\t"); // after printing  * change line
        }
    }
}


//    *
//    * *
//    * * *
//    * * * *
//    * * * * *

//Note

//1. identify the np. of row
//2. Identify no.of stars and no.of Space
