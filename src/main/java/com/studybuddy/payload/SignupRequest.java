package com.studybuddy.payload;

import com.studybuddy.model.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequest {
    private String username;
    private String password;
    private String email;
    private Role role = Role.STUDENT; // Standaardrol
}