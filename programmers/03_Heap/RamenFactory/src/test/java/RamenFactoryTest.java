import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RamenFactoryTest {
    @Test
    public void test_RamenFactoryTest() throws Exception {
        RamenFactory ramenFactory = new RamenFactory();

        int stock = 4;
        int[] dates = {4,10,15};
        int[] supplies = {20,5,10};
        int k = 30;

        assertThat(ramenFactory.getSupplyTimes(stock, dates, supplies, k)).isEqualTo(2);

    }
}