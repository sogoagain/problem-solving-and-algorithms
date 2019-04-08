import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class KthNumberTest {
    private KthNumber kthNumber = new KthNumber();

    @Test
    public void test_1stCase() throws Exception {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        assertThat(kthNumber.getKthNumbers(array, commands)).containsExactly(5, 6, 3);
    }
}