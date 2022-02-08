package com.DSA;

import java.util.Scanner;

public class Floor_Ceil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n1 = in.nextInt();
        int[] arr = new int[n1];


        for (int i=0; i<arr.length; i++){
            System.out.println("Enter number #"+i);
            arr[i] = in.nextInt();
        }
        System.out.println("Enter floor-ceil number: ");
        int n2 = in.nextInt();

//                     10     20     30     40     50     60     70

        int high = arr.length-1; // 6 // 2
        int low = 0; // 0
        int ceil = 0;
        int floor = 0;

       while(low<=high){ // 0<=6 //
           int mid = low+high/2; // 3


           if (n2<arr[mid]){ // 36
               high = mid-1; // 2
               ceil = arr[mid]; // 40
           }
           else if (n2>mid){
               low = mid+1;
               floor = arr[mid];
           }
           else{
               ceil =arr[mid];
               floor = arr[mid];
               break;
           }
       }
        System.out.println(ceil);
        System.out.println(floor);

    }
}
