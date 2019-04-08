import java.util.*;


public class BestAlbum {

    class Genre implements Comparable<Genre> {
        private String name;
        private int playCount;

        public Genre(String name, int playCount) {
            this.name = name;
            this.playCount = playCount;
        }

        @Override
        public int compareTo(Genre o) {
            return o.playCount - this.playCount;
        }
    }

    class Song implements Comparable<Song> {
        private int id;
        private int playCount;

        public Song(int id, int playCount) {
            this.id = id;
            this.playCount = playCount;
        }

        @Override
        public int compareTo(Song o) {
            return o.playCount - this.playCount;
        }
    }


    public int[] generateBestAlbum(String[] genres, int[] plays) {

        Map<String, List<Song>> tracks = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            if (!tracks.containsKey(genres[i])) {
               tracks.put(genres[i], new ArrayList<>());
            }
            List<Song> songsInGenre = tracks.get(genres[i]);
            songsInGenre.add(new Song(i, plays[i]));
        }

        Set<String> genresSet = tracks.keySet();
        List<Genre> genreList = new ArrayList<>();
        for (String genreName :
                genresSet) {
            Collections.sort(tracks.get(genreName));
            int genrePlayCount = tracks.get(genreName).stream().mapToInt(i -> i.playCount).sum();
            Genre genre = new Genre(genreName, genrePlayCount);
            genreList.add(genre);
        }
        Collections.sort(genreList);

        List<Integer> bestAlbum = new ArrayList<>();
        for (Genre genre :
                genreList) {
            for (int i = 0; i < tracks.get(genre.name).size() && i < 2; i++) {
                bestAlbum.add(tracks.get(genre.name).get(i).id);
            }
        }

        return bestAlbum.stream().mapToInt(i->i).toArray();
    }
}
