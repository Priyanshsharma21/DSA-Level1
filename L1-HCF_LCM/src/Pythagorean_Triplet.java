import java.util.Scanner;

public class Pythagorean_Triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number1: ");
        int number1 = in.nextInt();  // 5
        System.out.println("Enter a number2: ");
        int number2 = in.nextInt(); // 12
        System.out.println("Enter a number3: ");
        int number3= in.nextInt(); // 13

        int max = number1;

        if (number2>=max){
            max = number2;
        }

        if (number3>=max){
            max = number3;
        }

        if (number1==max){
            boolean result = (Math.pow(number2,2) +Math.pow(number3,2) == Math.pow(number1,2) );
            System.out.println(result);
        }
        else if (number2==max){
            boolean result = (Math.pow(number1,2) +Math.pow(number3,2) == Math.pow(number2,2) );
            System.out.println(result);

        }
        else {
            boolean result = (Math.pow(number1,2) +Math.pow(number2,2) == Math.pow(number3,2) );
            System.out.println(result);
        }



    }
}
