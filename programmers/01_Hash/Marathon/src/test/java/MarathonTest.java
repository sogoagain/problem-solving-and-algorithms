import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MarathonTest {

    private Marathon marathon;

    public MarathonTest() {
        marathon = new MarathonUsingHashMap();
//        marathon = new MarathonUsingList();
    }

    @Test
    public void test_Marathon_1st_Case() throws Exception {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        assertThat(marathon.findPersonWhoCantFinish(participant, completion)).isEqualTo("leo");
    }

    @Test
    public void test_Marathon_2nd_Case() throws Exception {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        assertThat(marathon.findPersonWhoCantFinish(participant, completion)).isEqualTo("vinko");
    }

    @Test
    public void test_Marathon_3rd_Case() throws Exception {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        assertThat(marathon.findPersonWhoCantFinish(participant, completion)).isEqualTo("mislav");
    }

    @Test
    public void test_Marathon_4th_Case() throws Exception {
        String[] participant = {"aaa", "aaa", "aaa", "bbb", "bbb", "ccc"};
        String[] completion = {"aaa", "aaa", "bbb", "bbb", "aaa"};

        assertThat(marathon.findPersonWhoCantFinish(participant, completion)).isEqualTo("ccc");
    }

    @Test
    public void test_Marathon_5th_Case() throws Exception {
        String[] participant = {"aaa", "aaa", "aaa", "bbb", "bbb", "ccc"};
        String[] completion = {"aaa", "aaa", "bbb", "bbb", "ccc"};

        assertThat(marathon.findPersonWhoCantFinish(participant, completion)).isEqualTo("aaa");
    }
}