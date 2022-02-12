package com.DSA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter row size: ");
        int row = in.nextInt();
        System.out.println("Enter column size: ");
        int col = in.nextInt();

        int[][] arr = new int[row][col];

        for (int i=0; i<row ;i++){
            for (int j=0; j<col; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
