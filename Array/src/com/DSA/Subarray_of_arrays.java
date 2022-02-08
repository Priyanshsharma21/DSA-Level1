package com.DSA;

import java.util.Scanner;

public class Subarray_of_arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of subarray: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<arr.length; i++){
            System.out.println("Enter element #"+i);
            arr[i] = in.nextInt();
        }

        subarray(arr);

    }

    public static void subarray(int[] arr){

        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                for (int k=i; k<=j; k++){
                    System.out.print(arr[k]+"\t");
                }
                System.out.println();
            }
        }
    }
}
