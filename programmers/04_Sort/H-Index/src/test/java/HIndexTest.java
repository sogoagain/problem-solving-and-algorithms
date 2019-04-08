import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class HIndexTest {
    @Test
    public void test_HIndexTest() throws Exception {
        HIndex hIndex = new HIndex();
        int[] citations = {3, 0, 6, 1, 5};

        assertThat(hIndex.getHIndex(citations)).isEqualTo(3);
    }
}