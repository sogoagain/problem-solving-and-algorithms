import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BigNumberTest {

    private BigNumber bigNumber = new BigNumber();

    @Test
    public void test_1stCase() throws Exception {
        String number = "1924";
        int k = 2;

        assertThat(bigNumber.getBigNumber(number, k)).isEqualTo("94");
    }

    @Test
    public void test_2ndCase() throws Exception {
        String number = "1231234";
        int k = 3;

        assertThat(bigNumber.getBigNumber(number, k)).isEqualTo("3234");
    }

    @Test
    public void test_3rdCase() throws Exception {
        String number = "4177252841";
        int k = 4;

        assertThat(bigNumber.getBigNumber(number, k)).isEqualTo("775841");
    }

    @Test
    public void test_4thCase() throws Exception {
        String number = "999999999";
        int k = 3;

        assertThat(bigNumber.getBigNumber(number, k)).isEqualTo("999999");
    }
}