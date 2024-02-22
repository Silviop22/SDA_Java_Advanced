package al.sdacademy.oop.service;


public abstract class AbstractAuthService implements AuthService {
    
    @Override
    public void logout() {
        System.out.println("Session ended.");
    }
}
