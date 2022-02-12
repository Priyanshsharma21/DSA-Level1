package com.DSA;

import java.util.Scanner;

public class Subset_of_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<arr.length; i++){
            System.out.println("Enter element number #"+i);
            arr[i] = in.nextInt();
        }

        int limit = (int) Math.pow(2,arr.length); //8


        for (int i=0; i<limit; i++){ // 0-7

            String set = ""; // to print exact syntax
            int temp = i;

            for (int j=arr.length-1; j>=0; j--){ // 3-0
                int r = temp%2;
                temp/=2;

                if (r==0){
                    set = "-\t" +set;
                }
                else{
                    set = arr[j]+"\t" + set;
                }

            }
            System.out.println(set);


        }


    }



}
