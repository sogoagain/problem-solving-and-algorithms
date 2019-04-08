import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class NumberBaseballTest {
    @Test
    public void test_NumberBaseballTest() throws Exception {
        NumberBaseball numberBaseball = new NumberBaseball();
        int[][] baseball = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};

        assertThat(numberBaseball.getCountOfPossibleAnswer(baseball)).isEqualTo(2);
    }
}