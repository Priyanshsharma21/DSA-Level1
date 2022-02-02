package com.DSA;

import java.util.Scanner;

public class Sum_of_two_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of number: ");
        int n1= in.nextInt();
        int[] arr1 = new int[n1];
        for (int i=0; i<arr1.length; i++){
            System.out.println("Enter array number #"+i);
            arr1[i] = in.nextInt();
        }

        System.out.println("Enter size of second number: ");
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        for (int i=0; i<arr2.length; i++){
            System.out.println("Enter array number #"+i);
            arr2[i] = in.nextInt();
        }

        int[] sum = new int[n1>n2?n1:n2]; // if n1>n2 then n1 else n2

        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = sum.length-1;
        int carry = 0;

        while (k>=0){
            int dig = carry;

            if (i>=0){
                dig = dig + arr1[i];
            }

            if (j>=0){
                dig = dig + arr2[j];
            }

            carry = dig/10;
            dig = dig%10;

            sum[k] = dig;

            i--;
            j--;
            k--;

                    }
        System.out.println("Sum of two number is: ");
        if (carry!=0){
            System.out.println(carry);
        }

        for (int var : sum){
            System.out.println(var);
        }
    }
}
