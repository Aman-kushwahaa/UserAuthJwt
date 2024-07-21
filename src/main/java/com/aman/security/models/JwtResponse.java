package com.aman.security.models;


import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class JwtResponse {
    private String token;
    private String username;
}
