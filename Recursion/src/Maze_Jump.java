import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Maze_Jump {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        ArrayList<String> path = getMazeJump(1,1,m,n);
        System.out.println(path);
    }

    public static ArrayList<String> getMazeJump(int sr,int sc,int dr,int dc){


        if (sr>dr || sc>dc){
            return new ArrayList<>();
        }
       if (sr==dr && sc==dc){
           ArrayList<String> bsc = new ArrayList<>();
           bsc.add(" ");
           return bsc;
       }


        ArrayList<String> paths = new ArrayList<>();
//    Horizantal moves
        for (int ms=1; ms<=dc-sc; ms++){
            ArrayList<String> hpaths = getMazeJump(sr,sc+ms,dr,dc);
            for (String hpath: hpaths){
                paths.add("h"+ms+hpath);

            }
        }

//        vertical
        for (int ms=1; ms<=dr-sr; ms++){
            ArrayList<String> vpaths = getMazeJump(sr+ms,sc,dr,dc);
            for (String vpath: vpaths){
                paths.add("v"+ms+vpath);

            }
        }

//digonal

        for (int ms=1; ms<=dc-sc && ms<=dr-sr; ms++){
            ArrayList<String> dpaths = getMazeJump(sr+dc,sc+ms,dr,dc);
            for (String dpath: dpaths){
                paths.add("d"+ms+dpath);

            }
        }

        return paths;
    }
}
