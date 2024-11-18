package io.github.nathanjrussell;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap to store UserRecord objects
        HashMap<Integer, UserRecord> userMap = new HashMap<>();

        // Add some UserRecord objects to the map
        userMap.put(1, new UserRecord(1, "Alice", "Johnson", "alice.johnson@example.com"));
        userMap.put(2, new UserRecord(2, "Bob", "Smith", "bob.smith@example.com"));
        userMap.put(3, new UserRecord(3, "Charlie", "Brown", "charlie.brown@example.com"));

        // Look up a user by their userID
        int lookupID = 2;
        UserRecord foundUser = userMap.get(lookupID);

        // Print out the user information if found
        if (foundUser != null) {
            System.out.println("User found:");
            System.out.println("ID: " + foundUser.userID());
            System.out.println("First Name: " + foundUser.firstName());
            System.out.println("Last Name: " + foundUser.lastName());
            System.out.println("Email: " + foundUser.email());
        } else {
            System.out.println("User with ID " + lookupID + " not found.");
        }
    }
}
