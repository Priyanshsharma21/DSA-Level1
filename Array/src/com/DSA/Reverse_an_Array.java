package com.DSA;

import java.util.Scanner;

public class Reverse_an_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<arr.length; i++){
            System.out.println("Element number # "+i);
            arr[i] = in.nextInt();
        }

        reverse(arr);
        display(arr);
    }

    public static void display(int[] arr){
        for (int i=0 ;i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j] ;
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
