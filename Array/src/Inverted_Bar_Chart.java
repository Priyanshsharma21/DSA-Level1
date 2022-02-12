import java.util.Scanner;

public class Inverted_Bar_Chart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }


        for (int floor = max; floor>=0; floor--){
            for(int j = 0; j<arr.length; j++){
                if (arr[j] <= floor){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }


    }
}
