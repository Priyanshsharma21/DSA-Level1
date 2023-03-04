import java.util.Scanner;
import java.util.Stack;

public class Smallest_num_follow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        Stack<Integer> st = new Stack<>();
        int num = 1;

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(0);

            if (ch == 'd') {
                st.push(num);
                num++;
            }else{
                st.push(num);
                num++;

                while(st.size()>0){
                    System.out.print(st.pop());
                }
            }
        }
        st.push(num);
        while(st.size()>0){
            System.out.print(st.pop());
        }
    }
}
