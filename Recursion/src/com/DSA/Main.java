package com.DSA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = in.nextInt();
        printDecreasing(n);

    }


    public static void printDecreasing(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }


}
