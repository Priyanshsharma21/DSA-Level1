import java.io.*;
import java.util.*;

public class Main {

    public static class TwoStack {
        int[] data;
        int tos1;
        int tos2;

        public TwoStack(int cap) {
            data = new int[cap];
            tos1 = 0;
            tos2 = data.length;
        }

        int size1() {
           return tos1+1;
        }

        int size2() {
            return data.length-tos2;
        }

        void push1(int val) {
            if (tos2==tos1+1){
                System.out.println("Stack Overflow");
            }else{
                tos1++;
                data[tos1] = val;
            }
        }

        void push2(int val) {
            if (tos2==tos1+1){
                System.out.println("Stack Overflow");
            }else{
                tos2--;
                data[tos2] = val;
            }
        }

        int pop1() {
           if(size1()==0){
               System.out.println("StackUnderflow");
               return -1;
           }else{
               int value = data[tos1];
               tos1--;
               return value;
           }
        }

        int pop2() {
            if(size1()==0){
                System.out.println("StackUnderflow");
                return -1;
            }else{
                int value = data[tos1];
                tos2++;
                return value;
            }
        }

        int top1() {
            if(size1()==0){
                System.out.println("StackUnderflow");
                return -1;
            }else{
                int value = data[tos1];
                return value;
            }
        }

        int top2() {
            if(size2()==0){
                System.out.println("StackUnderflow");
                return -1;
            }else{
                int value = data[tos2];
                return value;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TwoStack st = new TwoStack(n);

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("push1")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push1(val);
            } else if (str.startsWith("pop1")) {
                int val = st.pop1();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("top1")) {
                int val = st.top1();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size1")) {
                System.out.println(st.size1());
            } else if (str.startsWith("push2")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push2(val);
            } else if (str.startsWith("pop2")) {
                int val = st.pop2();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("top2")) {
                int val = st.top2();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size2")) {
                System.out.println(st.size2());
            }
            str = br.readLine();
        }
    }
}