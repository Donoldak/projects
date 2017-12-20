import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_ {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if( o1 > o2 ){
                    return 1;
                }
                if( o1 < o2 ){
                    return -1;
                }
                return 0;
            }
        };
        Queue<Integer> intQueue = new PriorityQueue<>(10, comparator);
        intQueue.add(4);
        intQueue.add(3);
        intQueue.add(5);
        while( !intQueue.isEmpty() ){
            System.out.println( intQueue.remove() );
        }
    }
}
