import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class TowerTest {

    private Tower tower = new Tower();

    @Test
    public void test_1stCase() throws Exception {
        int[] heights = {6,9,5,7,4};

        assertThat(tower.getSignaledTowerIndex(heights)).containsExactly(0,0,2,2,4);
    }

    @Test
    public void test_2ndCase() throws Exception {
        int[] heights = {3,9,9,3,5,7,2};

        assertThat(tower.getSignaledTowerIndex(heights)).containsExactly(0,0,0,3,3,3,6);
    }

    @Test
    public void test_3rdCase() throws Exception {
        int[] heights = {1,5,3,6,7,6,5};

        assertThat(tower.getSignaledTowerIndex(heights)).containsExactly(0,0,2,0,0,5,6);
    }
}