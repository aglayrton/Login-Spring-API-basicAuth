package com.login.sistema.entities;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private UUID uid;
  private String email;
  private String password;
  private Boolean enable_boot;

  @OneToOne()
  @JoinColumn(name = "role_uid")
  public Role role;

  public User() {
  }

  public User(UUID uid, String email, String password, Boolean enable_boot, Role role) {
    this.uid = uid;
    this.email = email;
    this.password = password;
    this.enable_boot = enable_boot;
    this.role = role;
  }

  public UUID getUid() {
    return uid;
  }

  public void setUid(UUID uid) {
    this.uid = uid;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Boolean getEnable_boot() {
    return enable_boot;
  }

  public void setEnable_boot(Boolean enable_boot) {
    this.enable_boot = enable_boot;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

}
