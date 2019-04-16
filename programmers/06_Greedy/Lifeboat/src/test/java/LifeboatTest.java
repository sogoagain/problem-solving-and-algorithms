import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class LifeboatTest {

    private Lifeboat lifeboat = new Lifeboat();

    @Test
    public void test_1stCase() throws Exception {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        assertThat(lifeboat.takeBoat(people, limit)).isEqualTo(3);
    }

    @Test
    public void test_2ndCase() throws Exception {
        int[] people = {70, 80, 50};
        int limit = 100;
        assertThat(lifeboat.takeBoat(people, limit)).isEqualTo(3);
    }
}