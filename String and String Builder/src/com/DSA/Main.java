package com.DSA;

import java.util.Scanner;

public class Main {

//    String

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

//    Declearation

        String s1 = in.nextLine();

        System.out.println("You entered: "+s1);
        System.out.println("Length of it is : "+s1.length());
        System.out.println("value in of it is : "+s1.charAt(4));

//        Substring

        String name = "Priyansh sharma";

        System.out.println(name.substring(0,5));
        System.out.println(name.substring(3));

//        concinate

        System.out.println(s1+10+s1+20);

//        + +=
s1+='h';


//split

//        given an string

        String fname = "Priyansh,Shreyansh,Poonam,Sushil,Shakuntala";
        String[] parts = fname.split(",");

        for(int i=0; i< parts.length; i++){
            System.out.println(parts[i]);
        }










    }
}
