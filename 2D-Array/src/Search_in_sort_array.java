import java.util.Scanner;

public class Search_in_sort_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = in.nextInt();
        System.out.println("Enter column: ");
        int col = in.nextInt();

        int [][] arr = new int[row][col];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length;j++){
                System.out.println(i+" * "+j);
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("What you wanna search: ");
        int search = in.nextInt();

        int i = 0;
        int j = arr[0].length-1;
        while(i<arr.length && j>=0){
            if (search==arr[i][j]){
                System.out.println(i);
                System.out.println(j);
            }else if (search<arr[i][j]){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("Invalided output");


    }



}
