package com.contrain.demo.registraton;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRegistrationCommand(
        @NotBlank(message = "Email cannot be blank") @Email(message = "Invalid email format") String email,
        @NotBlank(message = "Password cannot be blank") @Size(min = 8, message = "Password must be at least 8 characters long") String password,
        @NotBlank(message = "First name cannot be blank") String firstName,
        @NotBlank(message = "Last name cannot be blank") String lastName) {
}