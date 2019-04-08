import java.util.*;

public class DiskController {

    private class Job {
        private int requestedTime;
        private int processingTime;

        Job(int requestedTime, int processingTime) {
            this.requestedTime = requestedTime;
            this.processingTime = processingTime;
        }
    }

    public int getMinimumAverageProcessingTime(int[][] jobs) {
        Queue<Job> scheduleQueue = new PriorityQueue<>(Comparator.comparing(j -> j.requestedTime));
        Arrays.stream(jobs).forEach(j -> scheduleQueue.add(new Job(j[0], j[1])));
        Queue<Job> waitingQueue = new PriorityQueue<>(Comparator.comparing(j -> j.processingTime));

        Job running = null;
        int totalTimeForJob = 0;
        int size = scheduleQueue.size();
        int time = 0;


        while (!scheduleQueue.isEmpty() || running != null || !waitingQueue.isEmpty()) {
            if (!scheduleQueue.isEmpty() && scheduleQueue.peek().requestedTime == time) {
                waitingQueue.add(scheduleQueue.poll());
                continue;
            }

            if (running != null && running.processingTime == 0) {
                totalTimeForJob += time - running.requestedTime;
                running = null;
            }

            if (running == null && !waitingQueue.isEmpty()) {
                running = waitingQueue.poll();
            }

            time++;
            if (running != null) {
                running.processingTime--;
            }
        }
        return totalTimeForJob / size;
    }
}
