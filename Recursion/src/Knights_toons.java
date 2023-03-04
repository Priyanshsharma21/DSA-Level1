import java.util.Scanner;

public class Knights_toons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int r = in.nextInt();

        int[][] arr = new int[n][n];
        knightTour(arr,r,c,1);
    }

    public static void knightTour(int[][] arr, int r,int c,int move){

        if (c<0 || r<0 || c>=arr.length || r>=arr.length || arr[r][c]>0){
            return;
        }
        else if(move==arr.length*arr.length){
            arr[r][c]=move;
            display(arr);
            arr[r][c]=0;
            return;
        }

        arr[r][c]=move;
        knightTour(arr,r-2,c+1,move+1);
        knightTour(arr,r-1,c+2,move+1);
        knightTour(arr,r+1,c+2,move+1);
        knightTour(arr,r+2,c+1,move+1);
        knightTour(arr,r+2,c-1,move+1);
        knightTour(arr,r+1,c-1,move+1);
        knightTour(arr,r-1,c-2,move+1);
        knightTour(arr,r-2,c-2,move+1);

    }

    public static void display(int[][] arr){

        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length;j++){
                System.out.println(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }


}
