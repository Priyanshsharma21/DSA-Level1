import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number Of Star row you wanna print: ");
        int n = in.nextInt();
        int sp = n-1;
        int star = 1;

        for (int i=1; i<=n; i++){ // 1 // 2 // 3 // 4 // 5 //
//            System.out.print(sp + "," + star); // for demonstration purpose
            for (int j=1; j<=sp; j++){ // 1<=4 // 2<=4 // 3<=4 // 4<=4 --> print 4 space same for 2,3,4,5
                System.out.print("\t");
            }

            for (int j=1; j<=star; j++){ // 1<=1 --> print 1 star // 1<=2 // 1<=2 == print 2 star
                System.out.print("*\t");
            }
            sp--;
            star++;
            System.out.println();
//            4,1
//            3,2
//            2,3
//            1,4
//            0,5
        }

//	            *
//			*	*
//		*	*	*
//	*	*	*	*
//*	*	*	*	*


    }
}
