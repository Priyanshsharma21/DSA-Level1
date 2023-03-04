import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        selectionSort(arr);
        print(arr);
    }

    public static void selectionSort(int[] arr){
        for(int i=0,min=i; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(isSmaller(arr,j,min)){
                  min = j;
                }
            }
            swap(arr,i,min);
        }
    }

    public static void swap(int[] arr, int i, int j){
        System.out.println("Swapping value of"+arr[i]+"with"+arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isSmaller(int[] arr,int i,int j){
        System.out.println("Comparing "+arr[i]+"with"+arr[j]);

        if (arr[i]<arr[j]){
            return true;
        }
        else{
            return false;
        }
    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }







}
