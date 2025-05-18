package com.studybuddy.service;

import com.studybuddy.model.User;
import com.studybuddy.payload.SignupRequest;
import com.studybuddy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;

    public void registerUser(SignupRequest signupRequest) {
        // Mapping van DTO naar Entiteit
        User user = User.builder()
                .name(signupRequest.getUsername())
                .password(encoder.encode(signupRequest.getPassword()))
                .role(signupRequest.getRole())
                .accountNonExpired(true)
                .accountNonLocked(true)
                .credentialsNonExpired(true)
                .enabled(true)
                .build();


        userRepository.save(user);
    }
}