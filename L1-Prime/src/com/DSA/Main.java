package com.DSA;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        no of cases we want is t
        int t;
        System.out.println("How many numbers You Want To Check:");
        t = in.nextInt();
        System.out.println("Enter "+t+" Numbers");

        for (int i=1; i<=t; i++){
            int number = in.nextInt();
            int count=0;
            for (int j = 1; j<number ; j++){
                if (number%j==0){
                    count++;
                }

            }
            if (count==2){
                System.out.println("Its a prime number");
            }
            else{
                System.out.println("Its not prime number");
            }

        }

    }
}
//Question ->Take number of cases and Print number is prime or not if prime then print its prime

//Approach ->
//1. Take a variable t for cases , A variable N for number and bool flag or int count
//2. take input from user (cases) ex - 3 so our loop run from 1-t(3) and take number input
//3. if number is equal to 1-number
//we will check number%i==0 means number is weather divisible by previous numbers or not if yes then choice++ or flag = false and break
//if number not divisible by all number less than it then it is prime otherwise not