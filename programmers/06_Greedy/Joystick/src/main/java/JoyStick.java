import java.util.ArrayList;
import java.util.List;

public class JoyStick {

    private static final int NUMBER_OF_ALPHABETS = 26;

    public int writeName(String name) {
        List<Integer> alphabets = new ArrayList<>();
        setStepsOfAlphabet(name, alphabets);

        int stepOfVertical = alphabets.stream().mapToInt(i -> i).sum();
        int stepOfHorizon = moveLeftRight(alphabets, 0);

        return stepOfVertical + stepOfHorizon;
    }

    private int moveLeftRight(List<Integer> alphabets, int index) {
        if (alphabets.stream().mapToInt(i -> i).sum() == 0) {
            return 0;
        }

        List<Integer> alphabetsMovingLeft = new ArrayList<>(alphabets);
        List<Integer> alphabetsMovingRight = new ArrayList<>(alphabets);

        int leftStep = 0;
        int rightStep = 0;
        int newIndex = 0;

        for (int i = 0; i < alphabets.size(); i++) {
            newIndex = Math.floorMod(index - leftStep, alphabets.size());
            if (checkIndex(newIndex, alphabetsMovingLeft)) break;
            leftStep++;
        }

        leftStep = leftStep + moveLeftRight(alphabetsMovingLeft, newIndex);

        for (int i = 0; i < alphabets.size(); i++) {
            newIndex = Math.floorMod(index + rightStep, alphabets.size());
            if (checkIndex(newIndex, alphabetsMovingRight)) break;
            rightStep++;
        }

        rightStep = rightStep + moveLeftRight(alphabetsMovingRight, newIndex);

        return (leftStep < rightStep) ? leftStep : rightStep;
    }

    private boolean checkIndex(int index, List<Integer> alphabets) {
        if (alphabets.get(index) != 0) {
            alphabets.set(index, 0);
            return true;
        }
        return false;
    }

    private void setStepsOfAlphabet(String name, List<Integer> alphabets) {
        for (int i = 0; i < name.length(); i++) {
            int alphabet = (int) name.charAt(i) - 'A';
            int step = alphabet <= NUMBER_OF_ALPHABETS - alphabet ? alphabet : NUMBER_OF_ALPHABETS - alphabet;
            alphabets.add(step);
        }
    }
}
