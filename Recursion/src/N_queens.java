import java.util.Scanner;

public class N_queens {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        nqueen(arr,"",0);
    }
    public static void nqueen(int[][] arr,String qsf,int row){

        if (row==arr.length){
            System.out.println(qsf);
            return;
        }

//        note-> Level-> row comes as parameter and col(iteration comes in loop)

        for(int col=0; col<arr.length; col++){

            if(isMaharaniSafe(arr,row,col)==true){
                arr[row][col] = 1;
                nqueen(arr,qsf+row+"-"+col+",",row+1);
                arr[row][col]=0;
            }

        }
    }

    public static boolean isMaharaniSafe(int[][] arr,int row,int col){

//        vertically check
        for(int i=row-1,j=col; i>=0; i--){
            if (arr[i][j] == 1) {
                return false;
            }
        }


//        left digonal

        for(int i=row-1,j=col-1;i>=0 &&j>=0; i--,j--){
            if (arr[i][j]==1){
                return false;
            }
        }

//        right digonal

        for(int i=row-1,j=col+1;i>=0 && j<arr.length; i--,j++){
            if (arr[i][j]==1){
                return false;
            }
        }

        return true;

    }
}
