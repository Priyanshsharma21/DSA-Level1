import java.util.Scanner;
import java.util.Stack;

public class PreInfix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Stack<Integer> val = new Stack<>();
        Stack<String> In = new Stack<>();
        Stack<String> Post = new Stack<>();

        for (int i=str.length(); i>=0; i--){
            char ch = str.charAt(i);
            if (ch=='+' || ch=='-' ||ch=='*' || ch=='/'){
                int val1 = val.pop();
                int val2 = val.pop();
                int value = operation(val1,val2,ch);
                val.push(value);

                String in1 = In.pop();
                String in2 = In.pop();
                String Inval = '(' + in1 +ch + in2+ ')';
                In.push(Inval);

                String po1 = In.pop();
                String po2 = In.pop();
                String poval = po1 + po2 + ch;
                In.push(poval);



            }else{
                val.push(ch + '0');
                In.push(ch + "");
                Post.push(ch + "");
            }

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
