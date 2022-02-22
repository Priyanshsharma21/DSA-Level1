import java.util.Scanner;

public class Print_Dec_Inc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        printInc_Dec(n);
    }
    public static void printInc_Dec(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printInc_Dec(n-1);
        System.out.println(n);



    }
}
