package com.breakingbank.repository;

import com.breakingbank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    /*
        interface instead of class: lets Spring auto-generate method implementations.
JpaRepository gives ready-made methods like save(), findById(), delete(), etc.
findByUsername(String username) lets you query users by their username — Spring builds it just by method name!
    */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom queries here later, like:
    User findByUsername(String username);
}
