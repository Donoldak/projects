import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Посмотреть элемент");
        System.out.println(queue.element());
        System.out.println("Достать элемент");
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.offer(456);
        System.out.println(queue.poll());
    }
}
