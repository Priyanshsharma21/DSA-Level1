import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Stack<Integer> val = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<String> In = new Stack<>();



        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch>='+' || ch <='-' || ch>='*' || ch<='/'){
                int v2 = val.pop();
                int v1 = val.pop();
                int value = operation(v1,v2,ch);

                val.push(value);

                String ival2 = In.pop();
                String ival1 = In.pop();
                String ival = "(" + ival1 + ch + ")";
                In.push(ival);

                String pval2 = pre.pop();
                String pval1 = pre.pop();
                String pval = ch + pval1 + pval2 ;
                In.push(pval);

            }else{
                val.push(ch - '0');
                pre.push(ch + "");
                In.push(ch + "");
            }
        }
        System.out.println(val.pop());
        System.out.println(In.pop());
        System.out.println(pre.pop());

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
