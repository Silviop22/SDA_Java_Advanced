package al.sdacademy.collections.set.hashset;

import al.sdacademy.collections.set.hashset.model.User;
import al.sdacademy.collections.set.hashset.old.repository.UserRepository;
import al.sdacademy.util.TimerDecorator;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class Main {
    private static final UserRepository REPOSITORY = new UserRepository();
    private static final Logger LOG = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            REPOSITORY.add(new User("user" + i, "password" + i));
        }
        LOG.info(REPOSITORY.printAll());
        
        LOG.info("Adding user 10");
        REPOSITORY.add(new User("user10", "password10"));
        LOG.info(REPOSITORY.printAll());
        
        LOG.info("Adding duplicated user 10");
        REPOSITORY.add(new User("user10", "password10"));
        LOG.info(REPOSITORY.printAll());
        
        LOG.info("Removing user 6");
        REPOSITORY.remove(6);
        LOG.info(REPOSITORY.printAll());
        
        LOG.info("Getting user 7");
        LOG.info(REPOSITORY.get(7).getUsername());
        
        LOG.info("Checking if user 7 exists");
        LOG.info(String.valueOf(REPOSITORY.contains(new User("user7", "password7"))));
        
        LOG.info("Checking if user 6 exists");
        LOG.info(String.valueOf(REPOSITORY.contains(new User("user6", "password6"))));
        
    }
}
