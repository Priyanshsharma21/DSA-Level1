package com.DSA;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Take Input of number
        System.out.println("Enter a number: ");
        int n =in.nextInt();
        int digit_count = 0;

//        loop till n!=0

        while (n!=0){
            n/=10;
            digit_count++;
        }
        System.out.println("Number Of Digit In The Number Are: ");
        System.out.println(digit_count);

    }
}
