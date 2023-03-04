import java.util.Scanner;

public class Insersion_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        InsersionSort(arr);
        print(arr);
    }

    public static void InsersionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=i-1; j>=0; j--){

                if(isGreater(arr,j,j+1)){
                    swap(arr,j+1,j);
                }else{
                    break;
                }

            }

        }
    }

    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isGreater(int[] arr, int i, int j) {
        System.out.println("Comparing " + arr[i] + " and " + arr[j]);
        if (arr[i] > arr[j]) {
            return true;
        } else {
            return false;
        }
    }


    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
