import java.util.Scanner;

public class Shell_Rotate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter row : ");
        int row = in.nextInt();
        System.out.println("Enter column: ");
        int col = in.nextInt();

        int[][] arr = new int[row][col];

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.println("Enter "+i+" * "+j);
                arr[i][j] = in.nextInt();
            }
        }
        int s = in.nextInt();
        int r = in.nextInt();

        rotateShell(arr,s,r);
        display(arr);

    }

    public static void rotateShell(int[][] arr, int s, int r){
        int[] one_d = fillOnedFromShell(arr,s); // 2d to 1d
        rotate(one_d,r); // rotate 1d
        fillShellFromOned(one_d,s,arr); // 1d to 2d
    }





    public static int[] fillOnedFromShell(int[][] arr,  int s){
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;

int size = 2 * (maxc - minc + maxr -minr);
int oned[] = new int[size];
        int idx = 0;


//        lw
        for (int i=minr,j=minc; i<= maxr; i++){
            oned[idx] = arr[i][j];
            idx++;
        }

        minc++;

//        bw

        for (int i = maxr, j=minc + 1; j<=maxc;j++){
            oned[idx] = arr[i][j];
            idx++;
        }

        maxc--;

//        rw
        for (int i=maxr-1,j=maxc ;i>=minr; i--){
            oned[idx] = arr[i][j];
            idx++;
        }
maxc--;
//        tw

        for (int i=minr,j=maxc - 1; j>=minc+1 ;j--){
            oned[idx] = arr[i][j];
            idx++;
        }

        minr++;

        return oned;
    }

    public static void fillShellFromOned(int [] oned, int s, int[][] arr){

        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;


        int idx = 0;
        for (int i=minr,j=minc; i<= maxr; i++){
          arr[i][j]=oned[idx];
            idx++;
        }

        minc++;

//        bw

        for (int i = maxr, j=minc + 1; j<=maxc;j++){
            arr[i][j]=oned[idx];
            idx++;
        }

        maxr--;

//        rw
        for (int i=maxr-1,j=maxc ;i>=minr; i--){
            arr[i][j]=oned[idx];
            idx++;
        }

        maxc--;

//        tw

        for (int i=minr,j=maxc - 1; j>=minc+1 ;j--){
            arr[i][j]=oned[idx];
            idx++;
        }
        minr++;

    }


    public static void rotate(int[] oned,int r){
        r = r % oned.length;

        if (r<0){
            r = r + oned.length;
        }

        reverse(oned, 0, oned.length-r-1);
        reverse(oned, oned.length-r, oned.length-1);
        reverse(oned, 0 , oned.length-1);
    }

    public static void reverse(int[] arr,int li, int ri){
        while(li<ri){
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;

            li++;
            ri--;
        }
    }


//display

    public static void display(int[][] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }


}
