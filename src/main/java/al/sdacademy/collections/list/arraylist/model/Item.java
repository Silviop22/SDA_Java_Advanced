package al.sdacademy.collections.list.arraylist.model;

public class Item {
    private String name;
    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Item) {
            return name.equals(((Item) obj).getName());
        }
        return false;
    }
  
    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
