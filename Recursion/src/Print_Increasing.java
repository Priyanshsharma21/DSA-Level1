import java.util.Scanner;

public class Print_Increasing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        if (n==0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
}
