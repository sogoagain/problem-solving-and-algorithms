import java.util.*;

class DoublePriorityQueue {
    Queue<Integer> minHeap = new PriorityQueue<>(Comparator.naturalOrder());
    Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

    void add(int data) {
        minHeap.add(data);
        maxHeap.add(data);
    }

    void removeMax() {
        if(minHeap.isEmpty() || maxHeap.isEmpty()) {
            return;
        }
        int data = maxHeap.poll();
        minHeap.remove(data);
    }

    void removeMin() {
        if(minHeap.isEmpty() || maxHeap.isEmpty()) {
            return;
        }
        int data = minHeap.poll();
        maxHeap.remove(data);
    }

    int getMax() {
        return maxHeap.peek() == null ? 0 : maxHeap.peek();
    }

    int getMin() {
        return minHeap.peek() == null ? 0 : minHeap.peek();
    }
}

public class DEPQ {
    public int[] simulate(String[] operations) {
        DoublePriorityQueue depq = new DoublePriorityQueue();

        for (String operation :
                operations) {
            int data = Integer.parseInt(operation.substring(2));
            switch (operation.charAt(0)) {
                case 'I':
                    depq.add(data);
                    break;
                case 'D':
                    if(data == 1) {
                        depq.removeMax();
                    } else {
                        depq.removeMin();
                    }
                    break;
                default:
                    break;
            }
        }

        int[] answer = new int[2];
        answer[0] = depq.getMax();
        answer[1] = depq.getMin();
        return answer;
    }
}
