import java.io.*;
import java.util.*;

public class Infix{


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> opnds = new Stack<>();
        Stack<Character> oprts = new Stack<>();

        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);

            if (ch == '(') {
                oprts.push(ch);
            }

            else if(Character.isDigit(ch)){
                opnds.push(ch - '0');
            }

            else if(ch==')'){
                while(oprts.peek() !='('){
                    char optr  = oprts.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();

                    char opv = (char) operation(v1,v2,optr);
                    opnds.push((int) opv);

                }

                oprts.pop();
            }

            else if(ch== '+'|| ch=='-'|| ch=='*'|| ch=='/'){

                while (oprts.size() > 0 && oprts.peek() != '(' && precedance(ch) <= precedance(oprts.peek())) {
                    char optr  = oprts.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();

                    int opv =  operation(v1,v2,optr);
                    opnds.push((int) opv);

                }

                oprts.push(ch);

            }
        }
        while(oprts.size()!=0){
            char optr  = oprts.pop();
            int v2 = opnds.pop();
            int v1 = opnds.pop();

            int opv = operation(v1,v2,optr);
            opnds.push((int) opv);

        }
        System.out.println(oprts.peek());

    }

    public static int precedance(char optor){
        if (optor == '+') {
            return 1;
        }else if(optor=='-'){
            return 2;
        }else if(optor =='*'){
            return 3;
        } else{
            return 4;
        }
    }

    public static int operation(int v1,int v2,char optor){
        if (optor == '+') {
            return v1+v2;
        }else if(optor=='-'){
            return v1-v2;
        }else if(optor =='*'){
            return v1*v2;
        } else{
            return v1/v2;
        }
    }
}