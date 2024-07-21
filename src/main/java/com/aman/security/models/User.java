package com.aman.security.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class User {

    private String username;
    private String password;

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }




}
