package com.example.parkingSystem.repository;

import com.example.parkingSystem.entity.Staffs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StaffsRepository extends JpaRepository<Staffs, Long> {

    /**
     * Retrieves a user by the username and password.
     *
     * @param Staffs the username.
     * @return the user if found, otherwise null.
     */
    //Optional<Staffs> findOneByEmailAndPassword(String phoneNumber, String password);


    /**
     * Retrieves a user by phone number.
     *
     * @param number the phone number.
     * @return the user if found, otherwise null.
     */
    Optional<Staffs> findByPhone(String phone);
}
