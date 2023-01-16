package com.login.sistema.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.sistema.entities.User;

public interface UserRepository extends JpaRepository<User, UUID> {

  User findByEmail(String username);

}
