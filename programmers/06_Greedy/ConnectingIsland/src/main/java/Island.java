import java.util.*;

public class Island {

    class Bridge {
        int src;
        int dest;

        public Bridge(int src, int dest) {
            this.src = src <= dest ? src : dest;
            this.dest = src > dest ? dest : src;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Bridge)) return false;
            Bridge bridge = (Bridge) o;
            return src == bridge.src &&
                    dest == bridge.dest;
        }

        @Override
        public int hashCode() {
            return Objects.hash(src, dest);
        }
    }

    public int makeBridge(int n, int[][] costs) {
        Arrays.sort(costs, Comparator.comparing(cost -> cost[2]));
        Set<Bridge> bridges = new HashSet<>();
        int totalCost = 0;


        for (int i = 0; i < costs.length; i++) {
            Bridge bridge = new Bridge(costs[i][0], costs[i][1]);
            if (bridges.contains(bridge)) {
                continue;
            }
            bridges.add(bridge);
            totalCost += costs[i][2];
        }
        return totalCost;
    }
}
