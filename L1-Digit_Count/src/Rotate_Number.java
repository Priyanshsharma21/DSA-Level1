import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Rotate_Number {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number(n): ");
        int number = in.nextInt(); //256879
        System.out.println("Enter value of rotator(k): ");
        int k = in.nextInt(); // 2
        int digit=0;
        int copy_num = number;
        int anotherCopy = number;
        int extract_num;
        int remain_num;
        int result;

        while (number!=0){
            number/=10;
            digit++;
        }
//          Now we got digit Count == 6;

//My Approch

        if (k>0){

            copy_num%=Math.pow(10,k); // 79
            extract_num = copy_num;
            anotherCopy/=(int)Math.pow(10,k); // 2568
            remain_num = anotherCopy;

            System.out.println("Rotated Number Is: ");
            result = (int) ((int) remain_num + extract_num * Math.pow(10,digit-k));
            System.out.println(result);


        }

//        sumeet sir approch


//        for first step
//        1. make div and mult = 1
//run a for from 1 to digit count
//if i<=k == div*10
//else mult*10













    }
}
