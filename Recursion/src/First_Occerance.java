import java.util.Scanner;

public class First_Occerance {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        int x = in.nextInt();

        int result = firstOccur(arr,0,x);
        System.out.println(result);
    }

    public static int firstOccur(int[] arr, int idx, int x){

        if (idx == arr.length){
            return -1;
        }

        if (arr[idx] == x){
            return idx;
        }else{
            int fisa = firstOccur(arr,idx+1,x);
            return fisa;
        }



    }
}
