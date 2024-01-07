package com.example.coursespringsecurity;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserEntityRepository extends JpaRepository<User, Long> {

    Optional<UserEntity> findByMail(String mail);
}
