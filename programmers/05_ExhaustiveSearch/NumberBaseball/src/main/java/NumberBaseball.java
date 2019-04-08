import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberBaseball {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 9;

    public int getCountOfPossibleAnswer(int[][] baseball) {
        List<Integer> allCases = getAllcases();

        for (int[] realCase :
                baseball) {
            int ball = realCase[0];
            int[] result = new int[2];
            result[0] = realCase[1];
            result[1] = realCase[2];

            allCases.removeIf(i -> !Arrays.equals(result, simulate(i, ball)));
        }

        return allCases.size();
    }

    private int[] simulate(int oneCase, int ball) {
        int[] result = new int[2];
        int[] number1 = {(oneCase / 100) % 10, (oneCase / 10) % 10, oneCase % 10};
        int[] number2 = {(ball / 100) % 10, (ball / 10) % 10, ball % 10};

        for (int i = 0; i < number1.length; i++) {
            if(number1[i] == number2[i]) {
                result[0]++;
                continue;
            }
            if(number1[i] == number2[(i + 1) % 3] || number1[i] == number2[(i + 2) % 3]) {
                result[1]++;
                continue;
            }
        }
        return result;
    }

    private List<Integer> getAllcases() {
        List<Integer> allCases = new ArrayList<>();
        for (int i = MIN_NUMBER; i <= MAX_NUMBER; i++) {
            for (int j = MIN_NUMBER; j <= MAX_NUMBER; j++) {
                for (int k =MIN_NUMBER; k <= MAX_NUMBER; k++) {
                    if(i != j && j != k && i != k) {
                        allCases.add(i * 100 + j * 10 + k);
                    }
                }
            }
        }
        return allCases;
    }
}
