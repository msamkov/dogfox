package ru.multicon.dogfox.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class AuthenticationResponse {

    @Getter
    private final String jwt;
}
