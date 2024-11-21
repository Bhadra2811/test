
public class ValidationUtils {

    // Method to validate email addresses
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email != null && email.matches(emailRegex);
    }

    // Method to validate passwords (example: minimum 8 characters)
    public static boolean isValidPassword(String password) {
        return password != null && password.length() >= 8;
    }
}
