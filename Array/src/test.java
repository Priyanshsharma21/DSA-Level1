import java.io.*;
import java.util.*;

public class test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

         char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'};

        int num =0;

        for(int i=0;i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(arr[num] + "\t");
                num++;
                System.out.print(num+"\t");
            }
            System.out.println("\t");
        }

    }
}
