import java.util.Scanner;

public class Prime_Till_N {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Lower Limit: ");
        int low = input.nextInt();
        System.out.println("Enter Upper Limit: ");
        int high = input.nextInt();

    for (int i=low ; i<high ; i++){
        int count =0;

        for (int j=2; j*j<i; j++){
            if (i%j==0){
                count++;
                break;
            }
        }
        if (count==0){
            System.out.println(i);
        }

}











    }
}
