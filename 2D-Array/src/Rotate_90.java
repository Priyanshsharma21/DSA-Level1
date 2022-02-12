import java.util.Scanner;

public class Rotate_90 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter row and column: ");
        int n = in.nextInt();


        int[][] arr = new int[n][n];

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.println("Enter "+i+" * "+j);
                arr[i][j] = in.nextInt();
            }
        }

//        Transpose
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr[i].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

//        reverse row

        for (int i=0; i<arr.length; i++){
            int li = 0;
            int ri= arr.length-1;

            while(li<ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }

        display(arr);

    }
//    Display function


    public static void display(int[][] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }














}
