package com.DSA;

import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int icj=1;
            for (int j = 0; j <= i; j++) {
                System.out.print(icj+"\t");
                int icjp1 = icj + (i - j)/(j+1);
                icj = icjp1;

            }
            System.out.println();
        }
    }}
