import java.util.Scanner;

public class Difference_of_array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        for (int i=0;i<arr1.length; i++){
            System.out.println("Enter value of : "+i);
            arr1[i] = in.nextInt();
        }
        System.out.println("Enter n2: ");
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        for (int i=0; i<arr2.length; i++){
            System.out.println("Enter value of: "+i);
            arr2[i] = in.nextInt();
        }

        int diff[] = new int[n2];
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = diff.length-1;
        int carry = 0;

        while(k>=0){
            int dig = arr2[j]-carry;

            if(i>=0){
                dig = dig - arr1[i];
            }
            if(dig<=0){
                dig = dig+10;
                carry = 1;
            }else{
                carry = 0;
            }

            diff[k] = dig;

            i--;
            j--;
            k--;
        }
//dont print leading 0

        int idx = 0;

        while(idx<=diff.length){
            if (diff[idx] ==0){
                idx++;
            }
            else{
                break;
            }
        }

        for(int var : diff){
            System.out.println(var);
        }



    }
}
