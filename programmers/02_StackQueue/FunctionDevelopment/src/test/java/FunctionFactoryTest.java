import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FunctionFactoryTest {

    private FunctionFactory factory = new FunctionFactory();

    @Test
    public void test_1stCase() throws Exception {
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};

        assertThat(factory.publishFunction(progresses, speeds)).containsExactly(2, 1);
    }
}