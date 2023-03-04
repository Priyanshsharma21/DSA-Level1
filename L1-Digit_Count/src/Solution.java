import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int iv = 0;
        int tds = 0;
        int power=1;

        while(n!=0){
            n/=10;
            tds++;
        }

        int div = (int)Math.pow(10,tds-1);

        while(div!=0){
            int dig = n/div;
            int id = dig;
            int ip = power;

            iv = iv + ip *  (int) Math.pow(10,id);
            n%=div;

            power++;
        }
        System.out.println(iv);

    }
}