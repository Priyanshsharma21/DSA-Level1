import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueDs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Queue<Integer> qu = new ArrayDeque<>();
//        We cant do new Queue because queue is a interface and interface
//        dont have body
//        Queue interface extends dequqe interface and dquque nterface implements
//        ArrayDuwuqq class , so all the implementation is inside the arraydeque

        qu.add(10);
        qu.add(20);
        qu.add(30);
        System.out.println(qu);
        qu.remove();
        System.out.println(qu);
        System.out.println(qu.peek());


    }
}
