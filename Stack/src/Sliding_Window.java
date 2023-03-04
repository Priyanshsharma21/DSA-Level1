import java.io.*;
import java.util.*;

public class Sliding_Window{


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<Integer>();
        int[] nge = new int[arr.length];
        st.push(arr.length-1);
        nge[arr.length-1] = arr.length;

        for(int i=arr.length-2; i>=0; i--){

            while(st.size()>0 && arr[i]>=arr[st.peek()]){
                st.pop();
            }

            if(st.size()==0){
                nge[i] = arr.length;
            }else{
                nge[i] = st.peek();
            }

            st.peek();
        }

        int[] ans = new int[arr.length-k+1];

        int j = 0;

        for(int i=0; i<arr.length -k ; i++){

            if(j<i){
                j=i;
            }

            while(nge[j]<i+k){
                j = nge[j];
            }
            ans[i] = arr[j];
        }








    }
}