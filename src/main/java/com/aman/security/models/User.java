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
    private String roles;

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }


    public User(String name, String password) {
        this.username = name;
        this.password = password;

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
