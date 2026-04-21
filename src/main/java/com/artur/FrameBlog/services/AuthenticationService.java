package com.artur.FrameBlog.services;

import com.artur.FrameBlog.request.AuthRequest;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AuthenticationService extends UserDetailsService {
    String getToken(AuthRequest auth);

    String validateJwtToken(String token);
}
