import java.util.Scanner;

public class Digit_frequency {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Enter number whose frequency you want: ");
        int comp = in.nextInt();

        int result = d_feq(n,comp);
        System.out.println(result);

    }


    public static int d_feq(int n, int comp){
        int rv=0;
        while (n>0){
            int dig = n%10;
            n/=10;

            if(dig==comp){
                rv++;
            }
        }
        return rv;
    }

}
