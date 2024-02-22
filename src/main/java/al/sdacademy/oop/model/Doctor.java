package al.sdacademy.oop.model;

import java.time.LocalDate;
public class Doctor extends User {
    private String staffId;
    private String practiceField;
    private Department department;
    private LocalDate dateOfHire;
    private LocalDate dateOfTermination;
    private boolean isEmployed;
    
    private Doctor(Builder builder) {
        super(builder);
        this.practiceField = builder.practiceField;
        this.department = builder.department;
        this.dateOfHire = builder.dateOfHire;
        this.dateOfTermination = builder.dateOfTermination;
        this.isEmployed = builder.isEmployed;
    }
    
    public String getStaffId() {
        return staffId;
    }
    
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }
    
    public String getPracticeField() {
        return practiceField;
    }
    
    public void setPracticeField(String practiceField) {
        this.practiceField = practiceField;
    }
    
    public Department getDepartment() {
        return department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }
    
    public LocalDate getDateOfHire() {
        return dateOfHire;
    }
    
    public void setDateOfHire(LocalDate dateOfHire) {
        this.dateOfHire = dateOfHire;
    }
    
    public LocalDate getDateOfTermination() {
        return dateOfTermination;
    }
    
    public void setDateOfTermination(LocalDate dateOfTermination) {
        this.dateOfTermination = dateOfTermination;
    }
    
    public boolean isEmployed() {
        return isEmployed;
    }
    
    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }
    
    public static class Builder extends User.Builder {
        private String practiceField;
        private Department department;
        private LocalDate dateOfHire;
        private LocalDate dateOfTermination;
        private boolean isEmployed;
        
        public Builder() {
            super();
        }
        
        public Builder withPracticeField(String practiceField) {
            this.practiceField = practiceField;
            return this;
        }
        
        public Builder withDepartment(Department department) {
            this.department = department;
            return this;
        }
        
        public Builder withDateOfHire(LocalDate dateOfHire) {
            this.dateOfHire = dateOfHire;
            return this;
        }
        
        public Builder withDateOfTermination(LocalDate dateOfTermination) {
            this.dateOfTermination = dateOfTermination;
            return this;
        }
        
        public Builder withIsEmployed(boolean isEmployed) {
            this.isEmployed = isEmployed;
            return this;
        }
        
        public Doctor build() {
            return new Doctor(this);
        }
    }
}
