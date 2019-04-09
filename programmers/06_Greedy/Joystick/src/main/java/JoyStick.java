import java.util.ArrayList;
import java.util.List;

public class JoyStick {

    private static final int NUMBER_OF_ALPHABETS = 26;
    private int index = 0;

    public int writeName(String name) {
        // List에 name으로 주어진 각 알파벳을 A로 부터 얼마나 가야할 지 저장.
        System.out.println(-1 % 6);
        List<Integer> stepsOfVertical = new ArrayList<>();

        setStepsOfAlphabet(name, stepsOfVertical);

        int index = 0;
        int stepOfVertical = 0;
        int stepOfHorizon = 0;
        while(isWritten(stepsOfVertical)) {
            stepOfVertical += stepsOfVertical.get(index);
            stepsOfVertical.set(index, 0);

            int nextStepOfHorizon = findNextStep(index, stepsOfVertical);
            stepOfHorizon += Math.abs(nextStepOfHorizon);

            index = index + nextStepOfHorizon % stepsOfVertical.size();
        }

        return stepOfHorizon + stepOfVertical;
    }

    private int findNextStep(int index, List<Integer> stepsOfVertical) {
        int left = 0;
        int right = 0;

        while (stepsOfVertical.get((index + left) % stepsOfVertical.size()) == 0
                || stepsOfVertical.get((index + right) % stepsOfVertical.size()) == 0) {
            left--;
            right++;
        }


        return Math.abs(left) <= right ? left : right;
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
