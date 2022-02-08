package com.DSA;

import java.util.Scanner;



public class Main {

    public static void display(int n, int r, int npr){
        System.out.println(n + "P"+ r + "="+ npr);
    }

    public static int fact(int x){ // function // which do the same work
           int rv = 1;

           for (int i=1; i<=x; i++){
                 rv*=i;
                                    }
                return rv;
                                     }



    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();

        int nfact = fact(n);

//        for (int i=1; i<=n; i++){
//            nfact*=i;
//        }

        int nmrfact = fact(n-r);

//        for (int i=1; i<=n-r; i++){
//            nmrfact *= i;
//        }

        int npr = nfact/nmrfact;
        display(n,r,npr);
    }
}

//in above code our for loop some part is repeating and in big programe this can
//create problem so we use function
//keeping same functionality in same container

//advantages are ->
//Modulatity inc -> DRY-> dont repeat yrself -> solve problem by breaking it in
//small parts

//resuseability increase

//Maintainability
//Maintanance better -> write code once and in other plase when it is needed
// we call it and it will do our work
