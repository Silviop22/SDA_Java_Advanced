package al.sdacademy.oop.model;

import java.util.Set;

public class Patient extends User {
    private Set<String> medications;
    private Set<String> priorConditions;
    
    protected Patient(Builder builder) {
        super(builder);
    }
    
    public Set<String> getMedications() {
        return medications;
    }
    
    public void setMedications(Set<String> medications) {
        this.medications = medications;
    }
    
    public Set<String> getPriorConditions() {
        return priorConditions;
    }
    
    public void setPriorConditions(Set<String> priorConditions) {
        this.priorConditions = priorConditions;
    }
    
    @Override
    public String getRoleDescription() {
        return "This user is a patient.";
    }
}
