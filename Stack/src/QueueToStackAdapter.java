//import java.io.*;
//import java.util.*;
//
//public class QueueToStackAdapter {
//
//    public static class QueueToStackAdapter1 {
//        Queue<Integer> mainQ;
//        Queue<Integer> helperQ;
//
//        public QueueToStackAdapter1() {
//            mainQ = new ArrayDeque<>();
//            helperQ = new ArrayDeque<>();
//        }
//
//        int size() {
//           return mainQ.size();
//        }
//
//        void push(int val) {
//           mainQ.add(val);
//        }
//
//        int pop() {
//            if (size() == 0) {
//                System.out.println("Stack Underflow");
//                return -1;
//            } else {
//                while (mainQ.size() > 1) {
//                    int value = mainQ.remove();
//                    helperQ.add(value);
//                }
//                int val = mainQ.remove(); //Last value
//
//
//                while (helperQ.size() > 0) {
//                    mainQ.add(helperQ.remove());
//                }
//
//                int top() {
//                    if (size() == 0) {
//                        System.out.println("Stack Underflow");
//                        return -1;
//                    } else {
//                        while (mainQ.size() > 1) {
//                            int value = mainQ.remove();
//                            helperQ.add(value);
//                        }
//                        int valw = mainQ.remove(); //Last value
//                        helperQ.add(valw);
//
//                        while (helperQ.size() > 0) {
//                            mainQ.add(helperQ.remove());
//                        }
//                    }
//                }
//            }
//        }
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        QueueToStackAdapter1 st = new QueueToStackAdapter1();
//
//        String str = br.readLine();
//        while (str.equals("quit") == false) {
//            if (str.startsWith("push")) {
//                int val = Integer.parseInt(str.split(" ")[1]);
//                st.push(val);
//            } else if (str.startsWith("pop")) {
//                int val = st.pop();
//                if (val != -1) {
//                    System.out.println(val);
//                }
//            } else if (str.startsWith("top")) {
//                int val = st.top();
//                if (val != -1) {
//                    System.out.println(val);
//                }
//            } else if (str.startsWith("size")) {
//                System.out.println(st.size());
//            }
//            str = br.readLine();
//        }
//    }
//}