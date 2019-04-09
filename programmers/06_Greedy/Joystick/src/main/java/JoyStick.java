import java.util.ArrayList;
import java.util.List;

public class JoyStick {

    private static final int NUMBER_OF_ALPHABETS = 26;

    public int writeName(String name) {
        List<Integer> stepsOfVertical = new ArrayList<>();

        setStepsOfAlphabet(name, stepsOfVertical);

        return 0;

    }

    private int findNextStep(int index, List<Integer> stepsOfVertical) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < stepsOfVertical.size(); i++) {
            if (stepsOfVertical.get(mod((index + left), stepsOfVertical.size())) != 0) {
                return left;
            }

            if (stepsOfVertical.get(mod((index + right), stepsOfVertical.size())) != 0) {
                return right;
            }

            left--;
            right++;
        }
        return 0;
    }

    private int mod(int a, int b) {
        return Math.floorMod(a, b);
    }

    private boolean isWritten(List<Integer> stepsOfVertical) {
        return getSum(stepsOfVertical) != 0;
    }

    private int getSum(List<Integer> stepsOfVertical) {
        return stepsOfVertical.stream().mapToInt(i -> i).sum();
    }

    private void setStepsOfAlphabet(String name, List<Integer> stepsOfVertical) {
        for (int i = 0; i < name.length(); i++) {
            int alphabet = (int) name.charAt(i) - 'A';
            int step = alphabet <= NUMBER_OF_ALPHABETS - alphabet ? alphabet : NUMBER_OF_ALPHABETS - alphabet;
            stepsOfVertical.add(step);
        }
    }
}
