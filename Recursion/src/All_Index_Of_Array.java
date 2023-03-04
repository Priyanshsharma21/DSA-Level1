import java.util.Scanner;

public class All_Index_Of_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Element to find: ");
        int x = in.nextInt();

        int[] iarr = allIndex(arr,x,0,0);
        System.out.println(iarr);

    }

    public static int[] allIndex(int[] arr, int x, int idx, int fsf){
        if (idx==arr.length){
            return new int[fsf];
        }

        if (arr[idx] == x){
           int[] iarr =  allIndex(arr,x,idx+1,fsf+1);
           iarr[fsf] = idx;
           return iarr;
        }
        else{
            int[] iarr = allIndex(arr,x,idx+1,fsf);
            return iarr;
        }

    }
}
