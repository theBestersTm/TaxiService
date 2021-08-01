package com.mytask.TaxiService.data.repository;

import com.mytask.TaxiService.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
