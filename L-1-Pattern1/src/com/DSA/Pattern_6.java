package com.DSA;

import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number Of Star row you wanna print: ");
        int n = in.nextInt();

        int st = n/2+1;
        int sp = 1;

        for (int i=1; i<=n; i++){
//            System.out.println(st+ "," + sp + ","+ st);

            for (int j=1; j<=st; j++){
                System.out.print("*\t");
            }

            for (int j=1; j<=sp; j++){
                System.out.print("\t");
            }

            for (int j=1; j<=st; j++){
                System.out.print("*\t");
            }




            if (i<=n/2){
                st--;
                sp+=2;
            }
            else {
                st++;
                sp-=2;
            }
            System.out.println();
        }





    }
}


//     * * *   * * *
//     * *       * *
//     *           *
//     * *       * *
//     * * *   * * *