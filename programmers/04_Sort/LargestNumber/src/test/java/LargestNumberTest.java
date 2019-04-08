import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.assertj.core.api.Assertions.*;

public class LargestNumberTest {
    private LargestNumber largestNumber = new LargestNumber();

    @Test
    public void test_1stCase() throws Exception {
        int[] numbers = {6, 10, 2};

        assertThat(largestNumber.getLargestNumber(numbers)).isEqualTo("6210");
    }

    @Test
    public void test_2ndCase() throws Exception {
        int[] numbers = {3, 30, 34, 5, 9};

        assertThat(largestNumber.getLargestNumber(numbers)).isEqualTo("9534330");
    }

    @Test
    public void test_3rdCase() throws Exception {
        int[] numbers = {921, 192, 291, 9, 9};

        assertThat(largestNumber.getLargestNumber(numbers)).isEqualTo("99921291192");
    }

    @Test
    public void test_4thCase() throws Exception {
        int[] numbers = {0, 0, 0, 0, 0};

        assertThat(largestNumber.getLargestNumber(numbers)).isEqualTo("0");
    }
}