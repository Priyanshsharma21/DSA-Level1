import java.util.Scanner;

public class Partion_of_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int p = in.nextInt();
        for(int i=0; i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        partition(arr,p);
        print(arr);
    }
    public static void partition(int[] arr,int p){

        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i]>p){
                i++;
            }else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }



    }
        }