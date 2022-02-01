import java.util.Scanner;

public class Decimal_2_base {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Enter a base: ");
        int b =in.nextInt();

        int result = converter(n,b);
        System.out.println(result);


    }

    public static int converter(int n, int b){
        int rv = 0;
        int power = 0;


        while(n>0){
            int dig = n%b; // 634%8 = 2 // 79%8 = 7 // 9%8 = 1 // 1
            n/=b; // 634/8 = 79 // 79/8 = 9 // 9/8 = 1

            rv = (int) (rv + dig * Math.pow(10,power));
            //0 + 2 * 10^0 = 2 // 2+ 7 *10^1 =  79 // 79+1*10^2 = 179 // 1179
            power++; // 0 // 1 // 2 // 3.

//            or

//            rv = dig*power;
//            power*=10;
        }

        return rv;
    }





}
