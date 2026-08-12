package org.example.sec_crud.domain.dto;

import lombok.Builder;
import lombok.Getter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.UUID;

@Getter
@Builder
public class CustomUserDetails implements UserDetails {
    private final Long id;
    private final UUID uuid;
    private final String username;
    private final String password;
    private final List<SimpleGrantedAuthority> authorities;
    private final boolean isActive;

    @Override
    public boolean isEnabled() {
        return isActive;
    }
}