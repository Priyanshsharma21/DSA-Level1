import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {

// write your code here
        Scanner in = new Scanner((System.in));
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}



//      * * * * *
//      * * * *
//      * * *
//      * *
//      *