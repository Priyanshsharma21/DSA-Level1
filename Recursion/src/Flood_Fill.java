import java.util.Scanner;

public class Flood_Fill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = in.nextInt();
            }
        }

        boolean [][] visited = new boolean[n][m];
        floodfill(arr,0,0,"",visited);

    }
    public static void floodfill(int[][] arr,int row,int col,String psf,boolean [][] visited){

        if (row<0 || col<0 || row==arr.length || col==arr[0].length || arr[row][col]==1 || visited[row][col]==true){
            return;
        }

        if ((row==arr.length-1)&&(col==arr.length-1)){
            System.out.println(psf);
            return;
        }
        visited[row][col]=true;
        floodfill(arr,row-1,col,psf + 't',visited);
        floodfill(arr,row+1,col,psf + 'd',visited);
        floodfill(arr,row,col-1,psf + 'l',visited);
        floodfill(arr,row,col+1,psf + 'r',visited);
        visited[row][col]=false;



    }
}
