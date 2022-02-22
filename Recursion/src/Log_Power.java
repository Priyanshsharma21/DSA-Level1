import java.util.Scanner;

public class Log_Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = in.nextInt();
        System.out.println("Enter power:  ");
        int n = in.nextInt();

        int result = powerLog(x,n);
        System.out.println(result);
    }

    public static int powerLog(int x, int n){

        if (n==0){
            return 1;
        }

        int xpnb2 = powerLog(x,n/2);
        int xn = xpnb2 * xpnb2;

        if (n%2==1){
            xn = xpnb2 * xpnb2 * x;
            return xn;
        }

        return xn;
    }
}
