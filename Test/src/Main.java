import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i=0; i<n; i++){
            printStars(n);
            printSpaces(n/2);
            printStars(2*n-1);
            printSpaces(n/2);
            printStars(n/2);
            printSpaces(n/2);
            printStars(2*n-1);
            printSpaces(n/2);
            printStars(n);

        }



    }

    public static void printStars(int n){
        for(int i = 1 ; i <= n ;i++){
            System.out.print("*");
        }
    }

    public static void printSpaces(int n){
        for(int i = 1 ; i <= n ;i++){
            System.out.print(" ");
        }
    }
}