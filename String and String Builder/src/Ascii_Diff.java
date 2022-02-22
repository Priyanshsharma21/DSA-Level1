import java.util.Scanner;

public class Ascii_Diff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(asciiDiff(str));
    }

    public static String asciiDiff(String str){
        java.lang.StringBuilder sb= new java.lang.StringBuilder(str);

        sb.append(str.charAt(0));
        for (int i=1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            int gap = curr-prev;

            sb.append(gap);
            sb.append(curr);

        }

        return sb.toString();
    }

}
