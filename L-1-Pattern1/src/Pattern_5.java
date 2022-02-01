import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number Of Star row you wanna print: ");
        int n = in.nextInt();
        int star = 1;
        int space = n/2;

        for (int i=1; i<=n; i++){
//            System.out.println(space  +","+ star);

            for (int j=1; j<=space; j++){
                System.out.print("\t");
            }

            for (int j=1; j<=star; j++){
                System.out.print("*\t");
            }

            if (i <= n/2) {
                space--;
                star+=2;
            }
            else {
                space++;
                star-=2;
            }
            System.out.println();
        }
    }
}


//pattern

//         *
//       * * *
//     * * * * *
//       * * *
//         *
