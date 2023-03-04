import java.util.Scanner;
import java.util.Stack;

public class BalanceBracket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(0);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);

            }else if(ch==')'){
                boolean val = handelClosing(st,'(');
                if(val==false){
                    System.out.println(val);
                }

            }else if(ch == ']'){
                boolean val =handelClosing(st,'[');
                if(val==false){
                    System.out.println(val);
                }

            }else if(ch == '}'){
                boolean val =handelClosing(st,'{');
                if(val==false){
                    System.out.println(val);
                }
            }
        }

        if (st.size()==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    public static boolean handelClosing(Stack<Character> st, char corresoch){
        if(st.size()==0){
            return false;
        }else if(st.peek() != corresoch){
            return false;
        }else{
            st.pop();
            return true;
        }
    }
}
