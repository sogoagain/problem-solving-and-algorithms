import java.util.*;
import java.util.stream.Collectors;

public class Lifeboat {
    public int takeBoat(int[] people, int limit) {
        List<Integer> peopleList = Arrays.stream(people)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        int boats = 0;
        int weight = 0;
        int rightIndex = peopleList.size() - 1;

        for (int i = 0; i <= rightIndex; i++) {
            weight = peopleList.get(i);

            for (int j = rightIndex; j > i; j--) {
                int expectedWeight = weight + peopleList.get(j);
                if (expectedWeight > limit) {
                    break;
                }
                weight = expectedWeight;
                rightIndex = j - 1;
            }
            weight = 0;
            boats++;
        }

        return boats;
    }
}
