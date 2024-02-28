package com.example.demo2.repository;


import com.example.demo2.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    boolean existsByPhoneNumberOrAlternateContact(String phoneNumber, String alternateContact);
}
