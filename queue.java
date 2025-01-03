import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> foo = new PriorityQueue<>();
        foo.add("B");
        foo.add("C");
        foo.add("A");
        foo.add("z");
        System.out.println(foo);
        System.out.println(foo.peek());
        foo.poll();
        System.out.println(foo);
    }
}
