import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int st = 1;
        int sp = 0;



//        for(int i=1; i<=n; i++){
//
//            for(int j = 1; j<=sp; j++){
//                System.out.print("\t");
//            }
//            for(int j=1; j<=st; j++){
//                System.out.print("*\t");
//            }
//            sp++;
//            System.out.println();
//        }


        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (i==j){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();

        }
    }
}


//      *
//        *
//          *
//            *
//              *