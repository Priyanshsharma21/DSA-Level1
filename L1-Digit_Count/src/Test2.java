import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = n;
        int val = 2*n-2;
        for(int i=0; i<=val;i++){
            for(int j=0; j<=val;j++){

                if(i==0 || i==val || j==0 || j==val){
                    System.out.print(temp+"\t");
                }
                else if(i==val/2-1 || i==val-2){
                    if(j>=val/2-1 || j<=val+1){
                        System.out.print(temp/2+"\t");
                    }
                    else{
                        System.out.print("#"+"\t");

                    }
                }


                else{
                    System.out.print("#"+"\t");
                }
        }
            System.out.println();
    }
}
}
