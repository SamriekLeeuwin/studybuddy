package com.studybuddy.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Entity
public class Reflection {

    // Getters and setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Setter
    private String title;
    @Setter
    private String content;
    private LocalTime createdAt = LocalTime.now();

    @Setter
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Update reflection notes
    public void updateNotes(String newContent) {
        this.content = newContent;
    }

}
