import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthNumber {
    public int[] getKthNumbers(int[] array, int[][] commands) {
        List<Integer> numbers = new ArrayList<>();

        for (int[] command :
                commands) {
            numbers.add(getKthNumber(array, command));
        }

        return numbers.stream().mapToInt(i -> i).toArray();
    }

    private int getKthNumber(int[] array, int[] commands) {
        int[] subArray = Arrays.copyOfRange(array, commands[0] - 1, commands[1]);
        Arrays.sort(subArray);
        return subArray[commands[2] - 1];
    }
}
