import java.util.Scanner;

public class Print_Encoding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        printEncod(str,"");
    }

    public static void printEncod(String str,String asf){

        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        else if(str.length()==1){
            char ch = str.charAt(0);
            if (ch=='0'){ // Because no alphabet exist for 0
                return;
            }
            else { // if last char is not 0 // if it is '3'
                int chv = ch-'0'; // then '3' - '0' = 3
                char code = (char)('a' + chv - 1);  // 'a' + 3 -1 == 48 + 3 - 1 = 50 ('c')
                asf = asf + code; // asf = " " + 'c'
                System.out.println(asf); // print c
            }
        }

        else{ // if there more than 1 char // ex => 123-->1 && 12
            char ch = str.charAt(0);
            String roq = str.substring(1);

            if (ch=='0'){
                return; // if the char is 0 or not
            }
            else { // and if not then do the same
                int chv = ch-'0';
                char code = (char)('a' + chv - 1);
                printEncod(roq,asf+code);
            }

            String ch12 = str.substring(0,2);
            String roq12 = str.substring(2);

            int ch12v = Integer.parseInt(ch12);
            if(ch12v<=26){
                char code = (char)('a' + ch12v -1);
                printEncod(roq12,asf+code);
            }

        }






    }
}
