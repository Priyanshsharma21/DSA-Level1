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


    public static int product(int num1, int num2, int base){
        int rv = 0;
        int p = 1;

        while(num2>0){
            int dig = num2%10;
            num2/=10;

            int sprd = multiply_single_digit(num1,num2,base);
            rv = add(rv , sprd * p , base);
            p *=10;
        }




        return rv;
    }

    public static int multiply_single_digit(int num1, int num2, int base){
        int rv = 0;
        int power = 0;
        int c = 0;

        while (num1>0 || c>0){

            int dig1 = num1%10;
            num1/=10;

            int dig = dig1 * num2 + c;

             dig = dig1%base;
             c= dig1/base;

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
