package al.sdacademy.oop.service;

import al.sdacademy.oop.model.User;

public final class DoctorAuthService extends AbstractAuthService {
    
    @Override
    public void login(String staffId, String password) {
        System.out.println("Ask Doctor for 2FA code.");
        System.out.println("Doctor logged in.");
    }
    
    @Override
    public void signup(User user) {
    }
}
