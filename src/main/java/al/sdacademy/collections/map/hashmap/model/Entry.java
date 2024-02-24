package al.sdacademy.collections.map.hashmap.model;

public class Entry {
    public String key;
    public Double value;
    public Entry next;
    
    public Entry(String key, Double value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
