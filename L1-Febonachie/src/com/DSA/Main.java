package com.DSA;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a=0,b=1;
    Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of cases: ");
        int n = in.nextInt();

    for (int i=0; i<n; i++){
        System.out.println(a);
        int c = a+b;
        a=b;
        b=c;
    }
    }
}
