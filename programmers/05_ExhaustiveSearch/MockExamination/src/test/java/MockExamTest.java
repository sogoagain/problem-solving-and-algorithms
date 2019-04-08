import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MockExamTest {
    private MockExam mockExam = new MockExam();

    @Test
    public void test_1stCase() throws Exception {
        int[] answers = {1, 2, 3, 4, 5};
        assertThat(mockExam.getWinner(answers)).containsExactly(1);
    }

    @Test
    public void test_2ndCase() throws Exception {
        int[] answers = {1, 3, 2, 4, 2};
        assertThat(mockExam.getWinner(answers)).containsExactly(1, 2, 3);
    }
}