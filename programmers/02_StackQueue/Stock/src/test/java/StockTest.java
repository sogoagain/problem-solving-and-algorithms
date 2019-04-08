import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class StockTest {
    @Test
    public void test_StockTest() throws Exception {
           Stock stock = new Stock();

           int[] prices = {1,2,3,2,3};
           assertThat(stock.getPriceFallsTime(prices)).containsExactly(4, 3, 1, 1, 0);
    }
}