import java.util.ArrayList;
import java.util.Scanner;

public class getKP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = in.next();

        ArrayList<String> res = new ArrayList<>();
        System.out.println(res);

    }

   static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKP(String str){

        if(str.length()==0){
            ArrayList<String> bstr = new ArrayList<>();
            bstr.add(" ");
            return bstr;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getKP(ros);
        ArrayList<String> mres = new ArrayList<String>();

        String codeForCh = codes[ch - '0'];
        for (int i=0; i<codeForCh.length(); i++){
            String chCode = String.valueOf(codeForCh.charAt(i));
            for (String rstr : rres){
                mres.add(chCode + rstr);
            }
        }

        return mres;
    }
}
