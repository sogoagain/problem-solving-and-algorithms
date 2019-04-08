import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MoreSpicyTest {
    @Test
    public void test_1stCase() throws Exception {
        MoreSpicy moreSpicy = new MoreSpicy();

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        assertThat(moreSpicy.getMixedCount(scoville, K)).isEqualTo(2);
    }
}