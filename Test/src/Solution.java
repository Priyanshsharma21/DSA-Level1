import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = n;
        int sp = -1;
        int os = 0;
        int is = n/2+1;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            for (int j=1; j<=st; j++){
                System.out.print("*\t");
            }

            if (i<n/2){
                st-=2;
                sp+=2;
            }else{
                st+=2;
                sp-=2;
            }
            System.out.println();
        }


    }

}