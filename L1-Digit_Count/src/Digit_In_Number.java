import java.util.Scanner;

public class Digit_In_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        find the count
        System.out.println("Enter a number: ");
        int n =in.nextInt();
        int copy_Number = n;
        int digit_count = 0;
        while (copy_Number!=0){ // yeha digit count find kar rahe hai
            copy_Number/=10;
            digit_count++;
        }

        int power= (int) Math.pow(10,digit_count-1);

        while (power!=0){ // 100!=0 // 10!=0 // 1!=0
            int q = n/power; // 754/100 // 54/10 // 4/1 // yaha se hum hamara number extract kar rahe hai
            System.out.println(q); // 7 // 5 //  4 // yeha usse print kar rahe hai
           n%=power; // 754%100 = 54 // 54%10 =4 // 4%1=0 // yeha hum number ko chotta bana rahe hai
            power/=10; // yaha power ko chotta bana rahe hai
        }










    }
}
