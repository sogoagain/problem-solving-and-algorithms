import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class GymSuitTest {

    private GymSuit gymSuit = new GymSuit();

    @Test
    public void test_1stCase() throws Exception {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        assertThat(gymSuit.getNumberOfStudentsInClass(n, lost, reserve)).isEqualTo(5);
    }

    @Test
    public void test_2ndCase() throws Exception {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};

        assertThat(gymSuit.getNumberOfStudentsInClass(n, lost, reserve)).isEqualTo(4);
    }

    @Test
    public void test_3rdCase() throws Exception {
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};

        assertThat(gymSuit.getNumberOfStudentsInClass(n, lost, reserve)).isEqualTo(2);
    }

    @Test
    public void test_4thCase() throws Exception {
        int n = 8;
        int[] lost = {3, 5, 7};
        int[] reserve = {2, 6, 8};

        assertThat(gymSuit.getNumberOfStudentsInClass(n, lost, reserve)).isEqualTo(8);
    }
}