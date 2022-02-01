
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = in.nextInt();
        int t = 0;

        while (t<=number){

            if (t%2==0){
                System.out.println("Number is even");
            }
            else if (t%2==1){
                System.out.println("Number is odd");
            }
            else {
                System.out.println("Invalid Input");
            }
            t++;
        }

    }
}
