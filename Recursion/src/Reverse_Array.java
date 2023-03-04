import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner  in  =  new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = in.nextInt();
        int[] arr= new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        dsp_rrr(arr,0);
    }
    public static void dsp_rrr(int[] arr, int idx){
        if (idx== arr.length){
            return;
        }
        dsp_rrr(arr,idx+1);
        System.out.println(arr[idx]);

    }
}
