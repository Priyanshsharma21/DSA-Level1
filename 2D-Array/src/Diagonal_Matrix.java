import java.util.Scanner;

public class Diagonal_Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = in.nextInt();
        System.out.println("Enter column: ");
        int col = in.nextInt();

        int[][] arr = new int[row][col];

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.println("Enter "+i+ " * "+j);
                arr[i][j] = in.nextInt();
            }
        }

        for (int g=0; g<arr.length; g++){
            for (int i=0,j=g; j<arr.length; i++,j++){
                System.out.println(arr[i][j]);
            }
        }







    }

}
