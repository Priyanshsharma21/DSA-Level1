import java.util.Scanner;

public class Print_subsequence {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        String str = in.nextLine();
        printSS(str," ");

    }

    public static void printSS(String ques, String ans){
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);


        printSS(roq,ans + ch);
        printSS(roq,ans + " ");

    }
}
