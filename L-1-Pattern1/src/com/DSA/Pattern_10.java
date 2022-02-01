package com.DSA;

import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int os = n/2;
        int is = -1;
        int st=  1;


        for (int i=1; i<=n; i++){
//            System.out.println(os + "," + is);

            for (int j=1; j<=os; j++){
                System.out.print("\t");
            }
            System.out.print("*\t"); // thid one is for 1-last row one *


            for (int j=1; j<=is; j++){
                System.out.print("\t");
            }

            if (i>1 && i< n ){
                System.out.print("*\t"); // this one is for b/w *
            }

            if (i<=n/2){
                os--;
                is+=2;
            }
            else {
                os++;
                is-=2;
            }
            System.out.println();

        }




    }

}


//        *
//      *   *
//     *     *
//      *   *
//        *

//  os in
//  2 -1
//  1  1
//  0  3
//  1  1
//  2 -1
