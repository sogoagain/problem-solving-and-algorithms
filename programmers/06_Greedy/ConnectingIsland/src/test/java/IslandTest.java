import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class IslandTest {

    private Island island = new Island();

    @Test
    public void test_IslandTest() throws Exception {
        int n = 4;
        int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
        int result = 4;

        assertThat(island.makeBridge(n, costs)).isEqualTo(result);

    }
}