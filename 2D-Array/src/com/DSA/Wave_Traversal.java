package com.DSA;

import java.util.Scanner;

public class Wave_Traversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int r = in.nextInt();
        System.out.println("Enter column: ");
        int c = in.nextInt();

        int[][] mtx = new int[r][c];

        for (int i=0; i<mtx.length; i++){
            for (int j=0; j<mtx[i].length; j++){
                System.out.println("Enter number "+i+" * "+j);
                mtx[i][j] = in.nextInt();
            }
        }

        for (int j=0; j<mtx[0].length; j++){
            if (j%2==0){
                for (int i=0; i<mtx.length; i++){
                    System.out.println(mtx[i][j]);
                }
            }else{
                for (int i=mtx.length-1; i>=0; i--){
                    System.out.println(mtx[i][j]);
                }
            }
        }
        System.out.println();


    }
}
