package io.github.nathanjrussell;

public record UserRecord(
        int userID,
        String firstName,
        String lastName,
        String email
) {}
