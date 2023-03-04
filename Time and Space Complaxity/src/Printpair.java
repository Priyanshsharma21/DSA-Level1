import java.io.*;
import java.util.*;

public class Printpair {

    public static void targetSumPair(int[] arr, int target){

        Arrays.sort(arr);
        int lf = 0;
        int ri = arr.length-1;
        while(lf<ri){
            if(arr[lf]+arr[ri]>target){
                ri--;
            }else if(arr[lf]+arr[ri]<target){
                lf++;
            }else{
                System.out.println(arr[lf]+" , "+arr[ri]);
                lf++;
                ri--;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i < n; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        targetSumPair(arr,target);
    }

}