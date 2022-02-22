package com.DSA;

import java.util.Scanner;

public class Spiral_Traversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = in.nextInt();
        System.out.println("Enter column: ");
        int col = in.nextInt();

        int[][] arr = new int[row][col];

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.println("Enter number "+i+" * "+j);
                arr[i][j] = in.nextInt();
            }
        }

        int minr = 0;
        int minc = 0;
        int maxr = arr.length-1;
        int maxc = arr.length-1;

        int total = row*col;
        int count = 0;

        while(count<=total){

//            lw
            for (int i=minr,j=minc; i<=maxr && count<=total; i++){
                System.out.println(arr[i][j]);
                count++;
            }

            minc++;

//            bw

            for (int j=minc,i=maxr; j<=maxc && count<=total; j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
//            rw

            for (int i=maxr,j=maxc; i>=minr && count<=total; i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
//            tw

            for (int j=maxc,i=minr; j>=minc && count<=total; j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;



        }





    }
}
