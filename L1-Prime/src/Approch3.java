import java.util.Scanner;

public class Approch3 {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number Of cases: ");
        int t = in.nextInt();
        for (int i =0; i<t ; i++){
            System.out.println("Enter a number: ");
            int n = in.nextInt();
            for (int j = 2; j*j < n; j++) {
                if (n % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not prime");
            }
        }


    }
}

//case: if we have N=24
//then there are cases means its factors are
//1  24
//2  12
//3  8
//4  6
//and then repeat
// 6   4
//8  3
//        ....

//so we can write f*f<n means f1<=f2 i.e-> 4<6

//after reaching squreroot of a number we will not get new factors



//why to run loop till n run till root n  == j*j<n ==(j<rootn)