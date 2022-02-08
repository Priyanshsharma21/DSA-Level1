package com.DSA;

import java.util.Scanner;

public class Base_Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number1 = in.nextInt();
        System.out.println("Enter a number: ");
        int number2 = in.nextInt();
        System.out.println("Enter a base: ");
        int base = in.nextInt();
        int result = product(number1,number2,base);
        System.out.println(result);
    }


    public static int product(int num1, int num2, int base){ // num1 = 2156 // num2 = 74 // base = 8
        int rv = 0;
        int p = 1;

        while(num2>0){
            int dig = num2%10; // 4 // 7
            num2/=10; // 7 // 0

            int sprd = multiply_single_digit(num1,dig,base);
            rv = add(rv , sprd * p , base);
            p *=10; // this will increase the sum by one value
        }




        return rv;
    }

    public static int multiply_single_digit(int num1, int dig2, int base){
        int rv = 0;
        int power = 0;
        int c = 0;

        while (num1>0 || c>0){

            int dig1 = num1%10; // 2156 // 6 // 5 // 1 // 2
            num1/=10; // 215 //21 // 2

            int dig = dig1 * dig2 + c; // 6 * 4 = 24 // 5 * 4 + c = 20 // 1 * 4 + c = 4 // 2 * 4 + c = 8

             dig = dig1%base; // 24 % base = 24 % 8 = 0
             c= dig1/base; // 24 / 8 = 3

             rv = (int) (rv + dig * Math.pow(10,power));
             power ++;

        }

        return rv;
    }


    public static int add(int num1, int num2, int base){
        int rv = 0;
        int power = 0;
        int carry = 0;

        while(num1>0 || num2>0 || carry>0){
            int dig1 = num1%10; // 236 % 10 = 6
            int dig2 = num2%10; // 754 % 10 = 4

            num1/=10; // 236 / 10 = 23
            num2/=10; // 754 / 10 = 75

            int dig = dig1 + dig2 + carry; // 6 + 4 + 0 = 10
            carry = dig/base; // 10 / 8 = 1
            dig = dig%base; // 10 % 8 = 2

            rv = (int) (rv + dig * Math.pow(10,power));
            power++;
//            rv+= dig * power;
//            power = power * 10;
        }
        return rv;


    }







}
