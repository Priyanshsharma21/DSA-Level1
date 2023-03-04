import java.util.Scanner;

public class Target_Sum_Subset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        int tar = in.nextInt();
        targetSS(arr,0,"",0,tar);
    }

    public static void targetSS(int[] arr,int idx,String set,int sos,int tar) {

        if (idx==arr.length){
            if (sos==tar){
                System.out.println(set);
            }
            return;
        }


        targetSS(arr,idx+1,set+arr[idx]+",", sos + arr[idx],tar);
        targetSS(arr,idx+1,set,sos,tar);


    }
}
