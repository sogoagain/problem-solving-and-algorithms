import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CarpetTest {
    private Carpet carpet = new Carpet();

    @Test
    public void test_1stCase() throws Exception {
        int brown = 10;
        int red = 2;

        assertThat(carpet.getSize(brown, red)).containsExactly(4, 3);
    }

    @Test
    public void test_2ndCase() throws Exception {
        int brown = 8;
        int red = 1;

        assertThat(carpet.getSize(brown, red)).containsExactly(3, 3);
    }

    @Test
    public void test_3rdCase() throws Exception {
        int brown = 24;
        int red = 24;

        assertThat(carpet.getSize(brown, red)).containsExactly(8, 6);
    }
}