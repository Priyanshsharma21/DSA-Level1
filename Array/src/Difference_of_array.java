import java.util.Scanner;

public class Difference_of_array {
    public static void main(String[] args) {
        Scanner in   = new Scanner(System.in);
        System.out.println("Enter size of first number: ");
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i<arr1.length; i++){
            System.out.println("Enter number #"+i);
            arr1[i] = in.nextInt();
        }
        System.out.println("Enter size of second number: ");
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];

        for(int i=0; i<arr2.length; i++){
            System.out.println("Enter number #"+i);
            arr2[i] = in.nextInt();
        }

        int[] diff = new int[n2];
        int power = 0;
        int carry = 0;
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = diff.length-1;


        while(k>=0){
            int dig = 0;
            int a1v = i>=0?arr1[i]:0; // If there is no value in arr1 there is zero

            if (arr2[j]+carry>=a1v){
                dig = arr2[j]+ carry - a1v;
                carry = 0;
            }
            else{
                dig = arr2[j] + carry + 10 - a1v;
                carry = -1;
            }

            diff[k] = dig;
            i--;
            j--;
            k--;

        }

        int idx = 0;
        while(idx<=diff.length){ // If there is 0 in front of our diff array then pass it
            if(diff[idx]==0){
                idx++;
            }else{
                break;
            }
        }

        for (int var : diff){
            System.out.println(var);
        }
    }
}
