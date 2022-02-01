import java.util.*;
import java.util.Scanner;

public class Approch4 {
    public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);
            int t = scn.nextInt();

            for (int i = 0; i < t; i++) {
                int n = scn.nextInt();

                int div = 2;
                while (div * div <= n) {
                    if (n % div == 0) {
                        break;
                    }
                    div++;
                }

//                or
//for (int div=2; div*div<=n; div++){
//    if (num%div==0){
//        break;
//    }
//}




                if (div * div > n) {
                    System.out.println("prime");
                } else {
                    System.out.println("not prime");
                }
            }

        }
    }

