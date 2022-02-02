package com.DSA;

import java.util.Scanner;

public class Find_element_in_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of your array: " );
        int n1 = in.nextInt();
        System.out.println("Enter "+n1+ " Elements in array:");
        int[] arr = new int[n1];

        for (int i=0; i<arr.length; i++){
            System.out.println("Enter element number #"+i);
            arr[i] = in.nextInt();
        }
        System.out.println("Enter number whose index you want:");
        int n2 = in.nextInt();
        int ind = -1;
        for (int i=0; i< arr.length; i++){
            if (arr[i] == n2){
                System.out.println("Element present at:"+i);
            }else {
                System.out.println(ind);
            }
        }



    }
}
