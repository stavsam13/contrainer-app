package com.contrain.demo.registraton;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/v1/users")
public class RegistrationController {

    @PostMapping
    public ResponseEntity<?> registerNewUser(@RequestBody @Validated UserRegistrationCommand request) {
        log.info("New Registration Request: {}", request);
        return ResponseEntity.ok().build();
    }
}
