import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = in.nextInt();
        System.out.println("Enter its power: ");
        int n = in.nextInt();

       int result =  power(x,n);
        System.out.println(result);

    }

    public static int  power(int x, int n){

        if (n==0){
            return  1;
        }

        int pnm1 = power(x,n-1);
        int xn = x * pnm1;
        return xn;

    }
}
