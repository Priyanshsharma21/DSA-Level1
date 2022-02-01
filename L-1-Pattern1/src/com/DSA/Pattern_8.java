package com.DSA;

import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();


        for (int i=n; i>=1; i--){
            for (int j=n; j>=1; j--){
                if (i+j == n+1){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();

        }
    }
}


//         *
//       *
//     *
//   *
// *