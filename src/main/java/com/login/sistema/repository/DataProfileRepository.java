package com.login.sistema.repository;

import com.login.sistema.entities.DataProfile;
import com.login.sistema.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DataProfileRepository extends JpaRepository<DataProfile, UUID> {
}
