import java.util.Scanner;

public class Matrix_Multiply {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter row of matrix_1");
        int r1 = in.nextInt();

        System.out.println("Enter col of matrix_1");
        int c1 = in.nextInt();

        int [][] m1 = new int[r1][c1];

        for (int i=0; i<m1.length; i++){
            for (int j=0; j<m1[i].length; j++){
                System.out.println("Enter value of "+i+ " * "+ j );
                m1[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter row of matrix_2");
        int r2 = in.nextInt();

        System.out.println("Enter col of matrix_2");
        int c2 = in.nextInt();

        int [][] m2 = new int[r2][c2];

        for (int i=0; i<m2.length; i++){
            for (int j=0; j<m2[i].length; j++){
                System.out.println("Enter value of "+i+ " * "+ j );
                m2[i][j] = in.nextInt();
            }
        }

        if (c1!=r2){
            System.out.println("Can't Multiply due to Row-Column Abnormally");
            return;
        }

        int [][] mult = new int[r1][c2];

        for (int i=0; i<mult.length; i++){
            for (int j=0; j<mult[i].length; j++){
                for (int k=0; k<c1 ;k++){
                    mult[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        display(mult);
          }

public static void display(int[][] matrix){

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
}

}
