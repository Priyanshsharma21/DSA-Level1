import java.util.Scanner;

public class Display_Array_rec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = in.nextInt();
        int [] arr = new int[n];

        for (int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        dsp_array(arr,0);
    }

    public static void dsp_array(int[] arr, int idx){
        if (idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        dsp_array(arr,idx+1);

    }
}
