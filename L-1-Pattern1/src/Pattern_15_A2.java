import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Pattern_15_A2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();

        int st = 1;
        int sp = 2;
        int num = 1;

        for (int i=1;  i<=n ; i++){


            for (int j=1; j<=sp; j++){
                System.out.print("\t");
            }

            int cnum = num;

            for (int j=1; j<=st; j++){
                System.out.print(cnum+"\t");
                if (j <= st/2){
                    cnum++;
                }
                else {
                    cnum--;
                }
            }

            if (i<=n/2){
                sp--;
                st+=2;
                num++;
            }
            else {
                sp++;
                st-=2;
                num--;
            }
            System.out.println();
        }
    }
}

//	                1
//               2	3	2
//            3	 4	5	4  3
//               2	3	2
//                  1