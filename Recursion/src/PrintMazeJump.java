import java.util.Scanner;

public class PrintMazeJump {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        printMazdeJump(1,1,n,m,"");


    }

    public static void printMazdeJump(int sr, int sc, int dr,int dc,String path){

        if (sr==dr &&sc==dc){
            System.out.println(path);
            return;
        }



        //horizontal
        for (int ms=1; ms<=dc-sc; ms++){
            printMazdeJump(sr,sc+ms,dr,dc,path+"h"+ms);
        }

        //Vertical
        for (int ms=1; ms<=dr-sr; ms++){
            printMazdeJump(sr+ms,sc,dr,dc,path+"v"+ms);
        }

//        digonal

        for (int ms=1; ms<=dr-sr && ms<=dc-sc; ms++){
            printMazdeJump(sr+ms,sc+ms,dr,dc,path+"d"+ms);
        }


    }
}
