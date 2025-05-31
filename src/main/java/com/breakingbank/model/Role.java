package com.breakingbank.model;

import jakarta.persistence.*;

import java.util.List;

    //Notes below
    /*
    mappedBy = "role" → tells JPA the owning side is User.role
    cascade = CascadeType.ALL → if a Role is saved/deleted, related users can be affected (optional for now)
    fetch = FetchType.LAZY → don't load users list unless explicitly needed (saves memory)
     */
@Entity
@Table(name = "roles")

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;


    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<User> users;

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    // Coming up: Getters & Setters

    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}



