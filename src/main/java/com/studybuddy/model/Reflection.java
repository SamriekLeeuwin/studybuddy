package com.studybuddy.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalTime;

@Getter
@Entity
public class Reflection {

    // Getters and setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private LocalTime createdAt = LocalTime.now();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Update reflection notes
    public void updateNotes(String newContent) {
        this.content = newContent;
    }

    public void setTitle(String title) { this.title = title; }

    public void setContent(String content) { this.content = content; }

    public void setUser(User user) { this.user = user; }
}
