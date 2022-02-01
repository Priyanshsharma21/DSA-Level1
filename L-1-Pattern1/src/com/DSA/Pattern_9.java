package com.DSA;

import java.util.Scanner;

public class Pattern_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();


        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (i+j == n+1 || i==j){
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


//*				*
//    *		*
//       *
//    *		*
// *			*
