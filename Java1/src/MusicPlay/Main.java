package MusicPlay;

import java.util.*;

public class Main {

    private static final ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album();

        album.addSong("Rolling In The Deep", "Adele", 4.5);
        album.addSong("Lemon Tree", "Fool's Garden", 3.5);
        album.addSong("Perfect", "Ed Sheeran", 5.0);
        albums.add(album);

        album = new Album();

        album.addSong("Cheri Cheri Lady", "Modern Talking", 4.5);
        album.addSong("Nothing Gonna Change My Love", "Westlife", 3.5);
        album.addSong("My love", "Westlife", 4.5);

        albums.add(album);

        LinkedList<Song> playList_1 = new LinkedList<>();

        albums.get(0).addToPlayList("Rolling In The Deep", playList_1);
        albums.get(0).addToPlayList("Perfect", playList_1);
        albums.get(1).addToPlayList("My love", playList_1);
        albums.get(1).addToPlayList("Lemon Tree", playList_1);

        play(playList_1);

    }

    private static void play(LinkedList<Song> playList) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0) {
            System.out.println("This playlist have no song");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case 0 -> {
                    System.out.println("Playlist complete");
                    quit = true;
                }
                case 1 -> {
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("no song availble, reached to the end of the list");
                        forward = false;
                    }
                }
                case 2 -> {
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("we are the first song");
                    }
                }
                case 3 -> {
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("we are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("now playing " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("we have reached to the end of list");
                        }
                    }
                }
                case 4 -> printList(playList);
                case 5 -> printMenu();
                case 6 -> {
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("now playing " + listIterator.next().toString());
                        } else {
                            if (listIterator.hasPrevious())
                                System.out.println("now playing " + listIterator.previous().toString());
                        }
                    }
                }
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available options\n press");
        System.out.println("""
                0 - to quit
                1 - to play next song
                2 - to play previous song
                3 - to replay the current song
                4 - list of all songs\s
                5 - print all available options
                6 - delete current song""");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("-----------------");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("-----------------");
    }

}