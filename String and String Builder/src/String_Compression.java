import java.util.Scanner;

public class String_Compression {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          String str = in.nextLine();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }


    public static String compression1(String str){
        String s = String.valueOf(str.charAt(0));

        for(int i=1; i<str.length(); i++){
           char curr = str.charAt(i);
           char prev = str.charAt(i-1);
            if (curr != prev){
                s +=curr;
            }

        }
        return s;

    }

    public static String compression2(String str){

        String s = String.valueOf(str.charAt(0));
        int count = 1;
        for (int i=1; i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr==prev){
                count++;
            }else{
                if(count>1){
                    s+=count;
                    count=1;
                }
                s+=curr;
            }


        }
        if(count>1){
            s+=count;
            count=1;
        }

        return s;




    }












}
