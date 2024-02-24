package al.sdacademy.collections.list.linkedlist.model;

public class Song {
    private String title;
    private String artist;
    public Song next;
    public Song prev;
    
    // Constructor
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getArtist() {
        return artist;
    }
}

