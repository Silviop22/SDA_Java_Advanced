package al.sdacademy.collections.set.hashset.model;

public class User {
    private String username;
    private String password;
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User user = (User) obj;
            return username.equals(user.getUsername()) && password.equals(user.getPassword());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
