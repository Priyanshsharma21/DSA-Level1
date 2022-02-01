import java.util.Scanner;

public class Base_2_Base {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = in.nextInt();
        System.out.println("Enter its base:");
        int base1 = in.nextInt();
        System.out.println("Convert this number to base:");
        int base2 = in.nextInt();


        int base_2_deci = base_2_deci_converter(num1,base1);
        int deci_2_base = deci_2_base_converter(base_2_deci,base2);
        System.out.println(deci_2_base);
    }

    public static int base_2_deci_converter(int num1,int base1){
        int rv1 = 0;
        int power = 0;

        while(num1>0){
            int dig1 = num1%10;
            num1/=10;
            rv1 = (int) (rv1 + dig1 * Math.pow(base1,power));
            power++;

        }

        return rv1;
    }
    public static int deci_2_base_converter(int result1, int base2){
        int rv2 = 0;
        int power = 0;

        while (result1>0){
            int dig2 = result1%base2;
            result1/=base2;

            rv2 = (int) (rv2 + dig2 * Math.pow(10,power));
            power++;

        }
        return rv2;
    }

}
