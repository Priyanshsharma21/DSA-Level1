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
                break; // i cross north
            }
            else if (j<0){ // j cross south
                j++;
                break;
            }
            else if (i==arr.length){ //i cross west
                i--;
                break;
            }
            else if (j==arr[0].length){ // j cross east
                j--;
                break;
            }


        }
        System.out.println(i);
        System.out.println(j);
    }
}
