package com.DSA;

import java.util.Scanner;

public class fIndex_lIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<arr.length; i++){
            System.out.println("Enter element #"+i);
            arr[i] = in.nextInt();
        }
        System.out.println("Enter Number to search: ");
        int n2 = in.nextInt();

        int hi = arr.length-1;
        int lo = 0;
        int fi = -1;

        while(lo<=hi){
            int mid = lo+hi/2;

            if(n2>arr[mid]){
                lo = mid+1;
            }
            else if(n2<arr[mid]){
               hi = mid-1;
            }
            else{
                fi = mid;
                hi = mid - 1;
            }

        }
        System.out.println(fi);

        hi = arr.length-1;
        lo = 0;
        int li = -1;

        while(lo<=hi){
            int mid = lo+hi/2;

            if(n2>arr[mid]){
                lo = mid+1;
            }
            else if(n2<arr[mid]){
                hi = mid-1;
            }
            else{
                li = mid;
                lo = mid + 1;
            }

        }
        System.out.println(li);
    }
}
