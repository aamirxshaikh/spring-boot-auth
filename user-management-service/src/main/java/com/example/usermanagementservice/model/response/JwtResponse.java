package com.example.usermanagementservice.model.response;

import java.util.List;

public record JwtResponse(
        String token,
        String type,
        Long id,
        String username,
        String email,
        List<String> roles
) {
}
