import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FunctionFactory {

    public static final int PERCENTAGE = 100;

    public int[] publishFunction(int[] progresses, int[] speeds) {
        Queue<Integer> days = new LinkedList<>();
        List<Integer> publishedCounts = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int day = (int) Math.ceil((double)(PERCENTAGE - progresses[i]) / speeds[i]);
            days.offer(day);
        }

        int day = days.poll();
        int publishedCount = 1;
        while (!days.isEmpty()) {
            if (day < days.peek()) {
                publishedCounts.add(publishedCount);
                day = days.poll();
                publishedCount = 1;
                continue;
            }
            days.poll();
            publishedCount++;
        }
        publishedCounts.add(publishedCount);

        return publishedCounts.stream().mapToInt(i -> i).toArray();
    }
}
