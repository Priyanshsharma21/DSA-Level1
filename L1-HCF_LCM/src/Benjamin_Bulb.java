import java.util.Scanner;

public class Benjamin_Bulb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = in.nextInt();

        for (int i=1; i*i<n ; i++){
            System.out.println(i*i);
        }


    }
}
