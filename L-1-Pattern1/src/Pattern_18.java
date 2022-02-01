import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int st = n;
        int sp = 0;


        for (int i=1; i<=n; i++){
//            System.out.println(sp + "," + st);

            for (int j=1; j<=sp; j++){
                System.out.print("\t");
            }

            for (int j=1; j<=st; j++){
                if (i>1 && i<=n/2 && j>1 && j<st){
                    System.out.print("\t");
                }else {
                    System.out.print("*\t");
                }
            }



            if (i<=n/2){
                sp++;
                st-=2;
            }
            else {
                sp--;
                st+=2;
            }


            System.out.println();



        }

    }
}
