package com.studybuddy.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Entity
public class Task {

    // Getters and setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String description;
    @Setter
    private String deadline;
    private LocalTime createdAt = LocalTime.now();
    private boolean done = false;

    @Setter
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Mark task as completed
    public void markAsDone() {
        this.done = true;
    }

    // Update task title
    public void updateTitle(String newTitle) {
        this.description = newTitle;
    }

}
