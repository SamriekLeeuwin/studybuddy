package com.studybuddy.model;

public enum Role {
    ADMIN("Administrator with full access", 1),
    TUTOR("Mentor helping guide students", 2),
    STUDENT("Learner focused on personal progress", 3),
    PARENT("Guardian with limited monitoring access", 4),
    GUEST("Anonymous user with restricted access", 5);

    private final String description;
    private final int priority;

    Role(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    /**
     * Checks if this role has  permissions to perform actions requiring a certain role.
     */
    public boolean hasPermission(Role requiredRole) {
        return this.priority <= requiredRole.getPriority();
    }
}