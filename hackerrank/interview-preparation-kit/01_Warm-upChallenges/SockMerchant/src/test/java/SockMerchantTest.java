import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SockMerchantTest {

    private SockMerchant sockMerchant = new SockMerchant();

    @Test
    public void test_SockMerchantTest() throws Exception {
        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        assertThat(sockMerchant.getPairOfSock(9, ar)).isEqualTo(3);
    }
}