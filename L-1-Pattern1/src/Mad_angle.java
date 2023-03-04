
import java.util.Scanner;

public class Mad_angle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = 2*n-1;
        int sp = 0;
        int st2 = 1;
        int sp2= n-1;

        print_squre(n);
        System.out.println();
       print_utri(n,st,sp);
       System.out.println();
        printstri(n,st2,sp2);
        System.out.println();
        print_utri(n,st,sp);
        System.out.println();
        print_squre(n);


    }

    public static void print_squre(int n){
        for (int i=1; i<=n; i++){
            printStars(n);
        }
    }
    public static void print_utri(int n, int st, int sp){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=st; j++){
                System.out.print("*");
            }
            st-=2;
            sp++;
            System.out.println();
        }

    }

    public static void printstri(int n, int st2, int sp2){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=sp2; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=st2; j++){
                System.out.print("*");
            }
            sp2--;
            st2+=2;
            System.out.println();
        }

    }

    public static void printStars(int n){
        for(int i = 1 ; i <= n ;i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int n){
        for(int i = 1 ; i <= n ;i++){
            System.out.print(" ");
        }
    }
}