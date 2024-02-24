package al.sdacademy.collections.list.arraylist;


import al.sdacademy.collections.list.arraylist.model.Item;
import al.sdacademy.collections.list.arraylist.repository.ItemRepository;

import java.util.logging.Logger;


public class Main {
    private static final ItemRepository REPOSITORY = new ItemRepository();
    private static final Logger LOG = Logger.getLogger(Main.class.getName());
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            REPOSITORY.add(new Item("item" + i));
            
        }
        LOG.info(REPOSITORY.printAll());
        
        LOG.info("Adding item 10");
        REPOSITORY.add(new Item("item10"));
        LOG.info(REPOSITORY.printAll());
        
        LOG.info("Adding duplicated item 10");
        REPOSITORY.add(new Item("item10"));
        LOG.info(REPOSITORY.printAll());
        
        LOG.info("Removing item 6");
        REPOSITORY.remove(6);
        LOG.info(REPOSITORY.printAll());
        
        LOG.info("Getting item 7");
        LOG.info(REPOSITORY.get(7).getName());
        
        LOG.info("Checking if item 7 exists");
        LOG.info(String.valueOf(REPOSITORY.contains(new Item("item7"))));
        
        LOG.info("Checking if item 6 exists");
        LOG.info(String.valueOf(REPOSITORY.contains(new Item("item6"))));
    }
}
