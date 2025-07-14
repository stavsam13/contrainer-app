package com.contrain.demo.registraton;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record NewRegistrationRequest(@Email(message = "Invalid email format") @NotBlank
                                     String email, @NotBlank String firstName,
                                     @NotBlank String lastName,
                                     @NotBlank @Size(min = 8, message = "Password should be at least 8 characters long") String password) {
}
