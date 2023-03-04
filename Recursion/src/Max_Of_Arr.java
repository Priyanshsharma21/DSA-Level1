import java.util.Scanner;

public class Max_Of_Arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = in.nextInt();
        int [] arr = new int[n];

        for (int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        int max = max_Arr(arr,0);
        System.out.println(max);
    }

    public static int max_Arr(int[] arr,int idx){
        if (idx==arr.length-1){
            return arr[idx];
        }

        int misa = max_Arr(arr,idx+1); //index of smaller array
        if (misa > arr[idx]){
            return misa;
        }else{
            return arr[idx];
        }
    }
}
