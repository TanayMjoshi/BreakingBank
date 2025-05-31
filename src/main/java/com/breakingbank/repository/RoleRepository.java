package com.breakingbank.repository;

import com.breakingbank.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    /*
        RoleRepository manages CRUD for your Role entity.
findByName(String name) allows quick DB lookups by role name (like "ADMIN" or "USER").
As with UserRepository, Spring auto-implements this method based on naming convention.
     */

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
