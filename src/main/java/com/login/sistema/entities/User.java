package com.login.sistema.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User implements UserDetails{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID uid;
  private String email;
  private String password;
  private Boolean enable_boot;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "role_uid", referencedColumnName = "uid")
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

  @Override
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

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    //devo retornar uma lista de GrantedAuthority
    List<GrantedAuthority> authorities = new ArrayList<>();//cria uma lista de GrantedAuthority
    authorities.add(new SimpleGrantedAuthority(role.getName()));//add SimpleGrantedAuthority no GrantedAuthority
    return authorities;
  }

  @Override
  public String getUsername() {
    // TODO Auto-generated method stub
    return email;
  }

  @Override
  public boolean isAccountNonExpired() {
    // TODO Auto-generated method stub
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    // TODO Auto-generated method stub
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    // TODO Auto-generated method stub
    return true;
  }

  @Override
  public boolean isEnabled() {
    // TODO Auto-generated method stub
    return true;
  }

}
