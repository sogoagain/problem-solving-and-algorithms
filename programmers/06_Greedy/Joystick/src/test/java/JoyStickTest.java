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
}