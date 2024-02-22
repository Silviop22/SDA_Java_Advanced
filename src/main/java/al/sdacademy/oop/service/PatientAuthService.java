package al.sdacademy.oop.service;

import al.sdacademy.oop.model.User;

public final class PatientAuthService extends AbstractAuthService {
    
    @Override
    public void login(String identifier, String password) {
        System.out.println("Patient logged in.");
    }
    
    @Override
    public void signup(User user) {
    }
}
