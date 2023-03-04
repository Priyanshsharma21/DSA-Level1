import java.util.ArrayList;
import java.util.Scanner;

public class Get_Maze_path {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dr = in.nextInt();
        int dc = in.nextInt();
        int [] [] arr = new int[dr][dc];


        ArrayList<String> path = getMazePath(1,1,dr,dc);
        System.out.println(path);


    }
    public static ArrayList<String> getMazePath(int sr,int sc,int dr,int dc){

        if (sr==dr && sc==dc){
            ArrayList<String> bsc = new ArrayList<>();
            bsc.add(" ");
            return bsc;
        }


        ArrayList<String> hpath1 = new ArrayList<>();
        ArrayList<String> vpath1 = new ArrayList<>();

        if (sc<dc){
            hpath1 = getMazePath(sr,sc+1,dr,dc);
        }

        if (sr<dr){
            vpath1 = getMazePath(sr+1,sc,dr,dc);
        }


        ArrayList<String> paths = new ArrayList<>();

        for (String hpath : hpath1){
            paths.add("h" + hpath);
        }

        for (String vpath : vpath1){
            paths.add("v" + vpath);
        }
        return paths;

    }
}
