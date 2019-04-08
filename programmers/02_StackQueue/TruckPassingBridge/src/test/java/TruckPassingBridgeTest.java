import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class TruckPassingBridgeTest {

    private TruckPassingBridge truckPassingBridge;

    public TruckPassingBridgeTest() {
        truckPassingBridge = new TruckPassingBridge();
    }

    @Test
    public void test_1stCase() throws Exception {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

        assertThat(truckPassingBridge.calculateTimeCrossesBridge(bridge_length, weight, truck_weights)).isEqualTo(8);
    }

    @Test
    public void test_2ndCase() throws Exception {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10};

        assertThat(truckPassingBridge.calculateTimeCrossesBridge(bridge_length, weight, truck_weights)).isEqualTo(101);
    }

    @Test
    public void test_3rdCase() throws Exception {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};

        assertThat(truckPassingBridge.calculateTimeCrossesBridge(bridge_length, weight, truck_weights)).isEqualTo(110);
    }
}