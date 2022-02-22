import java.util.Scanner;

public class Palindrom_substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = in.nextLine();
        solution(s);

    }

    public static void solution(String s){
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<= s.length(); j++) {
                String ss = s.substring(i,j);
                if(isPalindrom(ss)==true){
                    System.out.println(ss);
                }
            }

        }
    }

    public static boolean isPalindrom(String s){
        int i=0;
        int j=s.length()-1;

        while(i<j){

            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if(ch1!=ch2){
                return false;
            }
            else if(ch1==ch2){
                i++;
                j--;
            }
        }
        return true;
    }
}
