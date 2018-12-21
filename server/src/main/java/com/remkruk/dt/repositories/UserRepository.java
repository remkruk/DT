package com.remkruk.dt.repositories;

import com.remkruk.dt.models.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserData, UUID> {
}
