import java.util.Scanner;

public class PrintMaze {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        print_stairPath(1,1,n,m,"");


    }

    public static void print_stairPath(int sr, int sc, int dr,int dc,String path){

        if (sr>dr || sc>dc){
            return;
        }
        if (sr==dr && sc==dc){
            System.out.println(path);
            return;
        }

        print_stairPath(sr,sc+1,dr,dc,path+"h");
        print_stairPath(sr+1,sc,dr,dc,path+"v");

    }
}
