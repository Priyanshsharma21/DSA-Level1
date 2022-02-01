import java.util.Scanner;

public class Approch2 {
    public static void main(String[] args) {
//in place of count we take flag isPrime bool

        Scanner in = new Scanner(System.in);
//        no of cases we want is t
        int t;
        System.out.println("How many numbers You Want To Check:");
        t = in.nextInt();


        for (int i=1; i<=t; i++){
            int number = in.nextInt();
            boolean flag =true;
            for (int j = 1; j<number ; j++){
                if (number%j==0){
                    flag=false;
                    break;
                }

            }
            if (flag==true){
                System.out.println("Its a prime number");
            }
            else{
                System.out.println("Its not prime number");
            }

        }

    }
}
