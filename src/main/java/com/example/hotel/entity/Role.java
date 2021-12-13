package com.example.hotel.entity;

public enum Role {
    ADMIN("Administrator"),
    CLIENT("Client");

    private final String name;

    Role(String name) {
        this.name = name;
    }
}
