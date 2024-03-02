package al.sdacademy.functional.suplier;

import al.sdacademy.functional.suplier.model.EmployeeProfile;
import al.sdacademy.functional.suplier.model.StudentProfile;
import al.sdacademy.functional.suplier.model.UserProfile;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class UserProfileManagerSupplier {
    private static Map<String, Supplier<UserProfile>> profileTemplates = new HashMap<>();

    static {
        profileTemplates.put("student", StudentProfile::new);
        profileTemplates.put("employee", EmployeeProfile::new);
    }

    public static void main(String[] args) {
        // Example usage
        String userInput = "employee";
        UserProfile userProfile = getUserProfile(userInput, UserProfile::new);

        System.out.println("User Profile: " + userProfile);
    }

    // Using Supplier Interface
    private static UserProfile getUserProfile(String profileType, Supplier<UserProfile> defaultSupplier) {
        Supplier<UserProfile> userProfileSupplier = profileTemplates.getOrDefault(profileType, defaultSupplier);

        return userProfileSupplier.get();
    }
}