import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();

        if (num%2==0){
            System.out.println("Its a Even Number");
        }
        else if(num%2!=0){
            System.out.println("Its a Odd Number");
        }
        else {
            System.out.println("Enter an invalid number");
        }



    }
}
