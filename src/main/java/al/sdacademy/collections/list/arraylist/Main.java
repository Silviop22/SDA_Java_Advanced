package al.sdacademy.collections.list.arraylist;


import al.sdacademy.collections.list.arraylist.model.Item;
import al.sdacademy.collections.list.arraylist.repository.ItemRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;


public class Main {
    private static final Logger LOG = Logger.getLogger(Main.class.getName());
    
    public static void main(String[] args) {
        showcaseTraditionalArrays();
        showcaseList();
    }
    
    private static void showcaseList() {
        List<Item> itemList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            itemList.add(new Item("item" + i));
        }
        itemList.forEach(i -> LOG.info(i.toString()));
        
        LOG.info("Adding item 10");
        itemList.add(new Item("item10"));
        itemList.forEach(i -> LOG.info(i.toString()));
        
        // The Collection API offers two ways to remove an element from the collection
        // one would be using the index and the other passing an object as an argument 
        // which is equals to the element we are trying to remove. 
        // Unless we implement our own equals method to the Item class in this case
        // the remove(Object obj) method will not work;
        LOG.info("Removing item 6");
        itemList.remove(6);
        itemList.remove(new Item("item10"));
        itemList.forEach(i -> LOG.info(i.toString()));
        
        LOG.info("Getting item 7");
        LOG.info(itemList.get(7).getName());
        
        LOG.info("Checking if item 7 exists");
        LOG.info(String.valueOf(itemList.contains(new Item("item7"))));
        
        LOG.info("Checking if item 6 exists");
        LOG.info(String.valueOf(itemList.contains(new Item("item6"))));
        
        // Another benefit of using Collections in this case would be the addAll(Collection coll) method
        // Using this method we can join two lists into one
        itemList.addAll(List.of(new Item("item22"), new Item("Item33")));
        itemList.forEach(i -> LOG.info(i.toString()));
        
        // We can also get the intersection of two Lists. Say we have two and we want to find only the common
        // elements on both lists:
        List<Integer> numberListA = new ArrayList<>();
        numberListA.add(1);
        numberListA.add(4);
        numberListA.add(3);
        numberListA.add(2);
        numberListA.add(6);
        numberListA.add(13);
        numberListA.add(2);
        numberListA.add(4);
        List<Integer> numberListB = Arrays.asList(1, 8, 10, 13, 2, 4);
        numberListA.retainAll(numberListB);
        numberListA.forEach(i -> LOG.info(i.toString()));
        
        // Keep in mind that be using retain all we are removing elements from
        // numberListA which is a mutable collection (it is allowed to change)
        // As long as the list we are making the changes on is mutable we should be fine
        // if we were to hit numberListB.retainAll(numberListA); then we would get an Exception
        // since numberListB is an immutable collection.
        
    }
    
    private static void showcaseTraditionalArrays() {
        final ItemRepository repository = new ItemRepository();
        
        for (int i = 0; i < 10; i++) {
            repository.add(new Item("item" + i));
            
        }
        
        LOG.info("Adding duplicated item 10");
        repository.add(new Item("item10"));
        LOG.info(repository.printAll());
        
        LOG.info("Removing item 6");
        repository.remove(6);
        LOG.info(repository.printAll());
        
        LOG.info("Getting item 7");
        LOG.info(repository.get(7).getName());
        
        LOG.info("Checking if item 7 exists");
        LOG.info(String.valueOf(repository.contains(new Item("item7"))));
        
        LOG.info("Checking if item 6 exists");
        LOG.info(String.valueOf(repository.contains(new Item("item6"))));
    }
}
