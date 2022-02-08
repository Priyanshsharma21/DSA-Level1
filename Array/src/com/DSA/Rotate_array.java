package com.DSA;

import java.util.Scanner;

public class Rotate_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Enter the value of K:");
        int k = in.nextInt();

        int[] arr = new int[n];
        for (int i=0; i< arr.length; i++){
            System.out.println("Element number #"+i);
            arr[i] = in.nextInt();
        }
        rotate(arr,k);
        display(arr);

    }
    public static void display(int[] arr){
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void reverse(int[] arr, int i, int j){
        int li = i;
        int ri = j;

        while (li < ri){
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }
    }

    public static void rotate(int[] arr, int k){

        k = k%arr.length;
        if (k<0){
            k = k + arr.length;
        }
//        part1
        reverse(arr, 0, arr.length-k-1);

//        part2
        reverse(arr, arr.length-k, arr.length-1);

//        all
        reverse(arr, 0, arr.length-1);


    }
}
