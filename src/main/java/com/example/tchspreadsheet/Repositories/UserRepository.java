package com.example.tchspreadsheet.Repositories;

import com.example.tchspreadsheet.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findById(long id);
}
