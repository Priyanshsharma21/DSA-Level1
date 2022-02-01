import java.util.Scanner;

public class LargerOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = in.nextInt();
        System.out.println("Enter a value of b:");
        int b=in.nextInt();
        System.out.println("Enter the value of c:");
        int c = in.nextInt();

        if (a>b && a>c){
            System.out.println(a + " Is the largest number ");
        }
        else if(b>a && b>c){
            System.out.println(b+" Is the largest number");
        }
        else if(c>a && c>b){
            System.out.println(c+" Is the largest number");
        }
        else{
            System.out.println("Are Equal");
        }

    }
}


//Note - If we take Input from user than if we take int use nextInt(), if string use nextLine(), if both then use NextLine() in int and use ParseInt to convert

//int n= Integer.parseInt(in.nextline());