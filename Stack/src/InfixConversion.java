import java.util.Scanner;
import java.util.Stack;

public class InfixConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String exp = in.nextLine();

        Stack<String> post = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for(int i=0 ;i<exp.length(); i++){
            char ch = exp.charAt(i);

            if (ch == '(') {
                ops.push(ch);
            }
            else if ((ch>='0' && ch<='9')||(ch>='a' && ch<='z')||(ch>='A'&& ch<='Z')){
                post.push(ch + "");
                pre.push(ch + "");
            }else if (ch==')'){
                while( ops.peek()!='('){
                    process(ops,post,pre);
                }
                ops.pop();

            }else if (ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                while( ops.size()>0 && ops.peek()!='(' && precedence(ch) <= precedence(ops.peek()) ){
                    process(ops,post,pre);
                }
                ops.push(ch);
            }
        }
        while( ops.size()>0){
            process(ops,post,pre);
        }
        System.out.println(post.pop());
        System.out.println(pre.pop());
    }
    public static void process(Stack<Character> ops,Stack<String> post, Stack<String> pre){
        char op = ops.pop();

        String postV2 = post.pop();
        String postV1 = post.pop();
        String postv = postV1+postV2+ops;
        post.push(postv);

        String preV2 = pre.pop();
        String preV1 = pre.pop();
        String prev = preV1+preV2+ops;
        post.push(prev);
    }
    public static int precedence(char op){
        if (op == '+' || op=='-') {
            return 1;
        }else if(op =='*' || op=='/'){
            return 2;
        }else{
            return 0;
        }
    }
}
