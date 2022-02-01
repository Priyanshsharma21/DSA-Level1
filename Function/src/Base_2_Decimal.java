import java.util.Scanner;

public class Base_2_Decimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Enter a base: ");
        int b = in.nextInt();
        int result = converter(n,b);
        System.out.println(result);
    }

    public static int converter(int n,int b){
        int rv=0;
        int power = 0;

        while (n>0){
            int base = n%10;
            n/=10;

            rv = (int) (rv + base * Math.pow(b,power));
            power++;

        }



        return rv;

    }
}
