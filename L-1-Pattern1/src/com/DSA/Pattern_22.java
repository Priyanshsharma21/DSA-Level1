package com.DSA;

import java.util.Scanner;

public class Pattern_22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();

        for (int i =1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (i==1){
                    if (j==1 || j>=n/2+1){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }

                else if (i<=n/2){
                    if (j==1 || j==n/2+1){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }

                else if (i==n/2+1){
                    System.out.print("*\t");
                }

                else if (i<n){
                    if (j==n/2+1 || j==n){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }

                else{
                    if (j<=n/2+1 || j==n){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }

    }
}
