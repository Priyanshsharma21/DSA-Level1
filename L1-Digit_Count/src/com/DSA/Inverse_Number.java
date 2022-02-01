package com.DSA;

import java.util.Scanner;

public class Inverse_Number {

        public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.println("Enter a Number: ");
                int number = input.nextInt();

                int inverted = 0;
                int power = 1;

                while(number!=0){
                        int dig = number%10; // by this we ger what number present on which position // number extract kar lea
                        int ip = dig; // 3 // 5 // 4 // 1 // 2 // copy bana le
                        int id = power; // 1 // power ke copy bana le

                        inverted = inverted+id * (int) (Math.pow(10,ip-1));
                        // 0+1*(10^3-1) = 0+1*(10^4-1) = 1 at 3 == 100
                        // 0+2*(10^3-1) = 0+2 *(10^5-1) = 2 at 5 == 20100
                        // 0+1*(10^3-1) = 0+3*(10^4-1) == 3000 == 23100
                        // 0+1*(10^3-1) = 0+4*(10^1-1) == 4 == 23104
                        // 0+1*(10^3-1) = 0+5*(10^2-1) == 50 == 23154
                        // 0+1*(10^3-1)

                        number/=10; // making number small in every iteration
                        power++;
                }
                System.out.println(inverted);
        }
}