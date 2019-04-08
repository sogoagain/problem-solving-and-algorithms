import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class IronRodTest {
    private IronRod ironRod;

    public IronRodTest() {
        ironRod = new IronRod();
    }

    @Test
    public void test_IronRodTest() throws Exception {
        String arrangement = "()(((()())(())()))(())";

        assertThat(ironRod.cut(arrangement)).isEqualTo(17);
    }
}