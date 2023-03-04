import java.util.Scanner;

public class Linear_Coordinates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1= new int[n];
        int[] arr2 = new int[n];
        for (int i=0; i< arr1.length; i++){
            arr1[i] = in.nextInt();
            arr2[i] = in.nextInt();
        }

        int check1 = 1;
        for (int i=1; i<arr1.length; i++){
            int prev = arr1[i-1];
            if (arr1[i] != prev){
                check1 = 0;
                break;
            }
        }
        if (check1==1){
            System.out.println("Yes");
            return;
        }

        int check2 = 1;
        for (int i=1; i<arr2.length; i++){
            int prev = arr1[i-1];
            if (arr1[i] != prev){
                check2 = 0;
                break;
            }
        }
        if (check2==1){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
