package com.example.parkingSystem.dto;

import lombok.Data;

@Data
public class LoginDto {
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String phoneNumber;
    private String password;
}
