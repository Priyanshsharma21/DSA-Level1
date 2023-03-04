import java.util.Scanner;

public class Print_Permutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        printP(str,"");
    }

    public static void printP(String ques, String ans){

        if (ques.length()==0){
            System.out.println(ans);
            return;
        }

        for (int i=0; i<ques.length(); i++){
            char ch = ques.charAt(i);
            String lp = ques.substring(0,i);
            String rp = ques.substring(i+1);
            String roq = lp + rp;
            printP(roq,ans + ch);
        }

    }
}
