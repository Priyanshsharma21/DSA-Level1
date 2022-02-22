import java.util.Scanner;

public class Zig_Zag {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = in.nextInt();
        pzz(n);
    }
    public static void pzz(int n){
        if (n==0){
            return;
        }
        System.out.print("Pre "+n);
        pzz(n-1);
        System.out.print("In "+n);
        pzz(n-1);
        System.out.print("Post "+n);
    }
}
