import java.util.Scanner;

public class Bar_chart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+" Elements in array");
        for (int i=0; i< args.length; i++){
            System.out.println("Enter element #"+i);
            arr[i] = in.nextInt();
        }

        int max = arr[0];
        for (int i=0; i< arr.length; i++){
           if (arr[i]>max){
               max = arr[i];
           }
        }

        for (int floor = max; floor>=1;floor--){
            for (int j=0; j<arr.length; j++){
                if (arr[j]>=floor){
                    System.out.println("*\t");
                }else{
                    System.out.println("\t");
                }
            }
            System.out.println();
        }

    }
}
