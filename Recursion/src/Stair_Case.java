import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Stair_Case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        ArrayList<String > paths = getStairPath(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPath(int n){

        if (n==0){
            ArrayList<String> bps = new ArrayList<>();
            bps.add(" ");
            return bps;
        }

        else if(n<0){
            ArrayList<String> bps = new ArrayList<>();
            return bps;
        }

        ArrayList<String> path1 = getStairPath(n-1);
        ArrayList<String> path2 = getStairPath(n-2);
        ArrayList<String> path3 = getStairPath(n-3);

        ArrayList<String> paths = new ArrayList<>();

        for(String path: path1){
            paths.add(1 + path);
        }

        for(String path: path2){
            paths.add(2 + path);
        }

        for(String path: path3){
            paths.add(3 + path);
        }

        return paths;
    }






}
