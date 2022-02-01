import java.util.Scanner;

public class Pattern_De_Practice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int st = 1;
        int sp = n-1;

        for(int i=1;i<=n;i++){
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            for (int j=1; j<=st; j++){
                System.out.print("*\t");
            }
            sp--;
            System.out.println();
        }



    }
}
