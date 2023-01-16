package com.login.sistema.entities;

import com.login.sistema.dto.UserDto;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User extends BaseEntity implements UserDetails {

  private String email;
  private String password;
  private Boolean enableBoot;
  @OneToOne
  @JoinColumn(name = "uid")
  private DataProfile dataProfile;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "role_uid", referencedColumnName = "uid")
  public Role role;

  public User() {
  }

  public User(UUID uid, String email, String password, Boolean enableBoot, Role role) {
    this.setUid(uid);
    this.email = email;
    this.password = password;
    this.enableBoot = enableBoot;
    this.role = role;
  }

  public User(UserDto userDto) {
    this.email = userDto.getEmail();
    this.password = userDto.getPassword();
    this.enableBoot = userDto.getEnableBoot();
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

  public Boolean getEnableBoot() {
    return enableBoot;
  }

  public void setEnableBoot(Boolean enableBoot) {
    this.enableBoot = enableBoot;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public DataProfile getDataProfile() {
    return dataProfile;
  }

  public void setDataProfile(DataProfile dataProfile) {
    this.dataProfile = dataProfile;
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
