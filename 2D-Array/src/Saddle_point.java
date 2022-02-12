import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Saddle_point {
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



        for (int i=0; i<arr.length;i++){
            int svj = 0;
            for (int j=1; j<arr[0].length; j++){
                if (arr[i][j]<arr[i][svj]){
                    svj = j;
                }
            }

            boolean flag = true;
            for (int k=0; k<arr.length;k++){
                if (arr[k][svj]>arr[i][svj]){
                    flag=false;
                    break;
                }
            }

            if (flag==true){
                System.out.println(arr[i][svj]);
                return;
            }
        }
        System.out.println("Invailed input");

        }



}
