import java.util.*;
import java.util.stream.Collectors;

public class Lifeboat {
    public int takeBoat(int[] people, int limit) {
        List<Integer> peopleList = Arrays.stream(people)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        int boats = 1;

        Iterator<Integer> iterator = peopleList.iterator();

        int totalWeight = 0;
        while (!peopleList.isEmpty()) {
            if (!iterator.hasNext()) {
               iterator = peopleList.iterator();
               totalWeight = 0;
               boats++;
               continue;
            }

            int person = iterator.next();
            if (totalWeight + person <= limit) {
                totalWeight += person;
                iterator.remove();
            }
        }

        return boats;
    }
}
