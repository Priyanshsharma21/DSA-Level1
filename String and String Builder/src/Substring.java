import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1 = in.nextLine();

        for(int i=0; i<s1.length(); i++){
            for(int j=i; j<=s1.length(); j++){
                System.out.println(s1.substring(i,j)+ " \t");
            }
        }

    }
}
