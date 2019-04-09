import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class JoyStickTest {

    private JoyStick joyStick = new JoyStick();

    @Test
    public void test_1stCase() throws Exception {
        String name = "JEROEN";

        assertThat(joyStick.writeName(name)).isEqualTo(56);
    }

    @Test
    public void test_2ndCase() throws Exception {
        String name = "JAN";

        assertThat(joyStick.writeName(name)).isEqualTo(23);
    }

    @Test
    public void test_3rdCase() throws Exception {
        String name = "AAAAAAAAAAAAAAAA";

        assertThat(joyStick.writeName(name)).isEqualTo(0);
    }

    @Test
    public void test_4thCase() throws Exception {
        String name = "JAZ";

        assertThat(joyStick.writeName(name)).isEqualTo(11);
    }

    @Test
    public void test_5thCase() throws Exception {
        String name = "ZZZZZZZZZZ";

        assertThat(joyStick.writeName(name)).isEqualTo(19);
    }

    @Test
    public void test_6thCase() throws Exception {
        String name = "ABABAAAAAAABA";

        assertThat(joyStick.writeName(name)).isEqualTo(10);
    }
}