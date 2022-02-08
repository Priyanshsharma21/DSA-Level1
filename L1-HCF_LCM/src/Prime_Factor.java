import java.util.Scanner;

public class Prime_Factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt(); // 1440

        for (int div=2 ; div*div<=number ; div++){
            number /= div;
            System.out.println(div);
        }
        // Exception -> Number = 46 / 2 = 23

        if (number != 1){ // In this case until 23 it will run and
//            number is not equal to 1 it will be 23 so print 23 // prime number
            System.out.println(number);
        }





    }
}
