package com.example.parkingSystem.repository;

import com.example.parkingSystem.entity.MyAppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MyAppUserRepository extends JpaRepository<MyAppUser, Integer> {

    Optional<MyAppUser> findByEmail(String username);
}
