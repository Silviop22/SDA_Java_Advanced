package al.sdacademy.functional.suplier;

import al.sdacademy.functional.suplier.model.EmployeeProfile;
import al.sdacademy.functional.suplier.model.StudentProfile;
import al.sdacademy.functional.suplier.model.UserProfile;

import java.util.HashMap;
import java.util.Map;

public class UserProfileManager {
    private static Map<String, Class<? extends UserProfile>> profileTemplates = new HashMap<>();

    static {
        profileTemplates.put("student", StudentProfile.class);
        profileTemplates.put("employee", EmployeeProfile.class);
    }

    public static void main(String[] args) {
        // Example usage
        String userInput = "employee"; // Assume user input (can come from user selection, etc.)

        // Using regular methods to get a new user profile based on user input or default if not found
        UserProfile userProfile = getUserProfile(userInput, UserProfile.class);

        // Print the result
        System.out.println("User Profile: " + userProfile);
    }

    // Using regular methods
    private static UserProfile getUserProfile(String profileType, Class<? extends UserProfile> defaultClass) {
        // Try to get a template class based on user input
        Class<? extends UserProfile> userProfileClass = profileTemplates.getOrDefault(profileType, defaultClass);

        try {
            return userProfileClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
