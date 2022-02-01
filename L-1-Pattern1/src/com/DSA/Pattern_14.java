package com.DSA;

import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = in.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println(x +" * "+i+"="+(x*i));
        }



    }
}


//        5 * 1=5
//        5 * 2=10
//        5 * 3=15
//        5 * 4=20
//        5 * 5=25
//        5 * 6=30
//        5 * 7=35
//        5 * 8=40
//        5 * 9=45
//        5 * 10=50


