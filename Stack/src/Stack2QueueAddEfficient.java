import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

;

public class Stack2QueueAddEfficient {

    public static class stack2QueueAddEfficient {
        Stack<Integer> mainS;
        Stack<Integer> helperS;

        public stack2QueueAddEfficient() {
            mainS = new Stack<>();
            helperS = new Stack<>();
        }

        int size() {
            return mainS.size();
        }

        void add(int val) {
          mainS.push(val);
        }

        int remove() {
            if (mainS.size()==0){
                System.out.println("stack Underflow");
                return -1;
            }else{
                while (mainS.size()>1){
                    helperS.push(mainS.pop());
                }
                int value = mainS.pop();

                while (helperS.size()>0){
                    mainS.push(helperS.pop());
                }
                return value;
            }

        int peek() {
            if (mainS.size()==0){
                System.out.println("stack Underflow");
                return -1;
            }else{
                while (mainS.size()>1){
                    helperS.push(mainS.pop());
                }
                int value = mainS.pop();
                helperS.push(value);

                while (helperS.size()>0){
                    mainS.push(helperS.pop());
                }
                return value;

            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        stack2QueueAddEfficient qu = new stack2QueueAddEfficient();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = br.readLine();
        }
    }
}