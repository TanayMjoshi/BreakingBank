package com.breakingbank.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id // marks this as the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // means the DB auto-generates this value (like auto-increment).
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @ManyToOne(fetch = FetchType.EAGER) // means load role data immediately when loading user.
    @JoinColumn(name = "role_id") // tells JPA to use role_id as the foreign key column.
    private Role role;

    public User() {
    }

    public User(String username, String password, Role role){
        this.username = username;
        this.password = password;
        this.role = role;
    }

    //Coming up: Getters & Setters

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
