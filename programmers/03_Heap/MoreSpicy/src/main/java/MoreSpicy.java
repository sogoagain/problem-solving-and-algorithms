import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MoreSpicy {

    public static final int RATE = 2;

    public int getMixedCount(int[] scoville, int K) {
        Queue<Integer> queue = new PriorityQueue<>();
        Arrays.stream(scoville).forEach(i -> queue.add(i));
        int count = 0;

        while(queue.peek() < K) {
            if(queue.size() == 1) {
                count = -1;
                break;
            }
            queue.add(queue.poll() + queue.poll() * RATE);
            count++;
        }

        return count;
    }
}
