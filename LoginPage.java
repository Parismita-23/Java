package Login;
import java.util.Scanner;

public class LoginPage {
    // Hardcoded user ID and password for demonstration purposes
    private static final String USER_ID = "admin";
    private static final String PASSWORD = "password123";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int attempts = 0;
            boolean isAuthenticated = false;

            System.out.println("=== Login Page ===");

            while (attempts < 3 && !isAuthenticated) {
                System.out.print("Enter User ID: ");
                String inputUserId = scanner.nextLine();

                System.out.print("Enter Password: ");
                String inputPassword = scanner.nextLine();

                if (inputUserId.isEmpty() || inputPassword.isEmpty()) {
                    System.out.println("User ID and password cannot be empty.");
                    continue;
                }

                if (inputUserId.equals(USER_ID) && inputPassword.equals(PASSWORD)) {
                    System.out.println("Login successful!");
                    isAuthenticated = true;
                } else {
                    attempts++;
                    System.out.println("Incorrect User ID or Password. Attempt " + attempts + " of 3.");
                }
            }

            if (!isAuthenticated) {
                System.out.println("Maximum attempts reached. Access denied.");
            }
        }
    }
}


