import java.util.LinkedList;
import java.util.Queue;

public class TruckPassingBridge {


    int calculateTimeCrossesBridge(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> trucksOnBridge = new LinkedList<>();
        Queue<Integer> times = new LinkedList<>();
        int time = 0;

        for(int i = 0; i < truck_weights.length; i++) {
            time++;
            if(times.size() != 0 && times.peek() + bridge_length == time) {
                trucksOnBridge.poll();
                times.poll();
            }

            int sumWeightAllTrucks = trucksOnBridge.stream().mapToInt(w -> w).sum();
            if(sumWeightAllTrucks + truck_weights[i] > weight || trucksOnBridge.size() >= bridge_length) {
                i--;
                continue;
            }

            trucksOnBridge.offer(truck_weights[i]);
            times.offer(time);
        }

        while (trucksOnBridge.size() != 0) {
            time++;
            if(times.size() != 0 && times.peek() + bridge_length == time) {
                trucksOnBridge.poll();
                times.poll();
            }
        }

        return time;
    }
}
