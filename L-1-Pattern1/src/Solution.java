import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = n;
        int st = 1;
        int sp = n-1;
        for (int i=1; i<=a; i++){
            System.out.print("@");
        }
        System.out.println();
        for (int i=1; i<=a; i++){
            for (int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=st; j++){
                System.out.print("*");
            }

            if (i<a/2+1){
                st++;
            }else {
                st--;
            }
            System.out.println();
        }
        for (int j = 1; j<sp; j++){
            System.out.print(" ");
        }
        for (int j=1; j<=a; j++){
            System.out.print("@");
        }
    }

}

