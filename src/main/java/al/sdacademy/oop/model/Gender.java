package al.sdacademy.oop.model;

public enum Gender {
    M("Male"),
    F("Female");
    
    private final String genderName;
    
    // Constructor
    Gender(final String genderName) {
        this.genderName = genderName;
    }
    
    // Getter
    public String getGenderName() {
        return this.genderName;
    }
}
