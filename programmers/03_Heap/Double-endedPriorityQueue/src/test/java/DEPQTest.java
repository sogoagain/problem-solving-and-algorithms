import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class DEPQTest {
    @Test
    public void test_1stCase() throws Exception {
        DEPQ depq = new DEPQ();
        String[] operations = {"I 16","D 1"};

        assertThat(depq.simulate(operations)).containsExactly(0, 0);
    }

    @Test
    public void test_2ndCase() throws Exception {
        DEPQ depq = new DEPQ();
        String[] operations = {"I 7","I 5","I -5","D -1"};

        assertThat(depq.simulate(operations)).containsExactly(7, 5);
    }

    @Test
    public void test_3rdCase() throws Exception {
        DEPQ depq = new DEPQ();
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};

        assertThat(depq.simulate(operations)).containsExactly(0, 0);
    }

}