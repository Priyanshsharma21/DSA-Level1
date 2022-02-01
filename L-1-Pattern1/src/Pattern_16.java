import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int st=1;
       int sp= 2 * n - 3;


        for (int i=1; i<=n; i++){
            int num=1;

//            System.out.println(st + "," + sp + "," + st);
            for (int j=1; j<=st; j++){
                System.out.print(num+"\t");
                num++;
            }

            for (int j=1; j<=sp; j++){
                System.out.print("\t");
            }

            if (i==n){
                st--;
                num--;
            }

            for (int j=1; j<=st; j++){
                num--;
                System.out.print(num+"\t");
            }

                st++;
                sp-=2;
                num++;








            System.out.println();
        }



    }
}

//        1						1
//        1  2				2	1
//        1	 2	3		3	2	1
//        1	 2	3	4	3	2	1


