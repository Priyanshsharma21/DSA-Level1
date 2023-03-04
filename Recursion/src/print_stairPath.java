import java.util.Scanner;

public class print_stairPath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        printSS(n,"");
    }

    public static void printSS(int n, String path){
        if (n<0){
            return;
        }

        if (n==0){
            System.out.println(path);
            return;
        }

        printSS(n-1,path + '1');
        printSS(n-2, path + '2');
        printSS(n-3, path + '3');

    }
}
