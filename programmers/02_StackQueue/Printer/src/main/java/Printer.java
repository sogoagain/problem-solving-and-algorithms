import java.util.*;
import java.util.stream.Collectors;

public class Printer {

    private Queue<Integer> queue = new LinkedList<>();

    public int getPrintOrderOfDocument(int[] priorities, int location) {

        initQueue(priorities);
        Arrays.sort(priorities);

        int printCount = 0;

        while (!queue.isEmpty()) {
            int documnet = queue.poll();
            if(documnet == priorities[priorities.length - 1 - printCount]) {
                printCount++;
                location--;
                if(location < 0) {
                    return printCount;
                }
                continue;
            }
            queue.offer(documnet);
            location--;
            if(location < 0) {
                location = queue.size() - 1;
            }
        }

        return  printCount;
    }

    private void initQueue(int[] priorities) {
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(priorities[i]);
        }
    }
}
