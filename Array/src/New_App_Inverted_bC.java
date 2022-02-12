import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class New_App_Inverted_bC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        int count = 0;

        while(count!=0){
            for (int i=0 ;i<arr.length; i++){
                if (arr[i]==0){
                    System.out.print("\t");
                }else{
                    System.out.print("*\t");
                }
            }

        }


        }

    }

