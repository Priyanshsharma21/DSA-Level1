package com.DSA;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Marks: ");
	int marks = input.nextInt();
    if (marks>90){
        System.out.println("Excellent");
    }
    else if (marks>80 && marks<=90){
        System.out.println("Good");
    }
    else if (marks>70 && marks<=80) {
        System.out.println("Fair");
    }
    else if (marks>60 && marks<=70) {
        System.out.println("Meets Expectation");
    }
    else if (marks<=60) {
        System.out.println("Below Par");
    }
    }
}
