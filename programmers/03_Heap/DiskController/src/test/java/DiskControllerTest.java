import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class DiskControllerTest {
    @Test
    public void test_1stCase() throws Exception {
        DiskController diskController = new DiskController();

        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};

        assertThat(diskController.getMinimumAverageProcessingTime(jobs)).isEqualTo(9);
    }

    @Test
    public void test_2ndCase() throws Exception {
        DiskController diskController = new DiskController();

        int[][] jobs = {{0, 3}, {0, 9}, {0, 6}};

        assertThat(diskController.getMinimumAverageProcessingTime(jobs)).isEqualTo(10);
    }
}