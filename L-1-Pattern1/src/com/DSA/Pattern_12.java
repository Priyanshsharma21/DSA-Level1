package com.DSA;

import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int a=0;
        int b=1;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++ ){
                System.out.print(a+"\t");
                int c = a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }

    }
}


//        0
//        1	 1
//        2	 3   5
//        8  13  21	34
//        55 89	144	233	377