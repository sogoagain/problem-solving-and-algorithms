import java.util.*;

public class MockExam {
    private static final int[][] studentAnswers = {{1, 2, 3, 4, 5}
                                                    , {2, 1, 2, 3, 2, 4, 2, 5}
                                                    , {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

    public int[] getWinner(int[] answers) {
        int[] points = new int[studentAnswers.length];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < studentAnswers.length; j++) {
                int questionNumber = i % studentAnswers[j].length;
                int student = j + 1;
                if(answers[i] == studentAnswers[j][questionNumber]) {
                    points[j]++;
                }
            }
        }

        List<Integer> winners = new ArrayList<>();
        int maxPoint = Arrays.stream(points).max().orElseThrow(NoSuchElementException::new);

        for (int i = 0; i < points.length; i++) {
            if (points[i] != maxPoint) {
                continue;
            }
            winners.add(i + 1);
        }

        return winners.stream().mapToInt(i -> i).toArray();
    }
}
