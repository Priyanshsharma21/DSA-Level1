import java.util.Scanner;

public class Tower_of_hanoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int t1d = in.nextInt();
        int t2d = in.nextInt();
        int t3d = in.nextInt();

        toh(n,t1d,t2d,t3d);
    }

    public static void toh(int n, int t1d, int t2d, int t3d){
        if (n==0){
            return;
        }
        toh(n-1,t1d,t3d,t2d);
        System.out.println(n + "[ " + t1d + "-> "+ t2d +" ]");
        toh(n-1,t3d,t2d,t1d);
    }
}
