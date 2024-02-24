package al.sdacademy.collections.list.arraylist.repository;

import al.sdacademy.collections.list.arraylist.model.Item;

public class ItemRepository {
    private Item[] items = new Item[10];
    
    public Item[] getItems() {
        return items;
    }
    
    public Item get(int index) {
        if (index >= 0 && index < items.length) {
            return items[index];
        }
        return null;
    }
    
    public boolean contains(Item item) {
        for (Item existingItem : items) {
            if (existingItem != null && existingItem.equals(item)) {
                return true;
            }
        }
        return false;
    }
    
    public void add(Item item) {
        if (isFull()) {
            items = growArray();
        }
        
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                break;
            }
        }
    }
    
    public void remove(int index) {
        if (index >= 0 && index < items.length) {
            System.arraycopy(items, index + 1, items, index, items.length - index - 1);
            items[items.length - 1] = null;
            items = shrinkArray();
        }
    }
    
    public String printAll() {
        StringBuilder result = new StringBuilder();
        for (Item item : items) {
            if (item != null) {
                result.append(item.getName()).append(", ");
            }
        }
        return result.toString();
    }

    private boolean isFull() {
        for (Item item : items) {
            if (item == null) {
                return false;
            }
        }
        
        return true;
    }
    
    private Item[] growArray() {
        Item[] newArray = new Item[items.length + 1];
        System.arraycopy(items, 0, newArray, 0, items.length);
        return newArray;
    }

    private Item[] shrinkArray() {
        for (int i = items.length - 1; i >= 0; i--) {
            if (items[i] != null) {
                Item[] newArray = new Item[i + 1];
                System.arraycopy(items, 0, newArray, 0, i + 1);
                return newArray;
            }
        }
        return new Item[0];
    }
}
