import java.util.ArrayList;
import java.util.Scanner;

public class Remove_Prime_From_Al {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter elements in array list: ");
        int n = in.nextInt();
        for (int i=1; i<=n; i++){
            list.add(in.nextInt());
        }

        solution(list);
        System.out.println(list);

    }

    public static void solution(ArrayList<Integer> list){
        for (int i= list.size()-1 ;i>=0; i--){
            int val = list.get(i);

            if (isPrime(val)==true){
                list.remove(i);
            }
        }
    }
    
    public static boolean isPrime(int num){

        for (int i=2; i*i<=num; i++) {
            if (num%i==0){
               return false;
            }
        }

            return true;

    }
}
