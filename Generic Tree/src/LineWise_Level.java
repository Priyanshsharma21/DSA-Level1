
import java.io.*;
        import java.util.*;

public class LineWise_Level {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node(){

        }
        Node(int data){
            this.data = data;
        }
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }

    public static int size(Node node) {
        int s = 0;

        for (Node child : node.children) {
            s += size(child);
        }
        s += 1;

        return s;
    }

    public static int max(Node node) {
        int m = Integer.MIN_VALUE;

        for (Node child : node.children) {
            int cm = max(child);
            m = Math.max(m, cm);
        }
        m = Math.max(m, node.data);

        return m;
    }

    public static int height(Node node) {
        int h = -1;

        for (Node child : node.children) {
            int ch = height(child);
            h = Math.max(h, ch);
        }
        h += 1;

        return h;
    }

    public static void traversals(Node node){
        System.out.println("Node Pre " + node.data);

        for(Node child: node.children){
            System.out.println("Edge Pre " + node.data + "--" + child.data);
            traversals(child);
            System.out.println("Edge Post " + node.data + "--" + child.data);
        }

        System.out.println("Node Post " + node.data);
    }

    public static void levelOrderLinewise(Node node){
        Queue<Node> q1 = new ArrayDeque<>();
        Queue<Node> q2 = new ArrayDeque<>();
        q1.add(node);

        while (q1.size()!=0){
            q1.remove();
            System.out.println(node.data+ " ");
            for(Node child : node.children){
                q2.add(child);
            }
            if (q1.size()==0){
                q1=q2;
                q2 = new ArrayDeque<>();
                System.out.println();
            }
        }

    }

    public static void levelOrderLinewise2(Node node){
        Queue<Node> q1 = new ArrayDeque<>();
        q1.add(node);
        q1.add(new Node(-1));

        while (q1.size() > 0){
            node = q1.remove();
            if (node.data != -1){
                System.out.println(node.data+ " ");
                for(Node child : node.children) {
                    q1.add(child);
                }
            }else {
                if (q1.size()>0){
                    q1.add(new Node(-1));
                    System.out.println();
                }
            }

        }

    }

    public static void levelOrderLinewise33(Node node){
        Queue<Node> q1 = new ArrayDeque<>();
        q1.add(node);

        while (q1.size() > 0){
           int cicl = q1.size();

           for(int i=0; i<cicl; i++){
               node = q1.remove();
               System.out.println(node.data+ " ");

               for(Node child : node.children){
                   q1.add(child);
               }
           }
            System.out.println();
        }

    }



    public static void levelOrderLinewise34(Node node){
        Queue<Node> q1 = new ArrayDeque<>();
        q1.add(node);

        while (q1.size() > 0){
            int cicl = q1.size();

            for(int i=0; i<cicl; i++){
                node = q1.remove();
                System.out.println(node.data+ " ");

                for(Node child : node.children){
                    q1.add(child);
                }
            }
            System.out.println();
        }

    }

    public static class Pair{
        Node node;
        int level;

        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }

    public static void levelOrderLinewise35(Node node){
        Queue<Pair> q1 = new ArrayDeque<>();
        q1.add(new Pair(node,1));

        int level = 1;

        while (q1.size() > 0){
           Pair p = q1.remove();
           if (p.level>level){
               level = p.level;
               System.out.println();
           }

            System.out.println(p.node.data + " ");
           for (Node child : p.node.children){
               Pair cp = new Pair(child, p.level+1);
               q1.add(cp);
           }
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        levelOrderLinewise(root);
    }

}