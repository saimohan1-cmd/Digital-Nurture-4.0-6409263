package com.example.jwt_auth.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.Collections;
import java.util.Date;

@RestController
public class AuthenticationController {

    private static final String SECRET = "uV4LgGjIX9wX0YtqT3kAq4JJtA8LBqM2JgfT6V8rMtc=";

    private final SecretKey key = Keys.hmacShaKeyFor(Base64.getDecoder().decode(SECRET));

    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestHeader("Authorization") String authHeader) {
        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            return ResponseEntity.status(401).build();
        }

        String base64Credentials = authHeader.substring("Basic ".length());
        String decoded = new String(Base64.getDecoder().decode(base64Credentials));
        String[] creds = decoded.split(":", 2);

        if (creds.length != 2 || !"user".equals(creds[0]) || !"pwd".equals(creds[1])) {
            return ResponseEntity.status(401).build();
        }

        String token = Jwts.builder()
                .setSubject(creds[0])
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 900_000)) 
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();

        return ResponseEntity.ok(Collections.singletonMap("token", token));
    }
}
