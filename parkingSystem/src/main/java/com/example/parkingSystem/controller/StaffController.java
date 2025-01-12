package com.example.parkingSystem.controller;

import com.example.parkingSystem.entity.Staffs;
import com.example.parkingSystem.repository.StaffsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/parkingSystem/staff")
public class StaffController {

    @Autowired
    private StaffsRepository staffRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;  // Autowire PasswordEncoder instead of BCryptPasswordEncoder

    // Endpoint to save staff with encrypted password
    @PostMapping("/add")
    public String addStaff(@RequestBody Staffs staff) {
        // Encrypt the plain-text password before saving
        String plainPassword = staff.getPassword();
        String hashedPassword = passwordEncoder.encode(plainPassword);
        staff.setPassword(hashedPassword);

        staffRepository.save(staff);
        return "Staff added successfully with encrypted password!";
    }

    // Endpoint to retrieve staff by phone
    @GetMapping("/{phone}")
    public Staffs getStaffByPhone(@PathVariable String phone) {
        return staffRepository.findByPhone(phone).orElse(null);  // Simplified to use orElse
    }
}
