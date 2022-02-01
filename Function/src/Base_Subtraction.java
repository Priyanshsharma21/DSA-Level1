import java.util.Scanner;

public class Base_Subtraction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number1 = in.nextInt();
        System.out.println("Enter a number: ");
        int number2 = in.nextInt();
        System.out.println("Enter a base: ");
        int base = in.nextInt();

        int result = subtract(number1,number2,base);
        System.out.println(result);

    }

    public static int subtract(int num1, int num2, int base){
        int rv = 0;
        int c = 0;
        int power = 0;

        while (num2>0){
            int dig1 = num1%10; // 256 -> 6
            int dig2 = num2%10; // 1212 -> 2
            num1/=10; // 25
            num2/=10; // 121

            int dig = 0; // 0
            dig2+= c; // 2 + 0

            if (dig2>=dig1){
                c=0;
                dig = dig2-dig1;
            }
            else{ // d2<d1 // 2<6
                c = -1 ;
                dig = (dig2 + base) - dig1;
            }
            rv = (int) (rv + dig * Math.pow(10,power));
            power++;
        }





        return rv;
    }
}
