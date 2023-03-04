import java.util.Scanner;
import java.util.Stack;

public class celebrity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int [][] arr = new int[r][c];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                arr[i][j] = in.nextInt();
            }
        }

        findCeleb(arr);
    }
    public static void findCeleb(int[][] arr){
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            st.push(i);
        }

        while(st.size()>2){
            int i=st.pop();
            int j=st.pop();

            if (arr[i][j]==1){
//                if i knows j i is not a celeb or if i dont know j j is not
                st.push(j);
            }else{
                st.push(i);
            }
        }
        int pot = st.pop();
        for(int i=0; i<arr.length; i++){
            if(i!=pot){
                if(arr[i][pot]==0||arr[pot][i]==1){
                    System.out.println("None");
                    return;
                }
            }
        }
    }
}
