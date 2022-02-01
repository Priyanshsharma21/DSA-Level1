package com.DSA;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.println("Enter number one: ");
    int num1 = in.nextInt(); // 36
        System.out.println("Enter number two: ");
    int num2 = in.nextInt(); // 24

        int onum1 = num1; // 36
        int onum2 = num2; // 24

    while (num1%num2!=0){
        int rem = num1 % num2; // 36%24 = 12
        num1=num2; // 24 = divodant
        num2=rem; // 12 become divisor
//        this run till 0 reminder
    }
    int hcf = num2;

    int lcm = (onum1*onum2)/hcf;

        System.out.println("HCF is :"+hcf);
        System.out.println("LCM is :"+lcm);


    }
}
