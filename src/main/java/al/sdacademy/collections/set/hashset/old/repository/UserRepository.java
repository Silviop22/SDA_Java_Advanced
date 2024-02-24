package al.sdacademy.collections.set.hashset.old.repository;

import al.sdacademy.collections.set.hashset.model.User;

public class UserRepository {
    private User[] users = new User[10];
    
    public User get(int index) {
        if (index >= 0 && index < users.length) {
            return users[index];
        }
        return null;
    }
    
    public boolean contains(User user) {
        for (User existingUser : users) {
            if (existingUser != null && existingUser.equals(user)) {
                return true;
            }
        }
        return false;
    }
    
    public void add(User user) {
        if (contains(user)) {
            return;
        }
        
        if (isFull()) {
            users = growArray();
        }
        
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                break;
            }
        }
    }
    
    public void remove(int index) {
        if (index >= 0 && index < users.length) {
            System.arraycopy(users, index + 1, users, index, users.length - index - 1);
            users[users.length - 1] = null;
            users = shrinkArray();
        }
    }
    
    public String printAll() {
        StringBuilder result = new StringBuilder();
        for (User user : users) {
            if (user != null) {
                result.append(user.getUsername()).append(", ");
            }
        }
        return result.toString();
    }
    
    private boolean isFull() {
        for (User user : users) {
            if (user == null) {
                return false;
            }
        }
        
        return true;
    }
    
    private User[] growArray() {
        User[] newArray = new User[users.length + 1];
        System.arraycopy(users, 0, newArray, 0, users.length);
        return newArray;
    }
    
    private User[] shrinkArray() {
        for (int i = users.length - 1; i >= 0; i--) {
            if (users[i] != null) {
                User[] newArray = new User[i + 1];
                System.arraycopy(users, 0, newArray, 0, i + 1);
                return newArray;
            }
        }
        return new User[0];
    }
}
