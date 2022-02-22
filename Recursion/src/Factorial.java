import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int result = fact(n);
        System.out.println(result);
    }

    public static int fact(int n){

        if(n==1){
            return 1;
        }

       int rv =  n * fact(n-1);
        return rv;
    }
}
