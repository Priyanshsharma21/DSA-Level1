import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number Of Star row you wanna print: ");
        int n = in.nextInt();

        int star=n ;
        int sp = 0;

        for (int i=1; i<=n; i++){ // from 5(n) to 1
            for (int j=1; j<=sp; j++){ // 1<=0 // 1<=1 // 1<=2 , 2<=2 // so on print space
                System.out.print("\t");
            }
            for (int j=1; j<=star; j++){ // 1<=5, 2<=5 , 3<=5 , 4<=5 , 5<=5 , 6<=5(no) out of loop
                System.out.print("*\t");
            }
            star--; // every time star less
            sp++; // space inc
            System.out.println(); //helps to print /p in next line
        }

    }
}
//    *	  *	  *	  *	  *
//        *	  *	  *	  *
//            *	  *	  *
//                *	  *
//                    *