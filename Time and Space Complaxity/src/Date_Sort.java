import java.io.*;
import java.util.*;

public class Date_Sort {

    public static void sortDates(String[] arr) {
        countSort(arr,1000000,100,32);
        countSort(arr,10000,100,13);
        countSort(arr,1,10000,2501);
    }

    public static void countSort(String[] arr,int div, int mod, int range) {
        String[] ans = new String[arr.length];
        int[] farr = new int[10];

        for (int i=0;i<arr.length;i++){
            farr[Integer.parseInt(arr[i],10) / div%mod]--;
        }

        for (int i=1; i<farr.length; i++){
            farr[i] = farr[i] + farr[i-1];
        }

        for(int i=arr.length;i>=0;i--){
            int val = Integer.parseInt(arr[i]);
            int pos = farr[Integer.parseInt(arr[i],10)/div%mod]-1;;
            int idx = pos-1;
            ans[idx] = String.valueOf(val);
            farr[Integer.parseInt(arr[i],10)/div%mod]--;

        }

        for(int i=0; i<ans.length; i++){
            arr[i] = ans[i];
        }


        System.out.print("After sorting on " + div + " place -> ");
        print(arr);
    }

    public static void print(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String str = scn.next();
            arr[i] = str;
        }
        sortDates(arr);
        print(arr);
    }

}