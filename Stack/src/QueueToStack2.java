import java.io.*;
import java.util.*;

public class QueueToStackAdapter2 {

    public static class QueueToStack2 {
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;

        public QueueToStack2() {
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }

        int size() {
            return mainQ.size();
        }

        void push(int val) {
            while(mainQ.size()>0){
                int value = mainQ.remove();
                helperQ.add(value);
            }
            mainQ.add(val);

            while(helperQ.size()>0){
                int value = helperQ.remove();
                mainQ.add(value);
            }
        }

        int pop() {
            if (size()==0){
                System.out.println("Stack Underflow");
                return -1;
            }else{
                return mainQ.remove();
            }
        }

        int top() {
            if (size()==0){
                System.out.println("Stack Underflow");
                return -1;
            }else{
                return mainQ.peek();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        QueueToStack2 st = new QueueToStack2();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("push")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if (str.startsWith("pop")) {
                int val = st.pop();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("top")) {
                int val = st.top();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(st.size());
            }
            str = br.readLine();
        }
    }
}