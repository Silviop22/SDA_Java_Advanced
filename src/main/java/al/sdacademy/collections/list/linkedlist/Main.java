package al.sdacademy.collections.list.linkedlist;

import al.sdacademy.collections.list.linkedlist.repository.PlayList;
import al.sdacademy.collections.list.linkedlist.model.Song;

import java.util.logging.Logger;

public class Main {
    
    private static final PlayList PLAY_LIST = new PlayList();
    private static final Logger LOG = Logger.getLogger(Main.class.getName());
    
    public static void main(String[] args) {
        PLAY_LIST.addSong("Song A", "Artist A");
        PLAY_LIST.addSong("Song B", "Artist B");
        PLAY_LIST.addSong("Song C", "Artist C");

        // Display the playlist
        LOG.info(PLAY_LIST.display());

        // Remove a song from the playlist
        PLAY_LIST.remove("Song A");
        LOG.info("Playlist after removing a song: ");
        LOG.info(PLAY_LIST.display());

        // Check if a song is in the playlist
        if (PLAY_LIST.contains("Song B")) {
            LOG.info("Song B is in the playlist.");
        } else {
            LOG.info("Song B is not in the playlist.");
        }

        // Check the size of the playlist
        LOG.info("The playlist has " + PLAY_LIST.getSize() + " songs.");

        // We assume there's a method to add a song at a specific position
        LOG.info(PLAY_LIST.addAt(1, new Song("Song D", "Artist D")));
        LOG.info("Playlist after adding a song at a specific position: ");
        LOG.info(PLAY_LIST.display());

        // We assume there's a method to retrieve a song at a specific index
        Song song = PLAY_LIST.get(2);
        LOG.info("The song at index 2 is " + song.getTitle() + ".");

        // Clear the playlist
        PLAY_LIST.clear();
        LOG.info("Playlist after clearing: ");
        LOG.info(PLAY_LIST.display());
    }
}
