import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));
    }

    public static boolean solution(String str){
        int n = str.length();
        int f = fact(n);

        for (int i=0; i<f; i++){
            int temp = i;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str);

            for (int div=n; div>=1; div--){
                int q = temp/div;
                int r = temp%div;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);

                temp = q;

            }
            System.out.println();
        }

        return false;
    }

    public static int fact(int n){
        int rv =1;

        for (int i=1; i<=n; i++){
            rv *= i;
        }
        return rv;
    }
}
