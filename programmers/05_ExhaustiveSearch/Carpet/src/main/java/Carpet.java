import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Carpet {
    public int[] getSize(int brown, int red) {
        List<Integer> size = new ArrayList<>();

        for (int row = 1; row <= red; row++) {
            if (red % row != 0) {
                continue;
            }
            int redsInRow = red / row;
            int expectedBrown = row * 2 + redsInRow * 2 + 4;
            if (expectedBrown == brown) {
                size.add(row + 2);
                size.add(redsInRow + 2);
                break;
            }
        }

        return size.stream().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
    }
}