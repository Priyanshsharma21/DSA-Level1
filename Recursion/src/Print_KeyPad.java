import java.util.ArrayList;
import java.util.Scanner;

public class Print_KeyPad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = in.next();
        printKP(str,"");
    }

    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKP(String ques, String ans){

        if (ques.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ans.substring(1);

        String codeforch = codes[ch - '0'];

        for (int i=0; i<codeforch.length(); i++){
            char cho = codeforch.charAt(i);
            printKP(roq,ans + cho);
        }


    }
}
