import java.util.Scanner;

public class ThreeK {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = in.nextInt();

        if (n%3==0){
            System.out.println("Number is divisible by three");
        }
        else if (n%3==1){
            System.out.println("Number is 3n+1");
        }
        else {
            System.out.println("Number is 3n+2");
        }
    }
}
