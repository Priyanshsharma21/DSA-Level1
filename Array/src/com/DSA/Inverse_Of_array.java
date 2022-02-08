package com.DSA;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Inverse_Of_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            System.out.println("Enter element number #"+i);
            arr[i] = in.nextInt();
        }
       int [] invarr =  inverse(arr);
        display(invarr);
    }


    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }


    public static int[] inverse(int[] arr){
        int[] inv = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            int v = arr[i];
            inv[v] = i;
        }
        return inv;
    }
    }
