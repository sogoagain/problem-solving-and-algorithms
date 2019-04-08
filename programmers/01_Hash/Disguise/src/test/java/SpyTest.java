import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SpyTest {
    private Spy spy;

    public SpyTest() {
        spy = new Spy();
    }

    @Test
    public void test_Spy1stCase() throws Exception {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        assertThat(spy.disguise(clothes)).isEqualTo(5);
    }

    @Test
    public void test_Spy2stCase() throws Exception {
        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        assertThat(spy.disguise(clothes)).isEqualTo(3);
    }
}