import java.util.Scanner;

public class Mic_Testing {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        int x = in.nextInt();

        int result = lastOccur(arr,0,x);
        System.out.println(result);
    }

    public static int lastOccur(int[] arr, int idx, int x){

        if(idx==arr.length){
            return -1;
        }

        int lisa = lastOccur(arr,idx+1,x);

        if(arr[idx]==x){
            return idx;
        }else{
            return lisa;
        }



    }
}
