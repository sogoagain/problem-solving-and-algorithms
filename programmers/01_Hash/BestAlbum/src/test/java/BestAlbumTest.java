import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BestAlbumTest {

    private BestAlbum bestAlbum;

    public BestAlbumTest() {
        bestAlbum = new BestAlbum();
    }

    @Test
    public void test_BestAlbum1stCase() throws Exception {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        assertThat(bestAlbum.generateBestAlbum(genres, plays)).containsExactly(4, 1, 3, 0);

    }
}