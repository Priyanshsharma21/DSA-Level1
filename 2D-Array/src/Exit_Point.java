import java.util.Scanner;

public class Exit_Point {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int r = in.nextInt();
        int c = in.nextInt();

        int[][] arr = new int[r][c];

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.println("Enter value "+ i + " * "+j);
                arr[i][j] = in.nextInt();
            }
        }

        int dir = 0;
        int i=0;
        int j=0;

        while(true){
            dir = dir + arr[i][j] % 4;

            if (dir==0){ // east
                j++;
            }
            else if (dir==1) { // south
                i++;
            }

            else if (dir==2) { // west
                j--;
            }

            else if (dir==3) { // north
                i--;
            }

//            exit point
            if (i<0){
                i++;
                break; // i cross north // means i = -1 , j = 0 // (-1,0)
            }
            else if (j<0){ // j cross east // means i = 0 and j = -1 // (0,-1)
                j++;
                break;
            }
            else if (i==arr.length){ //i cross south//  i = 3 ,j = 4
                i--;
                break;
            }
            else if (j==arr[0].length){ // j cross west // i = 4 , j = 3
                j--;
                break;
            }


        }
        System.out.println(i);
        System.out.println(j);
    }
}
