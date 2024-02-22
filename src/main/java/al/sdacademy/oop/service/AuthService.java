package al.sdacademy.oop.service;

import al.sdacademy.oop.model.User;

public interface AuthService {
    void login(String identifier, String password);
    void signup(User user);
    void logout();
}
