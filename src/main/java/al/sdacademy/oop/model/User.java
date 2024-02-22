package al.sdacademy.oop.model;

import java.time.LocalDate;
public class User {
    private Long id;
    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private String emailAddress;
    private int age;
    private LocalDate birthday;
    private boolean accountEnabled;
    private Role role;
    private Gender gender;
    
    public String getRoleDescription() {
        return "This user is generic.";
    }
    
    protected User(Builder builder) {
        this.userName = builder.userName;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.password = builder.password;
        this.emailAddress = builder.emailAddress;
        this.age = builder.age;
        this.birthday = builder.birthday;
        this.accountEnabled = builder.accountEnabled;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public static class Builder {
        private String userName;
        private String firstName;
        private String lastName;
        private String password;
        private String emailAddress;
        private int age;
        private LocalDate birthday;
        private boolean accountEnabled;
        private Role role;
        private Gender gender;
        
        public Builder withUserName(String userName) {
            this.userName = userName;
            return this;
        }
        
        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        
        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        
        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }
        
        public Builder withEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }
        
        public Builder withAge(int age) {
            this.age = age;
            return this;
        }
        
        public Builder withBirthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }
        
        public Builder withAccountEnabled(boolean accountEnabled) {
            this.accountEnabled = accountEnabled;
            return this;
        }
        
        public Builder withRole(Role role) {
            this.role = role;
            return this;
        }
        
        public Builder withGender(Gender gender) {
            this.gender = gender;
            return this;
        }
        
        public User build() {
            return new User(this);
        }
    }
}
