package al.sdacademy.collections.map.hashmap.repository;

import al.sdacademy.collections.map.hashmap.model.Entry;

public class StudentGradeBook {
    private final Entry[] table;
    private int size = 0;
    private int capacity = 300;
    
    public StudentGradeBook() {
        this.table = new Entry[capacity];
    }
    
    // Add student and grade
    public void add(String key, Double value) {
        int index = getHash(key) % capacity;
        Entry newEntry = new Entry(key, value);
        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            Entry runner = table[index];
            while (runner.next != null) {
                if(runner.key.equals(key)) {
                    runner.value = value;
                    return;
                }
                runner = runner.next;
            }
            if(runner.key.equals(key)) {
                runner.value = value;
                return;
            }
            runner.next = newEntry;
        }
        size++;
    }
    
    // Remove student entry
    public void remove(String key) {
        int index = getHash(key) % capacity;
        Entry runner = table[index];
        if (runner != null && runner.key.equals(key)) {
            table[index] = runner.next;
            size--;
        } else {
            while(runner != null) {
                if(runner.next != null && runner.next.key.equals(key)) {
                    runner.next = runner.next.next;
                    size--;
                }
                runner = runner.next;
            }
        }
    }
    
    // Retrieve grade
    public Double get(String key) {
        int index = getHash(key) % capacity;
        Entry runner = table[index];
        while (runner != null) {
            if (runner.key.equals(key)) {
                return runner.value;
            }
            runner = runner.next;
        }
        return null;
    }
    
    // Return current size
    public int getSize() {
        return size;
    }
    
    
    private int getHash(String key) {
        return key.hashCode();
    }
}
