import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt(); //754

        while(number!=0){ // 754!=0 // 54!=0 // 4!=0
            int dig = number%10; // 754%10 = 4 // 75%10 = 5 // 7%10 = 7 // number ko extract kia
            System.out.println(dig); // 4 // 5 // 7 // number ko print kia
            number/=10; // 754/10 = 75 // 75/10 = 7 // 7/10 = 0 // number ko chota  kia
        }
    }
}
