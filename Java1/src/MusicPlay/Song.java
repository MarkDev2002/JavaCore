package MusicPlay;

public class Song {
    private final String title;
    private final double duration;

    private final String artist;

    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;

    }


    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist=" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }
}