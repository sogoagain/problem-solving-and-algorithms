import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class PrimeNumberTest {
    private PrimeNumber primeNumber = new PrimeNumber();

    @Test
    public void test_1stCase() throws Exception {
        String numbers = "17";

        assertThat(primeNumber.findPrimeNumber(numbers)).isEqualTo(3);
    }

    @Test
    public void test_2ndCase() throws Exception {
        String numbers = "011";

        assertThat(primeNumber.findPrimeNumber(numbers)).isEqualTo(2);
    }
}