import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int os = n/2;
        int is = -1;
        int num = 1;


        for (int i=1; i<=n; i++){
            for (int j=1; j<=os; j++){
                System.out.print("\t");
            }


            System.out.print(num+"\t");

            for (int j=1; j<=is; j++){
                System.out.print(num+"\t");
            }

            if (i>1 && i<n){
                System.out.print(num+"\t");
            }



            if (i<=n/2){
                os--;
                is+=2;
                num++;

            }
            else {
                os++;
                is-=2;
                num--;

            }

            System.out.println();

        }


    }
}
