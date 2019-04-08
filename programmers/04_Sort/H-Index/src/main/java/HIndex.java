import java.util.Arrays;
import java.util.Comparator;

public class HIndex {
    public int getHIndex(int[] citations) {
        int[] orderedCitations = Arrays.stream(citations).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();

        for (int i = 0; i < orderedCitations.length; i++) {
            int h = i + 1;
            if (h > orderedCitations[i]) {
                return h - 1;
            }
        }
        return orderedCitations.length;
    }
}
