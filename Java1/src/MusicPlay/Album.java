package MusicPlay;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private final ArrayList<Song> songs;

    public Album() {
        this.songs = new ArrayList<Song>();
    }


    public Song findSong(String title) {

        for (Song checkedSong : songs) {
            if (checkedSong.getTitle().equals(title)) return checkedSong;
        }
        return null;
    }

    public void addSong(String title, String artist, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, artist, duration));
        }
    }

    public void addToPlayList(String title, LinkedList<Song> PlayList) {
        for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                PlayList.add(checkedSong);
                return;
            }
        }
    }
}