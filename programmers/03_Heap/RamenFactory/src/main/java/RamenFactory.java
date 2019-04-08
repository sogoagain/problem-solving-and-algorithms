import java.util.*;
import java.util.stream.Collectors;

public class RamenFactory {
    public int getSupplyTimes(int stock, int[] dates, int[] supplies, int k) {
        Queue<Integer> dateQueue = Arrays.stream(dates).boxed().collect(Collectors.toCollection(LinkedList::new));
        Queue<Integer> suppliesQueue = Arrays.stream(supplies).boxed().collect(Collectors.toCollection(LinkedList::new));
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        int supplyTime = 0;

        while (stock < k) {
            if(!dateQueue.isEmpty() && dateQueue.peek() <= stock) {
               dateQueue.poll();
               priorityQueue.add(suppliesQueue.poll());
               continue;
            }
            if(!priorityQueue.isEmpty()) {
                stock += priorityQueue.poll();
                supplyTime++;
            }
        }

        return supplyTime;
    }
}
