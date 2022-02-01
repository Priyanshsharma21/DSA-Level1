package com.DSA;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {

//Squre
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nst = n;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=nst; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }


    }
}
