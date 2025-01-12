package com.example.parkingSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "staffs")
public class Staffs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long staff_id;

    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "dob", nullable = false)
    private String dob;

    @Column(name = "phone", nullable = false, unique = true)
    private String phone;

    public long getStaff_id() {
        return staff_id;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "address", nullable = false)
    private String address;


}
