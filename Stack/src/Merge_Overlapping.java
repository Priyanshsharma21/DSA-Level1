import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Merge_Overlapping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][2];

        for(int i=0; i<arr.length; i++){
            String line = in.nextLine();
            arr[i][0] = Integer.parseInt(line.split(" ")[0]);
            arr[i][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverLappingInterval(arr);
    }
    public static void mergeOverLappingInterval(int[][] arr){
        Pair[] pair = new Pair[arr.length];
        for (int i=0 ;i<arr.length; i++){
            pair[i] = new Pair(arr[i][0],arr[i][1]);
        }
        Arrays.sort(pair);
        Stack<Pair> st = new Stack<>();

        for (int i=0; i< pair.length; i++){
            if (i==0){
                st.push(pair[i]);
            }else{
                Pair top = st.peek();
                if (pair[i].st>top.en){

                }
            }
        }


    }

    public static class Pair implements Comparable<Pair> {
        int st;
        int en;

        Pair(int st,int en){
            this.st = st;
            this.en = en;
        }
        public int compareTo(Pair other){
            if (this.st != other.st){
                return this.st-other.st;
            }else{
                return this.en-other.en;
            }
        }
    }
}
