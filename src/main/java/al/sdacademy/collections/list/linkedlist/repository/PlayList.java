package al.sdacademy.collections.list.linkedlist.repository;


import al.sdacademy.collections.list.linkedlist.model.Song;

public class PlayList {
    Song start;
    Song end;
    Song current;
    int size = 0;
    
    public void addSong(String title, String artist) {
        Song newSong = new Song(title, artist);
        
        if (start == null) {
            start = newSong;
            end = newSong;
        } else {
            end.next = newSong;
            newSong.prev = end;
            end = newSong;
        }
        size++;
    }
    
    public void nextSong() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }
    
    public void prevSong() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }
    
    public String play() {
        String result = "Playlist is empty!";
        if (current != null) {
            result = "Playing: " + current.getTitle() + " by " + current.getArtist();
        }
        
        return result;
    }
    
    public boolean contains(String title) {
        Song currentSong = start;
        while (currentSong != null) {
            if (currentSong.getTitle().equals(title)) {
                return true;
            }
            currentSong = currentSong.next;
        }
        return false;
    }
    
    public void remove(String title) {
        if (!contains(title)) {
            return;
        }
        
        size--;
        Song currentSong = start;
        while (currentSong != null) {
            if (currentSong.getTitle().equals(title)) {
                if (currentSong.prev != null) {
                    currentSong.prev.next = currentSong.next;
                } else {
                    start = currentSong.next;
                }
                if (currentSong.next != null) {
                    currentSong.next.prev = currentSong.prev;
                } else {
                    end = currentSong.prev;
                }
                return;
            }
            currentSong = currentSong.next;
        }
    }
    
    public String display() {
        if (start == null) {
            return "Playlist is empty!";
        }
        
        StringBuilder builder = new StringBuilder();
        
        Song temp = start;
        while (temp != null) {
            builder.append(temp.getTitle());
            
            if (temp.next != null) {
                builder.append(", ");
            }
            
            temp = temp.next;
        }
        
        return builder.toString();
    }
    
    public int getSize() {
        return size;
    }
    
    public String addAt(int position, Song newSong) {
        // if the position is 0 or less, add at the beginning
        if (position <= 0) {
            newSong.next = start;
            if (start != null) {
                start.prev = newSong;
            }
            start = newSong;
            if (end == null) {
                end = newSong;
            }
            
            size++;
            return "Song added at the beginning";
        }
        
        // if new position is beyond the current size, add at the end
        if (position >= size) {
            end.next = newSong;
            newSong.prev = end;
            end = newSong;
            
            size++;
            return "Song added at the end";
        }
        
        // if new position is somewhere in the middle
        Song currentSong = start;
        for(int i = 0; i < position - 1; i++){
            currentSong = currentSong.next;
        }
        
        newSong.next = currentSong.next;
        newSong.prev = currentSong;
        currentSong.next.prev = newSong;
        currentSong.next = newSong;
        
        size++;
        return "Song added at position: " + position;
    }
    
    public Song get(int index) {
        // check if the index is out of bounds
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        
        Song currentSong = start;
        for(int i = 0; i < index; i++){
            currentSong = currentSong.next;
        }
        
        return currentSong;
    }
    
    public String clear() {
        start = end = null;
        size = 0;
        return "Playlist cleared";
    }
}
