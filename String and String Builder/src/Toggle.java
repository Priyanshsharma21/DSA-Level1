import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(toggle(str));

    }

    public static String toggle(String str){
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);

        for(int i=0; i<sb.length(); i++){
            char ch = sb.charAt(i);

            if(ch>='a' && ch<='z'){
                char upc = (char) ('A' + ch -'a');
                sb.setCharAt(i,upc);


            }else if (ch>='A' && ch<='Z'){
                char lpc = (char) ('a' + ch -'A');
                sb.setCharAt(i,lpc);
            }

        }

        return sb.toString();
    }
}
