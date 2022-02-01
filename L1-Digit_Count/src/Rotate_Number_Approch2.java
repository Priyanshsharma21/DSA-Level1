import java.util.Scanner;

public class Rotate_Number_Approch2 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number(n): ");
        int number = in.nextInt(); //256879
        System.out.println("Enter value of rotator(k): ");
        int k = in.nextInt(); // 2
        int digit=0;

        while (number!=0){
            number/=10;
            digit++; // 6
        }

//special cases if someone enters number(k) greater than digit then we will repeat3
//for example I entered 6 so no change then 7 then 7==1

        k = k%digit; // now it resolve
//        for negative
        if (k<0){ // -2
            k = k + digit; // k = -2 + 6 => k = 4
        }

        int div = 1;
        int mult = 1;

        for (int i=0; i<digit; i++){
            if (i<=k){
                div*=10; // 100
            }
            else {
                mult*=10; // 1000
            }
        }


        int q = number/div; // 2568
        int rem = number%div; // 79

        int rotate = rem *mult+q; // 79 * 1000 = 79000 + 2568 = 792568
        System.out.println(rotate);


    }
}
